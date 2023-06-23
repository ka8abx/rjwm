package com.ssm_rjwm.dto;



import com.ssm_rjwm.entity.Setmeal;
import com.ssm_rjwm.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
