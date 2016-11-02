package com.logicode.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 11/2/2016.
 */
@Entity//Entitys are objects that live shorly in memory but persistant in the database
@Table(name = "workitem") //specify the name of the table
@XmlRootElement(name = "workitem")
public class WorkItem {
    //the key that is Auto generated
    @Id // declares the variable id as the key to the table
    @Column(name = "WORK_ITEM_ID")//give the column a bette name
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private Long id;
    //what describes the item/equipment
    private String model;
    private String serial;
    private String equipmentMake;
    private String Descriptions;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getEquipmentMake() {
        return equipmentMake;
    }

    public void setEquipmentMake(String equipmentMake) {
        this.equipmentMake = equipmentMake;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public Long getId() {
        return id;
    }
}
