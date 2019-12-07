package ru.courseworkdt.elib.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private double summa;

    public Order() {}
    public Order(double summa) {
        this.summa = summa;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }
}
