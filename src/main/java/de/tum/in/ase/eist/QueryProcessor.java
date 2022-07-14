package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Alexandra";
        } else if (query.contains("plus")){
            String[] query2 = query.split(" ");
            return parseInt(query2[3]) + parseInt(query2[5]) + "";
        } else if (query.contains("which of the following numbers is the largest:")){
            String[] query2 = query.split(":");
            int maxi = -1;

            for(int i = 1; i<query2.length; i++) {
                maxi = Math.max(maxi, parseInt(query2[i]));
            }

            return maxi + "";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
