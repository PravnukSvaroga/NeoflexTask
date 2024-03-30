package com.example.neoflextask.dto;

import lombok.Value;

import javax.validation.constraints.Positive;

@Value
public class VacationPaymentRequest {
    @Positive
    Double averageMonthlyPayment;

    @Positive
    Integer daysAmount;
}
