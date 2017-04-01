package za.co.migal.home.za.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.migal.home.za.mongo.model.BusinessEntity;
/**
 *
 * @author migal
 */
public interface BusinessRepository extends MongoRepository<BusinessEntity, String>{
    /**
   * 
   * @param id
   * @return 
   */
  public BusinessEntity findById(long id);
}
