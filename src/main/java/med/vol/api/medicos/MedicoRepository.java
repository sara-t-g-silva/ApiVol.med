package med.vol.api.medicos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {// O primeiro será o tipo da entidade trabalhada pelo repository, Medico, e o tipo do atributo da chave primária da entidade, Long{
}
