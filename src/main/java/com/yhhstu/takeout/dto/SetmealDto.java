package com.yhhstu.takeout.dto;


import com.yhhstu.takeout.entity.Setmeal;
import com.yhhstu.takeout.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
