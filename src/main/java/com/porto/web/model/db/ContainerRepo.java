package com.porto.web.model.db;


import org.springframework.data.jpa.repository.JpaRepository;

import com.porto.web.model.Container;



public interface ContainerRepo extends JpaRepository<Container, Long> {

}
