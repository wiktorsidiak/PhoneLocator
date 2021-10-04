package com.enigma.enigma.Model;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviceId", nullable = false, updatable = false)
    long id;
    @Column
    int latitiude;
    @Column
    int longtitude;


}
