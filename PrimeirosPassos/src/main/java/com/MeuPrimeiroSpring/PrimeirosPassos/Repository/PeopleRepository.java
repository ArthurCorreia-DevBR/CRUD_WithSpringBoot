package com.MeuPrimeiroSpring.PrimeirosPassos.Repository;

import com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Long> {
}
