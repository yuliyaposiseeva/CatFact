package сommon;

import model.FactModel;
import model.UserModel;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FactsMethods {
    /**
     * @param facts
     * @return
     *  Возвращаем пользователей из фактов
     */

    public static List<UserModel> getUsers(List<FactModel> facts) {
        List<UserModel> users = facts
                .stream()
                .map(FactModel::getUser)
                .collect(Collectors.toList());
        return dropDuplicates(users);
    }

    /**
     * @param users
     * @return
     * Удаляем дубликаты.
     */

    private static List<UserModel> dropDuplicates(List<UserModel> users) {
        return users
                .stream()
                .distinct()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    /**
     * @param facts
     * @param users
     * @return
     * Возвращаем массив массивов фактов и сортируем по убыванию.
     */

    public static List<List<FactModel>> sortFacts(List<FactModel> facts, List<UserModel> users) {
        return compareFactsByUsers(sortAllFactsByUsers(facts, users));
    }

    /**
     * @param facts
     * @param users
     * @return
     * Создаем массив массивов фактов, каждый подмассив содержит факты только одного пользователя.
     */

    private static List<List<FactModel>> sortAllFactsByUsers(List<FactModel> facts, List<UserModel> users) {
        return users.stream()
                .map(user -> sortedFactsByUser(facts, user))
                .collect(Collectors.toList());
    }

    /**
     * @param facts
     * @param user
     * @return
     * Метод возвращает только те факты, автором которых является переданный пользователь.
     */

    private static List<FactModel> sortedFactsByUser(List<FactModel> facts, UserModel user) {
        return facts
                .stream()
                .filter(fact -> user.equals(fact.getUser()))
                .collect(Collectors.toList());
    }

    /**
     * @param facts
     * @return
     * Метод сортирует массивы, от большего к меньшему.
     */

    private static List<List<FactModel>> compareFactsByUsers(List<List<FactModel>> facts) {
        return facts
                .stream()
                .sorted(((o1, o2) -> o2.size() - o1.size()))
                .collect(Collectors.toList());
    }
}
