import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat formatador = new DecimalFormat("R$#,##0.00");

        Governo governo = new Governo();

        Cargo vereador = new Cargo();
        vereador.setDescricao("Vereador");
        vereador.setSalario(new BigDecimal(16000));

        // cargos
        Cargo deputadoEstadual = new Cargo();
        deputadoEstadual.setDescricao("Deputado estadual");
        deputadoEstadual.setSalario(new BigDecimal(25000));

        Cargo prefeito = new Cargo();
        prefeito.setDescricao("Prefeito");
        prefeito.setSalario(new BigDecimal(27000));

        // adiciona vereadores
        Politico politico = new Politico();
        politico.setNome("João das Couves");
        politico.setCargo(vereador);
        governo.adicionaPolitico("RBLH", politico);

        politico = new Politico();
        politico.setNome("Zé Mané");
        politico.setCargo(vereador);
        governo.adicionaPolitico("PCOR", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionaPolitico("LDRS", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionaPolitico("LDRS", politico);

        // adiciona deputados estaduais
        politico = new Politico();
        politico.setNome("Josefa Silva");
        politico.setCargo(deputadoEstadual);
        governo.adicionaPolitico("LDRS", politico);
        politico = new Politico();
        politico.setNome("Fátima Gonçalves");
        politico.setCargo(deputadoEstadual);
        governo.adicionaPolitico("PCOR", politico);

        // adiciona prefeito
        politico = new Politico();
        politico.setNome("Sebastião Mendes");
        politico.setCargo(prefeito);
        governo.adicionaPolitico("PCOR", politico);


        // resolver implantação
//        // calcula gastos com partidos
//        BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
//        System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));
//
//        BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
//        System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));
//
//        // calcula gastos com partidos para determinados cargos
//        BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
//        System.out.println("Gastos com vereadores do partido LDRS: "
//                + formatador.format(gastosVereadoresLdrs.doubleValue()));
//
//        BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
//        System.out.println("Gastos com deputados estaduais do partido LDRS: "
//                + formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));
//
//        BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
//        System.out.println("Gastos com prefeitos do partido LDRS: "
//                + formatador.format(gastosPrefeitosLdrs.doubleValue()));
    }
}
