package model;

import lombok.Data;

@Data
public class FactModel {

    @SerializedName(value = "_id", alternate ="id")
    /** Индификатор факта. */
    String id;

    /** Текст факта. */
    String text;

    /** Тип факта. */
    String type;

    /** Пользователь, написавший факт. */

    UserModel user;


}
