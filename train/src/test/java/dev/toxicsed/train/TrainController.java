package dev.toxicsed.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class TrainController {

    @Autowired
    private TrainService service;

    @GetMapping
    public ResponseEntity<List<Train>> getMovies() {
        return new ResponseEntity<List<Train>>(service.findAllTrain(), HttpStatus.OK);
    }
}