package za.co.migal.home.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.migal.home.BusinessModule;
import za.co.migal.home.model.Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author migal
 */
@RestController
@RequestMapping(path = "/rest/Business", produces = "application/json" )
public class BusinessController {

    @Autowired
    private BusinessModule module;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ApiOperation(value = "Says hello.")
    public String hello() {
        return module.sayHello();
    }
    /**
    *
    * @param id
    * @return
    */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Finds Business by id")
    @ResponseBody
    public Business findBusiness(@PathVariable long id) {
      return module.findBusiness(id);
    }
   /**
    *
    * @param request
    */
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Adds a Business")
    @ResponseBody
    public void addBusiness(@RequestBody Business request){
      module.addBusiness(request);
    }
   /**
    *
    * @param id
    */
    @RequestMapping(method = RequestMethod.DELETE , value = "/{id}")
    @ApiOperation(value = "Removes an Business")
    public void deleteBusiness(@PathVariable long id){
      module.removeBusiness(id);
    }
    /**
    *
    * @param request
    * @return
    */
    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "edits a Business")
    @ResponseBody
    public Business updateBusiness(@RequestBody Business request){
      return module.editBusiness(request);
    }


}
