package com.spring.Path;

import com.spring.RelationshipEntity.FC_RDC;
import com.spring.RelationshipEntity.RDC_STORE;
import com.spring.entity.FC;
import com.spring.entity.RDC;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class c91 {

    @Id@GeneratedValue private long id;
    private String FId;
    private String RDC;
    private int tnt;
    private String SId;

    public long getId() {
        return id;
    }

    public String getFId() {
        return FId;
    }

    public String getRDC() {
        return RDC;
    }

    public int getTnt() {
        return tnt;
    }

    public String getSId() {
        return SId;
    }

    public c91(String FId, String RDC, int tnt, String SId) {
        this.FId = FId;
        this.RDC = RDC;
        this.tnt = tnt;
        this.SId = SId;
    }

    public c91() {
    }
}
