package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
    List<Topico> findByCursoNome(String nomeCurso);
    //para colocar o metodo no estilo que quiser, monte a query
   // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    //List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
