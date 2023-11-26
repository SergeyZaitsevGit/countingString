package com.example.countingString.sevice;

import com.example.countingString.models.InputString;
import com.example.countingString.models.Result;
import com.example.countingString.service.CounterStringServiceImpl;
import java.util.LinkedHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Map;

import static org.mockito.Mockito.when;

public class CounterStringServiceImplTest {

  @Mock
  private InputString inputString;

  private CounterStringServiceImpl counterStringService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);
    counterStringService = new CounterStringServiceImpl();
  }

  @Test
  public void testGetResultByInputString() {
    when(inputString.getInputString()).thenReturn("aabbbcccdde");

    Result result = counterStringService.getResultByInputString(inputString);

    Map<Character, Integer> expectedMap = new LinkedHashMap<>();
    expectedMap.put('b', 3);
    expectedMap.put('c', 3);
    expectedMap.put('a', 2);
    expectedMap.put('d', 2);
    expectedMap.put('e', 1);

    Assertions.assertEquals(expectedMap, result.getResult());
  }

  @Test
  public void testGetResultByInputStringWithEmptyString() {
    when(inputString.getInputString()).thenReturn("");

    Result result = counterStringService.getResultByInputString(inputString);

    Assertions.assertTrue(result.getResult().isEmpty());
  }

}