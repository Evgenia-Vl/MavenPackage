package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.RestCalcService;

public class RestCalcServiseTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restcalc.csv")
    //@CsvSource({
    //        "2,100000,60000,150000",
    //        "3,10000,3000,20000"
    //})
    public void RestMonthCalcOne(int expected, int income, int expense, int threshold) {
        RestCalcService service = new RestCalcService();
        //    int income = 10_000;
        //    int expense = 3_000;
        //    int threshold = 20_000;
        //    int expected = 3;

        int count = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, count);
    }
//@Test
    //   public void RestMonthCalcSecond() {
    //   RestCalcService service = new RestCalcService();
    //   int income = 100_000;
    //   int expense = 60_000;
    //   int threshold = 150_000;
    //   int expected = 2;

    //   int count = service.calculate(100_000, 60_000, 150_000);
    //   Assertions.assertEquals(expected, count);
    //  }
}