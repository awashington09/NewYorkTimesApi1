package com.mpls.NewYorkTimesApi1;
import java.util.ArrayList;

public class NYTimes {
    private final String status;
    private final String copyright;
    private final String section;
    private final String lastUpdated;
    private final long num_results;
    public final ArrayList<Results> results;

    public NYTimes(String status, String copyright, String section, String lastUpdated, long num_results, ArrayList<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.lastUpdated = lastUpdated;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public long getNum_results() {
        return num_results;
    }

    public ArrayList<Results> getResults() {
        return results;
    }


}

