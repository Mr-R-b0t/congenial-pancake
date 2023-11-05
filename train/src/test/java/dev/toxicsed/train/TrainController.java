package dev.toxicsed.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/train")
public class TrainController {

    @Autowired
    private TrainService service;

    @GetMapping("/")
    public ResponseEntity<List<Train>> getTrain() {
        return new ResponseEntity<List<Train>>(service.findAllTrain(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable("id") String id) {
        return new ResponseEntity<Train>(service.findTrainById(id), HttpStatus.OK);
    }

    @GetMapping("/departure/{departure}")
    public ResponseEntity<List<Train>> getTrainByDeparture(@PathVariable("departure") String departure) {
        return new ResponseEntity<List<Train>>(service.findByDeparture(departure), HttpStatus.OK);
    }

    @GetMapping("/arrival/{arrival}")
    public ResponseEntity<List<Train>> getTrainByArrival(@PathVariable("arrival") String arrival) {
        return new ResponseEntity<List<Train>>(service.findByArrival(arrival), HttpStatus.OK);
    }

    @GetMapping("/outboundDate/{outboundDate}")
    public ResponseEntity<List<Train>> getTrainByOutboundDate(@PathVariable("outboundDate") String outboundDate) {
        return new ResponseEntity<List<Train>>(service.findByOutboundDate(outboundDate), HttpStatus.OK);
    }

    @GetMapping("/outboundTime/{outboundTime}")
    public ResponseEntity<List<Train>> getTrainByOutbountTime(@PathVariable("outboundTime") String outboundTime) {
        return new ResponseEntity<List<Train>>(service.findByOutboundTime(outboundTime), HttpStatus.OK);
    }

    @GetMapping("/returnDate/{returnDate}")
    public ResponseEntity<List<Train>> getTrainByReturnDate(@PathVariable("returnDate") String returnDate) {
        return new ResponseEntity<List<Train>>(service.findByReturnDate(returnDate), HttpStatus.OK);
    }

    @GetMapping("/returnTime/{returnTime}")
    public ResponseEntity<List<Train>> getTrainByReturnTime(@PathVariable("returnTime") String returnTime) {
        return new ResponseEntity<List<Train>>(service.findByReturnTime(returnTime), HttpStatus.OK);
    }

    @GetMapping("/numberOfTickets/{numberOfTickets}")
    public ResponseEntity<List<Train>> getTrainByNumberOfTickets(@PathVariable("numberOfTickets") String numberOfTickets) {
        return new ResponseEntity<List<Train>>(service.findByNumberOfTickets(numberOfTickets), HttpStatus.OK);
    }

    @GetMapping("/ticketClass/{ticketClass}")
    public ResponseEntity<List<Train>> getTrainByTicketClass(@PathVariable("ticketClass") String ticketClass) {
        return new ResponseEntity<List<Train>>(service.findByTicketClass(ticketClass), HttpStatus.OK);
    }
}