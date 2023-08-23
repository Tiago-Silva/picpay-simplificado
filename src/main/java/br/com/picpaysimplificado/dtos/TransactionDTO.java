package br.com.picpaysimplificado.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
