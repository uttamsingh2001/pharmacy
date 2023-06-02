package com.crossasyst.springbootpharmacy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pharmacy")
public class PharmacyEntity {

    @Id
    @XmlElement(name = "ncpdpid")
    private Long ncpdpid;

    @XmlElement(name = "address_1")
    private String address1;

    @XmlElement(name = "address_2")
    private String address2;

    @XmlElement(name = "state")
    private String state;

    @XmlElement(name = "zipcode")
    private String zipcode;

    @XmlElement(name = "country")
    private String country;

    @XmlElement(name = "phone_1")
    private String phone1;

    @XmlElement(name = "phone_2")
    private String phone2;

    @XmlElement(name = "phone_3")
    private String phone3;

//    @XmlElement(name = "createdts")
//    private LocalDateTime createdts;
//
//    @XmlElement(name = "modifiedts")
//    private LocalDateTime modifiedts;

    @XmlElement(name = "lat")
    private double lat;

    @XmlElement(name = "lng")
    private double lng;

}
