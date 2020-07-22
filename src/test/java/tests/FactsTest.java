package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import requests.FactsRequest;
import сommon.FactsMethods;


public class FactsTest {

    @Test(description = "Тест проверяет,что больше всего фактов написал Kasimir Schultz")

    public void factsTest() {
        String MostProductiveUserName = FactsMethods.getMostProductiveUserName(FactsRequest.getFacts());
        Assert.assertEquals(MostProductiveUserName, "Kasimir Schultz");
    }
}