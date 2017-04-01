package za.co.migal.home.za.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
/**
 *
 * @author migal
 */
@Data
public class BusinessEntity {
  @Id
  private long id;
}
