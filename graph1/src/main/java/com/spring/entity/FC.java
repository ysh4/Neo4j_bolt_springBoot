package com.spring.entity;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class FC {

    @Id@GeneratedValue private long id;
    private String Type;
    private String ID;

    public FC(String type, String ID) {
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
    private List<RDC> RDCs=new ArrayList<>();

    @Relationship(type="Map")
    private List<WPM> WPMs=new ArrayList<>();

}
