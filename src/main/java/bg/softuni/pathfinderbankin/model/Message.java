package bg.softuni.pathfinderbankin.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "date_time")
    private Instant dateTime;

    @Column(name = "text_content",columnDefinition = "TEXT")
    private String content;

    @ManyToOne(optional = false)
    private User author;
    @ManyToOne(optional = false)
    private User recipient;

}
