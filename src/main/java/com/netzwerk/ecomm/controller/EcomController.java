package com.netzwerk.ecomm.controller;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.serv.EcomServImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/homepage")
public class EcomController {

    @Autowired
    private EcomServImpl serv;

    @ApiOperation("Save all")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody EcomDTO dto) {

        String processor = dto.getProcessor();
        String encodeProcessor = Base64.getEncoder().encodeToString(processor.getBytes());
        dto.setProcessor(encodeProcessor);
        System.err.println("encodeProcessor : " + encodeProcessor);

        String uniqueId = dto.getUniqueId();
        String encodeUniqueId = Base64.getEncoder().encodeToString(uniqueId.getBytes());
        dto.setUniqueId(encodeUniqueId);
        System.err.println("encodeUniqueId : " + encodeUniqueId);

        System.out.println(dto.toString());

        boolean saved = serv.save(dto);

//        System.out.println(dto.getName());
//        System.out.println(dto.toString());
        if (saved) {
//            model.addAttribute("DTO Saved");
            return "DTO Saved";
        }
        return "DTO not saved";
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public EcomDTO findById(@PathVariable Integer id) {
        EcomDTO dto = serv.findById(id);

        String processor = dto.getProcessor();
        byte[] decodedProcessor = Base64.getDecoder().decode(processor);
        String decodedString1 = new String(decodedProcessor);
        dto.setProcessor(decodedString1);
        System.err.println("decodedString : " + dto.getProcessor());

        String uniqueId = dto.getUniqueId();
        byte[] decodedUniqueId = Base64.getDecoder().decode(uniqueId);
        String decodedString2 = new String(decodedUniqueId);
        dto.setUniqueId(decodedString2);
        System.err.println("decodedString : " + decodedString2);

        System.out.println(dto);
        return dto;
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public List<EcomDTO> findByName(@RequestParam String name) {

        return serv.findByName(name);
    }

    @RequestMapping(value = "/allDev", method = RequestMethod.GET)
    public List<EcomDTO> findAll(@RequestParam(defaultValue = "0") int pageMin,
                                 @RequestParam(defaultValue = "10") int pageMax,
                                 @RequestParam(defaultValue = "id") String sortBy,
                                 @RequestParam(defaultValue = "ASC") String sortDirection) {

        Page<EcomDTO> page = serv.findAll(pageMin, pageMax, sortBy, sortDirection);
        return page.getContent();
    }
}
