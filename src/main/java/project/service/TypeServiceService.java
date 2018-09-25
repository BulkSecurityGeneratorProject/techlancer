package project.service;

import project.domain.TypeService;

import java.util.List;

public interface TypeServiceService {

    List<TypeService> getServicesByCategory(Long id);

}
