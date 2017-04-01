/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home;

import za.co.migal.home.model.Business;

public interface BusinessModule{

    public String sayHello();

    public void addBusiness(Business model);

    public void removeBusiness(long id);

    public Business findBusiness(long id);
    
    public Business editBusiness(Business model);
}
