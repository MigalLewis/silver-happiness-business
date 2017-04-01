package za.co.migal.home.za;

import za.co.migal.home.BusinessModule;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import za.co.migal.home.za.mongo.util.BusinessMapper;
import za.co.migal.home.za.mongo.repository.BusinessRepository;
import za.co.migal.home.model.Business;
import za.co.migal.home.za.mongo.model.BusinessEntity;


@Component
public class BusinessModuleImpl implements BusinessModule{

    private BusinessMapper mapper;
    private BusinessRepository repository;

    @Override
    public String sayHello() {
        return "Hello from South Africa";
    }
    @Override
    public void addBusiness(Business model){
      repository.save(mapper.map(model));
    }

    @Override
    public void removeBusiness(long id){
      repository.delete(Long.toString(id));
    }

    @Override
    public Business findBusiness(long id){
      return mapper.map(repository.findById(id));
    }
    
    @Override
    public Business editBusiness(Business model){
      BusinessEntity entity=repository.save(mapper.map(model));
      return mapper.map(entity);
    }

    @Autowired
    public void setMapper(BusinessMapper mapper){
      this.mapper=mapper;
    }
    @Autowired
    public void setRepository(BusinessRepository repository){
      this.repository=repository;
    }
}
