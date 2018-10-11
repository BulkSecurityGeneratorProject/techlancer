package project.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.domain.TypeService;
import project.service.TypeServiceService;

import java.util.List;

@RestController
@RequestMapping("services")
public class TypeServiceResource {

    private TypeServiceService service;

    public TypeServiceResource(TypeServiceService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TypeService>> getTypeServiceByCategory(@RequestParam(value = "categoryId") String categoryId){
        return ResponseEntity.ok(service.getServicesByCategory(Long.valueOf(categoryId)));
    }


}
