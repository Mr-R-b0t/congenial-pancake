package dev.toxicsed.train;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TrainRepository extends MongoRepository<Train, ObjectId> {
    public List<Train> findBy_id(ObjectId _id);
    public List<Train> findByDeparture(String departure);
    public List<Train> findByArrival(String arrival);
    public List<Train> findByOutboundDate(String outboundDate);
    public List<Train> findByOutboundTime(String outbountTime);
    public List<Train> findByReturnDate(String returnDate);
    public List<Train> findByReturnTime(String returnTime);
    public List<Train> findByNumberOfTickets(String numberOfTickets);
    public List<Train> findByTicketClass(String ticketClass);
}
