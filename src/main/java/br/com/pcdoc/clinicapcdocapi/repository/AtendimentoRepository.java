package br.com.pcdoc.clinicapcdocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pcdoc.clinicapcdocapi.model.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
    
}
