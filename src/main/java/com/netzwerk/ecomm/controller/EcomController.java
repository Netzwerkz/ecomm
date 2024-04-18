package com.netzwerk.ecomm.controller;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.serv.EcomServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homepage")
public class EcomController {

    @Autowired
    private EcomServImpl serv;

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
}
