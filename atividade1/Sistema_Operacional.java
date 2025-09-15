public class Sistema_Operacional {
    private Computador computador;

    public Sistema_Operacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSsd()) {
            System.out.println("Erro: não há espaço suficiente no SSD.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRam()) {
            System.out.println("Erro: não há memória RAM suficiente.");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() / ((float)computador.getOperacoesPorSegundo() * computador.getNucleos());


        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}
