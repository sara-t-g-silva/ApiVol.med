package med.vol.api.pacientes;

import med.vol.api.endereco.DadosEndereco;
import med.vol.api.medicos.Especialidade;

public record DadosCadastroPacientes(String nome,
                                     String email,
                                     String telefone,
                                     String cpf,
                                     DadosEndereco endereco) {
}
