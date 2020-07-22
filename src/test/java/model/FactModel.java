package model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
 public class FactModel {

    // Индификатор факта
    @SerializedName("_id")
    String id;

    //Текст факта.
    String text;

    //Тип факта.
    String type;

    // Пользователь, написавший факт.
    UserModel user;
}