package com.MeuPrimeiroSpring.PrimeirosPassos.Repository;

import com.MeuPrimeiroSpring.PrimeirosPassos.Pessoas.Controller.Services.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Long> {

    Optional<PeopleModel> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
