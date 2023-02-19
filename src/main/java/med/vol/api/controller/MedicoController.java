package med.vol.api.controller;



import med.vol.api.medicos.DadosCadastroMedicos;
import med.vol.api.medicos.Medico;
import med.vol.api.medicos.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository; //injeção de dependências

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){
        repository.save(new Medico(dados));
    };
    }



