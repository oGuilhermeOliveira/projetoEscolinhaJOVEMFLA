package com.piaget.escola.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.piaget.escola.Models.Aluno;
import com.piaget.escola.Service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listarAlunos(){
        return  service.buscarAluno();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
    return  service.salvarNovoAluno(aluno);
    }

    @DeleteMapping("/{id}")
    public void excluirAluno(@PathVariable Long id) {
        service.deletarAluno(id);
    }


}
