package ru.courseworkdt.elib.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "atribut")
@AllArgsConstructor
@NoArgsConstructor
public class Atribut {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "obem")
    private String obem;
    @Column(name = "format")
    private String format;
    @Column(name = "kolStranic")
    private String kolStranic;
    @Column(name = "cena")
    private double cena;


}
