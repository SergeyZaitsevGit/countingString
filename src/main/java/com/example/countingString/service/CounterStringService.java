package com.example.countingString.service;

import com.example.countingString.models.InputString;
import com.example.countingString.models.Result;

public interface CounterStringService {
  Result getResultByInputString(InputString inputString);
}
