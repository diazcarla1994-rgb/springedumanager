package cl.untec.springedumanager.service;

import cl.untec.springedumanager.model.Curso;
import cl.untec.springedumanager.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }
}