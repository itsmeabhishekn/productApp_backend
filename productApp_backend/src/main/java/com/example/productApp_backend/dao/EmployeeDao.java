package com.example.productApp_backend.dao;


import com.example.productApp_backend.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<ProductModel,Integer> {

}
