package za.co.migal.home.za.mongo.util;


import za.co.migal.home.za.mongo.model.BusinessEntity;
import za.co.migal.home.model.Business;
/**
 *
 * @author migal
 */
public class BusinessMapper{
    /**
   * 
   * @param inputBusiness
   * @return 
   */
  public BusinessEntity map(Business inputBusiness){
    BusinessEntity outputBusiness = new BusinessEntity();
    outputBusiness.setId(inputBusiness.getId());
    return outputBusiness;
  }
    /**
   * 
   * @param inputBusiness
   * @return 
   */
  public Business map(BusinessEntity inputBusiness){
    Business outputBusiness = new Business();
    outputBusiness.setId(inputBusiness.getId());
    return outputBusiness;
  }
}
