package tests;

import сommon.FactsMethods;
import model.FactModel;
import model.UserModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.FactsRequest;

import java.util.List;

public class FactsTest {

    /** Достаем пользователей из фактов.
     * Сортируем факты по убыванию.
     * Сортируем факты, автором которого является Kasimir Schulz.
      */

    @Test
    public void factsTest() {
        List<FactModel> facts = FactsRequest.getFacts();
        List<UserModel> users = FactsMethods.getUsers(facts);
        List<List<FactModel>> sortedByUser = FactsMethods.sortFacts(facts, users);
        Assert.assertEquals(sortedByUser.get(0).get(0).getUser().getName().getFullName(), "Kasimir Schulz");
    }
}
