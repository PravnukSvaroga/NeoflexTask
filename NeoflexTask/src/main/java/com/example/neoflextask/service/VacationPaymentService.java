package com.example.neoflextask.service;

import com.example.neoflextask.dto.VacationPaymentRequest;
import com.example.neoflextask.dto.VacationPaymentResponse;
import org.springframework.stereotype.Service;

@Service
public class VacationPaymentService {
    private final static int AVERAGE_NUMBER_DAYS_IN_MONTH = 30;
    public VacationPaymentResponse calculate(VacationPaymentRequest vacationPaymentRequest){
        Double vacationPaymentAmount = vacationPaymentRequest.getAverageMonthlyPayment() /
        AVERAGE_NUMBER_DAYS_IN_MONTH * vacationPaymentRequest.getDaysAmount();
        return VacationPaymentResponse.builder().vacationPaymentAmount(vacationPaymentAmount).build();
    }
}
