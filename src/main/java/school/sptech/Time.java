package school.sptech;

public class Time {
    String nome;
    Integer vitorias;
    Integer empates;
    Integer derrotas;

    public Time() {
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria() {
        vitorias += 1;
        System.out.println(vitorias);
    }

    public void registrarEmpate() {
        empates += 1;
        System.out.println(empates);
    }

    public void registrarDerrota() {
        derrotas += 1;
        System.out.println(derrotas);
    }

    public Integer getPontos() {
        int totalPontosVitorias = vitorias * 3;
        int totalPontosEmpates = empates * 1;
        int totalPontos = totalPontosEmpates + totalPontosVitorias;
        return totalPontos;
    }

    public Integer getTotalPartidas() {
        int totalPartidas = vitorias + empates + derrotas;
        return totalPartidas;
    }

    public Integer getAproveitamento() {
        int aproveitamento = (vitorias * 100 / getTotalPartidas());
        return aproveitamento;
    }

    public void compararAproveitamento(Time adversario) {
        Integer aproveitamento1 = getAproveitamento();
        Integer aproveitamento2 = adversario.getAproveitamento();

        if (aproveitamento1 > aproveitamento2) {
            System.out.println("O aproveitamento do time 1 é maior que o aproveitamento do time 2");
        } else{
                System.out.println("O aproveitamento do time 2 é maior que o aproveitamento do time 1");
            }
    }

    public void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(vitorias);
        System.out.println(empates);
        System.out.println(derrotas);
        System.out.println(getPontos());
        System.out.println(getTotalPartidas());
        System.out.println(getAproveitamento());
    }

}
