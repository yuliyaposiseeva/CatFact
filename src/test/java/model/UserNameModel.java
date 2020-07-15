package model;

import lombok.Data;

@Data
public class UserNameModel {

    /** Имя пользователя. */
    String first;

    /** Фамилия Пользователя. */
    String last;

    /**
     * @return
     * Возвращаем полное имя пользователя.
     */

    public String getFullName() {
        return first + " " + last;
    }

}
