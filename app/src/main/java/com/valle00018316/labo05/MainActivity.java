package com.valle00018316.labo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Planeta> planetaList;
    RecyclerView rv;
    PlanetaAdapt adapt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //filling this
        planetaList= fillist();

        //setting recycler

       rv =findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        adapt= new PlanetaAdapt(this,planetaList);

        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapt);

    }

    private ArrayList<Planeta> fillist(){
        ArrayList<Planeta> l=new ArrayList<>();
        String desc= "esto es una lorem ipsum";
        l.add(new Planeta("ella", desc, 1));
        l.add(new Planeta("ella 2", desc, 2));
        l.add(new Planeta("ella 3", desc, 3));
        return l;

    }

}
