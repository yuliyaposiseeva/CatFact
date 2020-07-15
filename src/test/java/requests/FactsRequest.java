package requests;

import com.google.gson.Gson;
import model.*;
import org.apache.http.HttpStatus;

import java.util.List;

public class FactsRequest {
    /**
     * Посылаем пустой запрос на эндпоинт facts.
     * Преобразуем полученный body в список объектов Fact.
     */

    private static final String path = "/facts";

    public static List<FactModel> getFacts() {
        String response = PrepareRequest.prepareRequest()
                .get(path)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .extract()
                .asString();
         FactsModel allFacts = new Gson().fromJson(response, FactsModel.class);
         return allFacts.getAll();
    }
}
