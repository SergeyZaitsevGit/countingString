package com.example.countingString.controller;

import com.example.countingString.models.InputString;
import com.example.countingString.models.Result;
import com.example.countingString.service.CounterStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CounterStringController {

  @Autowired
  CounterStringService counterStringService;

  @PostMapping("/count-string")
  public ResponseEntity<Result> calculateFrequency(@RequestBody InputString inputString) {
    Result result = counterStringService.getResultByInputString(inputString);
    return ResponseEntity.ok(result);
  }
}
