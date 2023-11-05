package dev.toxicsed.train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "train")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    @Id
    private ObjectId id;
    private String departure;
    private String arrival;
    public String outboundDate;
    public String outbountTime;
    public String returnDate;
    public String returnTime;
    public String numberOfTickets;
    public String ticketClass;

    public Train(String departure, String arrival, String outboundDate, String outbountTime, String returnDate, String returnTime, String numberOfTickets, String ticketClass) {
        this.departure = departure;
        this.arrival = arrival;
        this.outboundDate = outboundDate;
        this.outbountTime = outbountTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.numberOfTickets = numberOfTickets;
        this.ticketClass = ticketClass;
    }
}
