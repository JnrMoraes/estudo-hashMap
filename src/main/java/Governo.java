import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

    private Map<String, List<Politico>> partidosPoliticos;

    public Governo(Map<String, List<Politico>> partidosPoliticos) {
        this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    public Governo() {
    }

    public void adicionaPolitico(String partidoPolitico, Politico politico){
        // recupera a lista de políticos para um partido
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

        //se não existir uma lista de políticos para o partido informado,
        // devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
        if (politico == null){
            politicos = new ArrayList<Politico>();
        }

        // adiciona o político recebido como parâmetro à lista de políticos
        politicos.add(politico);

        // adiciona a lista de políticos ao mapa de partidos usando
        // como chave o nome do partido
        this.partidosPoliticos.put(partidoPolitico, politicos);

    }

    public void calcularGastosComSalario(String partidoPolitico) {
        // retornar BigDecimal
        // implementar busca de políticos para o partido informado
        // e cálculo dos salários
    }

    public void calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
        // retornar BigDecimal
        // implementar busca dos políticos para o partido e cargo informados
        // e cálculo dos salários
    }

}
