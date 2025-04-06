package br.joaquim.acervo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.joaquim.acervo.entidade.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    public List<Livro> findByAutor(String autor);
    public List<Livro> findByAnoPublicacao(int ano);
    public List<Livro> findByTituloContaining(String titulo);
}