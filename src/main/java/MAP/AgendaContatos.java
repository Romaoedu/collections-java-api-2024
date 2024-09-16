package MAP;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class AgendaContatos {

    Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {

        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {

            agendaContatoMap.remove(nome);

        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarNumeroPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Eduardo", 979008134);
        agendaContatos.adicionarContato("Lucas", 979654134);
        agendaContatos.adicionarContato("Maria", 999008856);

        agendaContatos.removerContato("Eduardo");

        System.out.println(agendaContatos.pesquisarNumeroPorNome("Maria"));
       // agendaContatos.exibirContato();
    }
}