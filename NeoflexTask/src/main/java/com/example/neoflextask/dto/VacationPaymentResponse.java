package com.example.neoflextask.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VacationPaymentResponse {
    Double vacationPaymentAmount;
}