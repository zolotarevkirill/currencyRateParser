package ru.cbr.cbrservice.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class CurrencyRate {
    private String charCode;
    private LocalDateTime timestamp;
    private int numCode;
    private int nominal;
    private String name;
    private BigDecimal value;
    private BigDecimal vunitRate;
    private BigDecimal previousClose;
    private BigDecimal close;
}