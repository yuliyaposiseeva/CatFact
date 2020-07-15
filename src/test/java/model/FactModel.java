package model;

import lombok.Data;

@Data
public class FactModel {

    /** Индификатор факта. */
    String _id;

    /** Текст факта. */
    String text;

    /** Тип факта. */
    String type;

    /** Пользователь, написавший факт. */

    UserModel user;

}
