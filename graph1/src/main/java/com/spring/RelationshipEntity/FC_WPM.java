package com.spring.RelationshipEntity;

import com.spring.entity.FC;
import com.spring.entity.WPM;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type="Map")
public class FC_WPM {

    @Id@GeneratedValue private Long id;
    private int TNT;
    private String Start_Date;
    private String End_Date;

    @StartNode private FC fc;
    @EndNode private WPM wpm;

    public String getStart_Date() {
        return Start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public FC_WPM(Long id, int TNT, String start_Date, String end_Date, FC fc, WPM wpm) {
        this.id = id;
        this.TNT = TNT;
        Start_Date = start_Date;
        End_Date = end_Date;
        this.fc = fc;
        this.wpm = wpm;
    }

    public Long getId() {
        return id;
    }


    public int getTNT() {
        return TNT;
    }


    public FC getFc() {
        return fc;
    }


    public WPM getWpm() {
        return wpm;
    }

}
