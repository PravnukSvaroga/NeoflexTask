package com.example.neoflextask.rest;

import com.example.neoflextask.dto.VacationPaymentRequest;
import com.example.neoflextask.dto.VacationPaymentResponse;
import com.example.neoflextask.service.VacationPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class VacationPaymentController {
    private final VacationPaymentService vacationPaymentService;

    @GetMapping("/calculate")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<VacationPaymentResponse> searchUsers(@Valid VacationPaymentRequest vacationPaymentRequest) {
        return ResponseEntity.ok(vacationPaymentService.calculate(vacationPaymentRequest));
    }

}