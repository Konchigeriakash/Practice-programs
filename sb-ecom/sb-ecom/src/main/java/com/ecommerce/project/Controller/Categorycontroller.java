package com.ecommerce.project.Controller;

import com.ecommerce.project.Controller.Model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Categorycontroller {

    private List<Category> categories = new ArrayList<>();

    @GetMapping("/api/public/category")
    public List<Category> getallcategory() {
        return categories;
    }

    @PostMapping("/api/public/category")
    public String createcategory(@RequestBody Category category) {
        categories.add(category);
        return "Category added successfully";
    }
}