package com.ibrahimokic.sarajevoevents.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long eventId;

    @Column(name = "name")
    private String name;

    @Column(name = "ticket_price")
    private Float ticketPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "attendes")
    @ManyToMany(mappedBy = "events", cascade = CascadeType.ALL)
    private List<User> attendes;
}
