package urban.broccoli.streamapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Specialist {
  private String name;
  private BigDecimal salary;
  private Specialty specialty;

}
