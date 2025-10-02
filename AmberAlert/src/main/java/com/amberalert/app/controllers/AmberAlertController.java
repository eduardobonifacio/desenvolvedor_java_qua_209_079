package com.amberalert.app.controllers;

import com.amberalert.app.models.Pessoa;
import com.amberalert.app.repository.AppRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AmberAlertController {
    @Autowired
    private AppRepository csr;
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/CriarAlerta", method=RequestMethod.GET)
    public String criarAlerta() {
        return "CriarAlerta";
    }
    
    @RequestMapping(value="/CriarAlerta", method=RequestMethod.POST)
    public String criarAlerta(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/CriarAlerta";
    }

    @RequestMapping(value="/Alertas", method=RequestMethod.GET)
    public ModelAndView Alertas() {
        ModelAndView mv = new ModelAndView("Alertas");
        Iterable<Pessoa> usuarios = csr.findAll();
        mv.addObject("usuarios", usuarios);
        return mv;
    }
    
    @RequestMapping(value="/alterarAlerta/{idPessoa}", method=RequestMethod.GET)
    public ModelAndView alterarAlerta(@PathVariable("idPessoa") long idPessoa) {
        Pessoa usuario = csr.findByIdPessoa(idPessoa);
        ModelAndView mv = new ModelAndView("alterarAlerta");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping(value="/alterarAlerta/{idPessoa}", method=RequestMethod.POST)
    public String alterarAlerta(@Validated Pessoa usuario, BindingResult result, RedirectAttributes attributes) {
        csr.save(usuario);
        return "redirect:/Alertas";
    }

    @RequestMapping("/confirmarExclusao/{idPessoa}") 
        public ModelAndView confirmarExclusao(@PathVariable("idPessoa") long idPessoa) {
            Pessoa usuario = csr.findByIdPessoa(idPessoa);
            ModelAndView mv = new ModelAndView("excluirAlerta");
            mv.addObject("usuario", usuario);
            return mv;
    }


    @RequestMapping("/excluirAlerta")
    public String excluirAlerta(long idPessoa) {
        Pessoa usuario = csr.findByIdPessoa(idPessoa);
        csr.delete(usuario);
        return "redirect:/Alertas";
    }
}
