package med.vol.api.medicos;

import med.vol.api.endereco.DadosEndereco;

//record é uma classe imultável e o java cria os getters e setters por debaixo dos panos,
// sem a necessidade de estar digitando tanto, a classe fica mais enxuta.
public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
