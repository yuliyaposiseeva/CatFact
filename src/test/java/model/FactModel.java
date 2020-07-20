package model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class FactModel {

    // Через метод SerializedName, меняем имя ключа.
    @SerializedName("_id")

    // Индификатор факта.
    String id;

    //Текст факта.
    String text;

    //Тип факта.
    String type;

    // Пользователь, написавший факт.
    UserModel user;

    /**
     * Метод возвращает полное имя пользователя.
     * @return полное имя пользователя
     */
    public String getFullName() {
        return user.name.getFirst() + user.name.getLast();
    }
}

@Data
class UserModel {

    // Индификатор пользователя.
    String id;

    // Имя пользователя.
    UserNameModel name;

}

@Data
class UserNameModel {

    // Имя пользователя.
    String first;

    // Фамилия пользователя.
    String last;
}