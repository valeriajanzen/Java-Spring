package src.alura.forum.repository;

import org.springframework.data.domain.Page;
import src.alura.forum.modelo.Topico;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
    //para colocar o metodo no estilo que quiser, monte a query
   // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    //List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
