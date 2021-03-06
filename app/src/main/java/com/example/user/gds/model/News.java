package com.example.user.gds.model;

import android.widget.TextView;

import com.example.user.gds.R;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

/**
 * Created by user on 11.11.2016.
 */

public class News {

    private String date;
    private String id;
    private String shortDesc;
    private String title;


    public News() {

    }


    public News(JSONObject json) throws JSONException {
        this.id=json.getString("id");
        this.date=json.getString("date");
        this.title=json.getString("title");
        this.shortDesc=json.getString("shortDescription");

    }
    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getShortDesc() { return shortDesc; }

    public void setShortDesc(String shortDesc) { this.shortDesc = shortDesc; }

    public  String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }


}
