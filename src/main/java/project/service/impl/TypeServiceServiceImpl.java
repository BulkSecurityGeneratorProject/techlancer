package project.service.impl;

import org.springframework.stereotype.Component;
import project.domain.TypeService;
import project.repository.TypeServiceRepository;
import project.service.TypeServiceService;

import java.util.List;

@Component
public class TypeServiceServiceImpl implements TypeServiceService {

    private TypeServiceRepository repository;

    public TypeServiceServiceImpl(TypeServiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TypeService> getServicesByCategory(Long id){
        return repository.findAllByCategoryId(id);
    }

}
