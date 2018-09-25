package project.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.domain.Category;
import project.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryResouce {

    private CategoryService service;

    public CategoryResouce(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories(){
       return ResponseEntity.ok(service.getAllCategories());
    }

}
