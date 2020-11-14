package com.mpls.NewYorkTimesApi1;

import java.util.ArrayList;


public class Results {
    private final String health;
    private final String subsection;
    private final String title;
    private final String url;
    private final String uri;
    private final String byline;
    private final String item_type;
    private final String updated_date;
    private final String created_date;
    private final String published_date;
    private final String material_type_facet;
    private final String kicker;
    private final ArrayList<String> des_facet = new ArrayList<>();
    private final ArrayList<String> org_facet = new ArrayList<>();
    private final ArrayList<String> per_facet = new ArrayList<>();
    private final ArrayList<String> geo_facet = new ArrayList<>();
    public final ArrayList<Multimedia> multimedia;


    public Results(String health, String subsection, String title, String url, String uri, String byline, String item_type, String updated_date, String created_date, String published_date, String material_type_facet, String kicker, ArrayList<String> des_facet,ArrayList<String> org_facet, ArrayList<String> per_facet, ArrayList<String> geo_facet,  ArrayList<Multimedia> multimedia) {
        this.health = health;
        this.subsection = subsection;
        this.title = title;
        this.url = url;
        this.uri = uri;
        this.byline = byline;
        this.item_type = item_type;
        this.updated_date = updated_date;
        this.created_date = created_date;
        this.published_date = published_date;
        this.material_type_facet = material_type_facet;
        this.kicker = kicker;
        this.multimedia = multimedia;
    }

    public String getHealth() {
        return health;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getUri() {
        return uri;
    }

    public String getByline() {
        return byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public ArrayList<Multimedia> getMultimedia() {
        return multimedia;
    }
}
