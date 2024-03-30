package com.example.neoflextask;

import com.example.neoflextask.dto.VacationPaymentRequest;
import com.example.neoflextask.dto.VacationPaymentResponse;
import com.example.neoflextask.service.VacationPaymentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class VacationPaymentServiceTest {
    private final static int AVERAGE_NUMBER_DAYS_IN_MONTH = 30;


    @Test
    void calculate() {
        Double averageMonthlyPayment = new Random().nextDouble();
        Integer daysAmount = new Random().nextInt();
        VacationPaymentRequest testRequest = new VacationPaymentRequest(averageMonthlyPayment, daysAmount);

        VacationPaymentService testService = new VacationPaymentService();
        VacationPaymentResponse testResponse = testService.calculate(testRequest);

        Double actual = calculate(averageMonthlyPayment, daysAmount);
        Double expected = testResponse.getVacationPaymentAmount();

        Assertions.assertEquals(actual, expected);
    }

    private Double calculate(Double averageMonthlyPayment, Integer daysAmount) {
        return averageMonthlyPayment / AVERAGE_NUMBER_DAYS_IN_MONTH * daysAmount;
    }
}