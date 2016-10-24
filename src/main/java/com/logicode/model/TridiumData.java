package com.logicode.model;

import javax.persistence.*;

/**
 * Created by jjenkins on 10/24/2016.
 * The pojo that descibes my database
 */

//testsite_generator1_voltage_an_cov
@Entity
@Table(name = "testsite_generator1_voltage_an_cov")
public class TridiumData {

    //the key that is Auto generated
    @Id
    private int id;
    private long timestamp;
    private double value;

    public int getId() {
        return id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }
}
