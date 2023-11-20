package com.study.jpa.chapter01_basic.repository;

import com.study.jpa.chapter01_basic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { //제네릭: 엔티티, PK의 객체형 타입



}
