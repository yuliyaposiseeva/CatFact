package model;

import lombok.Data;

@Data
public class UserModel {

    // Индификатор пользователя.
    String id;

    // Имя пользователя.
    UserNameModel name;

}
