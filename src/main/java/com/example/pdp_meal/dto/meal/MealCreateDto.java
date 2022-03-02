package com.example.pdp_meal.dto.meal;

import com.example.pdp_meal.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.time.Instant;

/**
 * @author Bekpulatov Shoxruh, Wed 10:56 PM. 3/2/2022
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealCreateDto implements BaseDto {
    @Column(nullable = false)
    private String name;

    private String pathPhoto;

    private Instant createDate = Instant.now();

    private String fileId;

    private String ingredient;

}
