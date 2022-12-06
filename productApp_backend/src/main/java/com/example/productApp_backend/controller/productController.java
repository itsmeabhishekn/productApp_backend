package com.example.productApp_backend.controller;

import com.example.productApp_backend.dao.EmployeeDao;
import com.example.productApp_backend.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {


    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String home()
    {
        return "this is home";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String search()
    {
        return "this is search page";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody ProductModel p)
    {
        System.out.println(p.getBrand().toString());
        System.out.println(p.getDistributor().toString());
        System.out.println(p.getExpdate().toString());
        System.out.println(p.getMandate().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getProdcode());
        System.out.println(p.getProdname());
        System.out.println(p.getSeller());
        dao.save(p);

        return "items added succesfully";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String edit()
    {
        return "this is edit page ";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<ProductModel> view()
    {


        return (List<ProductModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String delete()
    {
        return "this is delete page";
    }

}
