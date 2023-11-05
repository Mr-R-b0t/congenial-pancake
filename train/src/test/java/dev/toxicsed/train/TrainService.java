package dev.toxicsed.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrainService {

    @Autowired
    private TrainRepository repository;

    public List<Train> findAllTrain() {
        return repository.findAll();
    }
}
