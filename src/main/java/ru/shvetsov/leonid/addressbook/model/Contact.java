package ru.shvetsov.leonid.addressbook.model;

import lombok.Data;
import ru.shvetsov.leonid.addressbook.utils.enums.ContactType;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Contact extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    private ContactType type;
    private String provider;
    private String contactField;

}
