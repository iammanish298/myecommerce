package com.dlminds.repo;

import com.dlminds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productrepo extends JpaRepository<Product, Integer> {


}
