package com.netzwerk.ecomm.controller;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.serv.EcomServImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/homepage")
public class EcomController {

    @Autowired
    private EcomServImpl serv;

    @ApiOperation("Save all")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody EcomDTO dto) {
        boolean saved = serv.save(dto);
        System.out.println(dto.getName());
//        System.out.println(dto.toString());
        if (saved){
//            model.addAttribute("DTO Saved");
            return "DTO Saved";
        }
        return "DTO not saved";
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public EcomDTO findById(@PathVariable Integer id) {
        EcomDTO  dto = serv.findById(id);
        System.out.println(dto);
        return dto;
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public List<EcomDTO> findByName(@RequestParam String name){

        return serv.findByName(name);
    }

    @RequestMapping(value = "/allDev", method = RequestMethod.GET)
    public List<EcomDTO> findAll( @RequestParam(defaultValue = "0") int pageMin,
                                  @RequestParam(defaultValue = "10") int pageMax,
                                  @RequestParam(defaultValue = "id") String sortBy,
                                  @RequestParam(defaultValue = "ASC") String sortDirection){

        Page<EcomDTO> page = serv.findAll(pageMin,pageMax,sortBy,sortDirection);
        return page.getContent();
    }
}
