package com.example.countingString.service;

import com.example.countingString.models.InputString;
import com.example.countingString.models.Result;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CounterStringServiceImpl implements CounterStringService {

  @Override
  public Result getResultByInputString(InputString inputString) {
    Map<Character, Integer> resultMap = inputString
        .getInputString()
        .chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toMap(
            character -> character,
            character -> 1,
            Integer::sum
        ))
        .entrySet()
        .stream()
        .sorted(
            Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(
            Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new));
    return new Result(resultMap);
  }
}
