package сommon;

import model.FactModel;
import java.util.*;
import java.util.stream.Collectors;

public class FactsMethods {

    /**
     * Метод определяет имя пользователя написавшего больше всего фактов.
     *
     * @param facts массив объектов класса FactsModel
     * @return имя пользователя в формате строки
     */
    public static String getUserName(List<FactModel> facts) {
        return facts.
                stream().
                collect(Collectors.groupingBy(FactModel::getFullName, Collectors.counting())).
                entrySet().
                stream().
                max(Map.Entry.comparingByValue()).
                get().
                getKey();
    }
}