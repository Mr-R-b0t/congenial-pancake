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
    private ObjectId _id;
    private String id;
    private String departure;
    private String arrival;
    public String outboundDate;
    public String outboundTime;
    public String returnDate;
    public String returnTime;
    public String numberOfTickets;
    public String ticketClass;

    public Train(String id, String departure, String arrival, String outboundDate, String outboundTime, String returnDate, String returnTime, String numberOfTickets, String ticketClass) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.outboundDate = outboundDate;
        this.outboundTime = outboundTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.numberOfTickets = numberOfTickets;
        this.ticketClass = ticketClass;
    }
}
