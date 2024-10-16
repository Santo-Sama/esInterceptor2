package com.example.esInterceptor2.controllers;
import com.example.esInterceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("/read")
    public ResponseEntity<Month> getMonth(HttpServletRequest request){
        Month month = (Month) request.getAttribute("MonthInterceptor-month");
        return ResponseEntity.ok().body(month);
    }
}
