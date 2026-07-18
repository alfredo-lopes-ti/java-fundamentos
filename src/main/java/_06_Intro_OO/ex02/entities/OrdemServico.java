package _06_Intro_OO.ex02.entities;

public class OrdemServico {

    private int numeroOS;
    private String nomeCliente;
    private double horasTrabalhadas;
    private double valorHoraConsultor;

    // O Construtor recebe o que é OBRIGATÓRIO para a OS existir
    public OrdemServico(int numeroOS, String nomeCliente, double horasTrabalhadas, double valorHoraConsultor) {
        this.numeroOS = numeroOS;
        this.nomeCliente = nomeCliente;
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHoraConsultor(valorHoraConsultor);
    }

    // Getters e Setters
    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if (horasTrabalhadas < 0) {
            throw new IllegalArgumentException("O número de horas trabalhadas não pode ser negativo.");
        } else {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double getValorHoraConsultor() {
        return valorHoraConsultor;
    }

    public void setValorHoraConsultor(double valorHoraConsultor) {
        if (valorHoraConsultor < 0) {
            throw new IllegalArgumentException("O valor da hora do consultor não pode ser negativo.");
        } else {
            this.valorHoraConsultor = valorHoraConsultor;
        }
    }

    // Método para calcular o valor total da ordem de serviço
    public double calcularValorTotal() {
        return horasTrabalhadas * valorHoraConsultor;
    }

}
