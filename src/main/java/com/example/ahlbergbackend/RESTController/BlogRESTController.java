package com.example.ahlbergbackend.RESTController;

import com.example.ahlbergbackend.model.AboutModel;
import com.example.ahlbergbackend.model.BlogModel;
import com.example.ahlbergbackend.model.Tour;
import com.example.ahlbergbackend.repos.AboutRepository;
import com.example.ahlbergbackend.repos.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BlogRESTController {

    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/blog")
    public List<BlogModel> getBlogs() {
        return blogRepository.findAll();
    }

    @PostMapping(value = "/blog", consumes = "application/json")
    public ResponseEntity<BlogModel> addBlog(@RequestBody BlogModel blog) {
        blogRepository.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/blog/{id}")
    public ResponseEntity<BlogModel> deleteBlog(@PathVariable int id) {
        blogRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
