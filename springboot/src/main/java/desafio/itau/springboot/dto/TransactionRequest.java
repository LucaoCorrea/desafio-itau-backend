package desafio.itau.springboot.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

  @NotNull
  private Double valor;
  @NotNull
  private OffsetDateTime dataHora;

  public double getValor() {
    return valor;
  }

  public OffsetDateTime getdataHora() {
    return dataHora;
  }

}
