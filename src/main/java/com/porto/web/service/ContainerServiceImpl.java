package com.porto.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.porto.web.model.Container;
import com.porto.web.model.db.ContainerRepo;

@Service
public class ContainerServiceImpl implements ContainerService {

    @Autowired
    private ContainerRepo containerRepo;

    @Override
    public List<Container> listarContainers() {
        return containerRepo.findAll();
    }

    @Override
    public Container salvarContainers(Container container) {
        return containerRepo.save(container);
    }

    @Override
    public Container getById(Long id) {
        return containerRepo.findById(id).get();
    }

    @Override
    public void apagaContainer(Long id) {
        containerRepo.deleteById(id);
    }

}
