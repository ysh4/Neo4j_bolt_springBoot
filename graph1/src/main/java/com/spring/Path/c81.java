package com.spring.Path;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class c81 {
    @Id@GeneratedValue private long id;
    private String FId;
    private String SId;
    private String RId;
    private String WId;
    private long tnt;

    public long getId() {
        return id;
    }

    public String getFId() {
        return FId;
    }

    public String getSId() {
        return SId;
    }

    public String getRId() {
        return RId;
    }

    public String getWId() {
        return WId;
    }

    public long getTnt() {
        return tnt;
    }

    public c81() {
    }

    public c81(String FId, String SId, String RId, String WId, long tnt) {
        this.FId = FId;
        this.SId = SId;
        this.RId = RId;
        this.WId = WId;
        this.tnt = tnt;
    }
}
