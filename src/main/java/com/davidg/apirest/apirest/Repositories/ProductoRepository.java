package com.davidg.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidg.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
