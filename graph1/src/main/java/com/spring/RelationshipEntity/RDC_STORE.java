package com.spring.RelationshipEntity;

//import com.spring.entity.FC;
import com.spring.entity.RDC;
import com.spring.entity.Store;
//import com.spring.entity.WPM;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.StartNode;

public class RDC_STORE {

    @Id
    @GeneratedValue
    private Long id;
    private int TNT;
    private String Start_Date;
    private String End_Date;


    @StartNode
    private RDC rdc;
    @EndNode
    private Store store;

    public String getStart_Date() {
        return Start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public RDC_STORE(Long id, int TNT, String start_Date, String end_Date, RDC rdc, Store store) {
        this.id = id;
        this.TNT = TNT;
        Start_Date = start_Date;
        End_Date = end_Date;
        this.rdc = rdc;
        this.store = store;
    }

    public Long getId() {
        return id;
    }


    public int getTNT() {
        return TNT;
    }


    public RDC getRdc() {
        return rdc;
    }


    public Store getStore() {
        return store;
    }

}
