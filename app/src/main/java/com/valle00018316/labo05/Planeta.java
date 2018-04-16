package com.valle00018316.labo05;

/**
 * Created by carlos on 04-16-18.
 */

public class Planeta {
    String title;
    String desc;
    int planeta_id;

    public Planeta(String title, String desc, int planeta_id) {
        this.title = title;
        this.desc = desc;
        this.planeta_id = planeta_id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPlaneta_id(int planeta_id) {
        this.planeta_id = planeta_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() {
        return title;
    }

    public int getPlaneta_id() {
        return planeta_id;
    }
}

