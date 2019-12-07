package ru.courseworkdt.elib.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "atribut")
public class Atribut {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String obem;
    private String format;
    private String kolStranic;
    private double cena;

    public Atribut() {}

    public Atribut(String obem, String format, String kolStranic, double cena) {
        this.obem = obem;
        this.format = format;
        this.kolStranic = kolStranic;
        this.cena = cena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObem() {
        return obem;
    }

    public void setObem(String obem) {
        this.obem = obem;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getKolStranic() {
        return kolStranic;
    }

    public void setKolStranic(String kolStranic) {
        this.kolStranic = kolStranic;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
