package br.Guilherme.acervo.entidade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.context.annotation.Lazy;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Biblioteca {
    @Id
    private long id;
    private String nome;
    @OneToMany(fetch = FetchTtype.EAGER,mappedBy="biblioteca")
    private List<Livro> livros;
}
