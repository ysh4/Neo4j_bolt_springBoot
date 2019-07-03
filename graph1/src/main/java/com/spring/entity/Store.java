package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.RelationshipEntity.RDC_STORE;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class Store {

    @Id@GeneratedValue private long id;
    private String Type;
    private String ID;

    public Store(String type, String ID) {
        Type = type;
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }


    public String getID() {
        return ID;
    }

    @JsonIgnoreProperties("Store")
    @Relationship(type = "Map", direction = Relationship.INCOMING)
    private List<RDC_STORE> rdc_stores=new ArrayList<>();
}
