package br.Guilherme.acervo.entidade;

import org.springframework.context.annotation.Lazy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="livros")
public class Livro {
    @Id
    private long id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="biblioteca_id", nullable=false)
    private Biblioteca biblioteca;
}

