package mk.finki.ukim.mk.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String description;

    @OneToMany
    private List<Event> events;

    public Location(String name, String address, String capacity, String description) {
        this.id = (long) (Math.random() * 1000);
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.description = description;
    }
}

/*
INSERT INTO LOCATION (ADDRESS, CAPACITY, DESCRIPTION, NAME) VALUES
('Kej Makedonija 1, Ohrid, Macedonia', 150, 'Модерна сала со панорамски поглед кон Охридското Езеро. Идеална за конференции и венчавки.', 'Lakeview Hall'),
('Plostad Makedonija bb, Skopje, Macedonia', 300, 'Простор за настани во срцето на главниот град, со можности за indoor и outdoor активности.', 'City Square Center'),
('Galichica National Park, Ohrid, Macedonia', 100, 'Традиционална планинска куќа опкружена со природна убавина. Совршена за тим билдинг или викенд ретрити.', 'Mountain Escape Lodge'),
('Marshal Tito 25, Bitola, Macedonia', 200, 'Историски објект претворен во културен центар, идеален за изложби, концерти и семинари.', 'Art & Culture Center'),
('Gradishte Beach, Ohrid, Macedonia', 120, 'Локација покрај плажа со уникатни залези на сонце. Одличен избор за приватни забави и корпоративни настани.', 'Sunset Beach Venue');

 */