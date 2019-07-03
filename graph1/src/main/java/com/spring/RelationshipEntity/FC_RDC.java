package com.spring.RelationshipEntity;

import com.spring.entity.FC;
import com.spring.entity.RDC;
//import org.neo4j.driver.internal.value.DateTimeValue;
import org.neo4j.ogm.annotation.*;

//import java.util.ArrayList;
//import java.util.List;

@RelationshipEntity(type="Map")
public class FC_RDC {

    @Id @GeneratedValue private Long id;
    private String Carrier_Method;
    private int TNT;
    private String Start_Date;
    private String End_Date;
    @StartNode private FC fc;
    @EndNode private RDC rdc ;

    public FC_RDC(Long id, String carrier_Method, int TNT, String start_Date, String end_Date, FC fc, RDC rdc) {
        this.id = id;
        Carrier_Method = carrier_Method;
        this.TNT = TNT;
        Start_Date = start_Date;
        End_Date = end_Date;
        this.fc = fc;
        this.rdc = rdc;
    }

    public Long getId() {
        return id;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public String getCarrier_Method() {
        return Carrier_Method;
    }


    public int getTNT() {
        return TNT;
    }

    public FC getFc() {
        return fc;
    }

    public RDC getRdc() {
        return rdc;
    }

}

