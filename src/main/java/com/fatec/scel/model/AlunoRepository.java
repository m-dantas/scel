package com.fatec.scel.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	@Query("SELECT l FROM Aluno l WHERE l.ra = :ra")
	public Aluno findByRa(@Param("ra") String ra);
}
