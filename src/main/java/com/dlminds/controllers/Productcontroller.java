package com.dlminds.controllers;
import com.dlminds.entity.Product;
import com.dlminds.repo.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class Productcontroller {

    @Autowired
    private productrepo prorepo;

    @PostMapping
    public Product save(@RequestBody Product product){
    return prorepo.save(product);
    }

    @GetMapping
    public List<Product> findAll(){
        return prorepo.findAll();
    }


    @PostMapping
    public Product update(@RequestBody Product product){
        return prorepo.save(product);
    }

    @DeleteMapping("/{id}")
    public String Deletebyid( @PathVariable Integer id ){
        prorepo.deleteById(id);
        return "Product is Deleted Sucessfully";
    }



}
