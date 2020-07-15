package model;

import lombok.Data;

@Data
public class UserModel {

    /** Индификатор пользователя. */
    String _id;

    /** Имя пользователя. */
    UserNameModel name;

}
