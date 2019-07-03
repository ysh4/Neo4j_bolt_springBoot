package com.spring.RelationshipEntity;

import com.spring.entity.FC;
import com.spring.entity.RDC;
import com.spring.entity.WPM;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.StartNode;

public class WPM_RDC {

    @Id
    @GeneratedValue
    private Long id;
    private int TNT;
    private String Start_Date;
    private String End_Date;


    @StartNode
    private WPM wpm;
    @EndNode
    private RDC rdc;

    public String getStart_Date() {
        return Start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public WPM_RDC(Long id, int TNT, String start_Date, String end_Date, WPM wpm, RDC rdc) {
        this.id = id;
        this.TNT = TNT;
        Start_Date = start_Date;
        End_Date = end_Date;
        this.wpm = wpm;
        this.rdc = rdc;
    }

    public Long getId() {
        return id;
    }


    public int getTNT() {
        return TNT;
    }


    public WPM getWpm() {
        return wpm;
    }


    public RDC getRdc() {
        return rdc;
    }

}
