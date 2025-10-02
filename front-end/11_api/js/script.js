const btn = document.querySelector('form');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const pesquisaCep =  document.querySelector('#cep');
let valor = document.querySelector('#cep').value;

// limpar form
const limpa_formulario_cep = () => {
    document.querySelector('#estado').value=('');
    document.querySelector('#cidade').value=('');
    document.querySelector('#bairro').value=('');
    document.querySelector('#logradouro').value=('');

}

function meu_callback(conteudo) {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value=(conteudo.uf);
        document.querySelector('#cidade').value=(conteudo.localidade);
        document.querySelector('#bairro').value=(conteudo.bairro)
        document.querySelector('#logradouro').value=(conteudo.logradouro)
    }
    else {
        limpa_formulario_cep();
        alert("CEP nao encontrado");
    }
}

// eventos

telefoneMask.addEventListener('input', function() {
    this.value = this.value
    .replace(/\D/g, ``)
    .replace(/(\d{2})(\d)/, '$1 $2')
    .replace(/(\d{4,5})(\d)/, '$1-$2')
    .replace(/(-\d{4})\d+?$/, '$1');
});

cepMask.addEventListener('input', function() {
    this.value = this.value
    .replace(/\D/g, ``)
    .replace(/(\d{5})(\d)/, '$1-$2')
    //.replace(/(-\d{3})\d+?$/, '$1'); // nao necessario se usar mascara na externa como no html com maxLength
});

pesquisaCep.addEventListener('blur', function(event) {

    let valor = event.target.value; 
    let cep = valor.replace(/\D/g, '');
        if (cep != "") {

            let validacep = /^[0-9]{8}$/;

            if (validacep.test(cep)) {
                document.querySelector('#estado').value="...";
                document.querySelector('#cidade').value="...";
                document.querySelector('#bairro').value="...";
                document.querySelector('#logradouro').value="...";

                let script = document.createElement('script');

                script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';
                
                document.body.appendChild(script);
            } else {
                limpa_formulario_cep(); 
                alert("Formato Invalido")} 
        }  else {
            //cep sem valor, limpa formulário.
            limpa_formulario_cep();
             }
});




btn.addEventListener('submit', function (event) {
    event.preventDefault();

    let nome = document.querySelector('#nome').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;

    let dados = `Dados do usuario: <br><br> 
                Nome: ${nome}.<br>
                Telefone: ${telefone}.<br>
                Cep: ${cep}.<br>
                Estado: ${estado}.<br>
                Cidade: ${cidade}.<br>
                Bairro: ${bairro}.<br>
                Logadouro: ${logradouro}.<br>
                Complemento: ${complemento}.<br>
                Numero: ${numero}.<br>
                `;
    document.querySelector('#dados').innerHTML = dados;
});