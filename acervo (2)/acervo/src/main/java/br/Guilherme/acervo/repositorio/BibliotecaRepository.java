package br.joaquim.acervo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.joaquim.acervo.entidade.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
    
}
