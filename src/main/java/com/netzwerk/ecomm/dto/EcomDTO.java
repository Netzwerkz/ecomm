package com.netzwerk.ecomm.dto;

import jakarta.persistence.*;
import lombok.*;

//@Setter
//@Getter

@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "ecommerce")

public class EcomDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String model;
    @Column(name="graphicCard")
    private String graphicCard;
    private String color;
    private String processor;
    private String os;
    @Column(name="batterySupply")
    private String batterySupply;
    private Integer quantity;
    @Column(name="uniqueId")
    private String uniqueId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBatterySupply() {
        return batterySupply;
    }

    public void setBatterySupply(String batterySupply) {
        this.batterySupply = batterySupply;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


    @Override
    public String toString() {
        return "EcomDTO{" +
                "name='" + name + '\'' + '}';
    }
}
