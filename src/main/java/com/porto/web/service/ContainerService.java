package com.porto.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.porto.web.model.Container;

@Service
public interface ContainerService {
    public List<Container> listarContainers();

    public Container salvarContainers(Container container);

    public Container getById(Long id);

    public void apagaContainer(Long id);

}
