import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Tratamento acompanhado por um fisioterapeuta.
 */
public class Tratamento {
    private LocalDate iniciadoEm;
    private LocalDate finalizadoEm;
    private String nome;

    public Tratamento(String nome, LocalDate dataInicio) {
        this.nome = nome;
        this.iniciadoEm = dataInicio;
        this.finalizadoEm = null;
    }

    /**
     * Finaliza o tratamento na data de hoje (LocalDate.now()).
     * @return dias entre início e finalização
     */
    public int finalizar() {
        this.finalizadoEm = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(iniciadoEm, finalizadoEm);
    }

    /**
     * Dias desde a finalização até hoje.
     * @return -1 se o tratamento ainda não foi finalizado
     */
    public int diasAposFinalizacao() {
        // se finalizadoEm == null, devolver -1; senão, dias entre finalizadoEm e LocalDate.now()
        if(finalizadoEm == null){
            return -1;
        }else{
            return (int) ChronoUnit.DAYS.between(finalizadoEm, LocalDate.now());
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " | inicio=" + iniciadoEm + " | fim=" + finalizadoEm;
    }
}
