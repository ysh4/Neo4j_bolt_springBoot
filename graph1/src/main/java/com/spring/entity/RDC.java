package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.RelationshipEntity.FC_RDC;
import com.spring.RelationshipEntity.RDC_STORE;
import com.spring.RelationshipEntity.WPM_RDC;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class RDC {

    @Id@GeneratedValue private long id;
    private String Type;
    private String ID;

    public RDC(String type, String ID) {
        Type = type;
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }


    public String getID() {
        return ID;
    }


    @Relationship(type="Map")
    private List<Store> Stores=new ArrayList<>();

    @JsonIgnoreProperties("RDC")
    @Relationship(type = "Map", direction = Relationship.INCOMING)
    private List<FC_RDC> fc_rdcs =new ArrayList<>();

    @JsonIgnoreProperties("RDC")
    @Relationship(type = "Map", direction = Relationship.INCOMING)
    private List<WPM_RDC> wpm_rdcs =new ArrayList<>();
}
