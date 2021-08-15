package com.dio.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public  class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
        public long getIdBancoHoras() {
            return idBancoHoras;
        }
        public long getIdUsuario() {
            return idUsuario;
        }
        public void setIdUsuario(long idUsuario) {
            this.idUsuario = idUsuario;
        }
        public long getIdMovimentacao() {
            return idMovimentacao;
        }
        public void setIdMovimentacao(long idMovimentacao) {
            this.idMovimentacao = idMovimentacao;
        }
        public void setIdBancoHoras(long idBancoHoras) {
            this.idBancoHoras = idBancoHoras;
        }
    }
    @EmbeddedId
    private BancoHorasId bancoHorasId;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
    public LocalDateTime getDataTrabalhada() {
        return dataTrabalhada;
    }
    public BigDecimal getSaldoHoras() {
        return saldoHoras;
    }
    public void setSaldoHoras(BigDecimal saldoHoras) {
        this.saldoHoras = saldoHoras;
    }
    public BigDecimal getQuantidadeHoras() {
        return quantidadeHoras;
    }
    public void setQuantidadeHoras(BigDecimal quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    public void setDataTrabalhada(LocalDateTime dataTrabalhada) {
        this.dataTrabalhada = dataTrabalhada;
    }
}