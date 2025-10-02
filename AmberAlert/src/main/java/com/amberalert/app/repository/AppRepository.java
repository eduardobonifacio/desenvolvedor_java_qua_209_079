package com.amberalert.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.amberalert.app.models.Pessoa;

public interface AppRepository extends CrudRepository<Pessoa, Long>{
    Pessoa findByIdPessoa(long idPessoa);
    Pessoa deleteByIdPessoa(long idPessoa);
}

