package com.example.countingString.models;

import java.util.LinkedHashMap;
import java.util.Map;

public class Result {

  private final Map<Character, Integer> result;

  public Result(Map<Character, Integer> result) {
    this.result = result;
  }

  public Map<Character, Integer> getResult() {
    return new LinkedHashMap<>(result);
  }
}
