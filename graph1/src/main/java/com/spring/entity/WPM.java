package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.RelationshipEntity.FC_RDC;
import com.spring.RelationshipEntity.FC_WPM;
import com.spring.RelationshipEntity.RDC_STORE;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class WPM {

    @Id@GeneratedValue private long id;
    private String Type;
    private String ID;

    public WPM(String type, String ID) {
        Type = type;
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }


    public String getID() {
        return ID;
    }

    @JsonIgnoreProperties("WPM")
    @Relationship(type = "Map", direction = Relationship.INCOMING)
    private List<FC_WPM> fc_wpms=new ArrayList<>();

    @Relationship(type="Map")
    private List<RDC> RDCs=new ArrayList<>();
}
