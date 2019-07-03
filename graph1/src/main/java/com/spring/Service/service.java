package com.spring.Service;

import com.spring.Path.c81;
import com.spring.Path.c91;

import com.spring.Repository.FCrep;
import com.spring.entity.FC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {

    private final static Logger LOG = LoggerFactory.getLogger(service.class);

    private final FCrep fcrep;
    //private cypher c;

   // private final Query query;

    public service(FCrep fcrep) {
        this.fcrep = fcrep;
        //this.query = query;
    }

    public List<FC> findAll() {
        List<FC> result= (List<FC>) fcrep.findAll();
        return  result;

    }


    public c91 fcStoreShortest(String fid, String sid) {
        return fcrep.fcStoreShortest(fid,sid);
    }

    public c81 fc81store(String fid,String sid) {
        return fcrep.fc81store(fid,sid);
    }

   // public void Request(String q) {
   //     c.Request(q);
   // }
}
