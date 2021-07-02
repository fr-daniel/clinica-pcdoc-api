package br.com.pcdoc.clinicapcdocapi.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcdoc.clinicapcdocapi.model.Atendimento;
import br.com.pcdoc.clinicapcdocapi.repository.AtendimentoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {
    
    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @GetMapping
    public List<Atendimento> listar() {
        return atendimentoRepository.findAll(); 
    }

    @PostMapping
    public Atendimento adicionar(@RequestBody Atendimento atendimento) {
        atendimento.setDataAtendimento(LocalDateTime.now());
        return atendimentoRepository.save(atendimento);
    }

}
