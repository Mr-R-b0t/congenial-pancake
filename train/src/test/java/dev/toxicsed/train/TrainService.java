package dev.toxicsed.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bson.types.ObjectId;

import java.util.List;


@Service
public class TrainService {

    @Autowired
    private TrainRepository repository;

    public List<Train> findAllTrain() {
        return repository.findAll();
    }
    public Train saveTrain(Train train) {
        return repository.save(train);
    }
    public Train updateTrain(Train train) {
        return repository.save(train);
    }
    public void deleteTrain(ObjectId _id) {
        repository.deleteById(_id);
    }
    public List<Train> findByDeparture(String departure) {
        return repository.findByDeparture(departure);
    }
    public List<Train> findByArrival(String arrival) {
        return repository.findByArrival(arrival);
    }
    public List<Train> findByOutboundDate(String outboundDate) {
        return repository.findByOutboundDate(outboundDate);
    }
    public List<Train> findByOutboundTime(String outbountTime) {
        return repository.findByOutboundTime(outbountTime);
    }
    public List<Train> findByReturnDate(String returnDate) {
        return repository.findByReturnDate(returnDate);
    }
    public List<Train> findByReturnTime(String returnTime) {
        return repository.findByReturnTime(returnTime);
    }
    public List<Train> findByNumberOfTickets(String numberOfTickets) {
        return repository.findByNumberOfTickets(numberOfTickets);
    }
    public List<Train> findByTicketClass(String ticketClass) {
        return repository.findByTicketClass(ticketClass);
    }
    public Train findTrainById(String id) {
        return repository.findById(new ObjectId(id)).orElse(null);
    }

}
