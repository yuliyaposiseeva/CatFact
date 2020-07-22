package model;

import lombok.Data;

@Data
public class UserNameModel {

    // Имя пользователя.
    String first;

    // Фамилия пользователя.
    String last;


   public String getFullName() {
        return first+""+last;
    }
}
