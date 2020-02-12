package pt.goncalo.springplayground.CucumberTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sample {

    private Integer Id;
    private String name;
    private Integer value;
}
