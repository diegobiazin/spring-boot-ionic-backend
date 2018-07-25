package com.diegobiazin.cursomc.repositories;

import com.diegobiazin.cursomc.domain.Cidade;
import com.diegobiazin.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
