package com.demo;
import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
    @Controller
    public class MovieController {
    
        @Autowired
        private MovieRepository repo;
    
        @GetMapping("/movies")
        @ResponseBody
        public List<Movie> allMovies(){
            return repo.findAll();

        }

        @PostMapping("/movies")
    @ResponseBody
    public Movie saveMovie(@RequestBody Movie movie){
        return repo.save(movie);
    }
    }