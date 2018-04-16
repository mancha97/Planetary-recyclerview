package com.valle00018316.labo05;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carlos on 04-16-18.
 */

public class PlanetaAdapt extends RecyclerView.Adapter<PlanetaAdapt.PlanetViewHolder>{
    Context mCtx;
    List<Planeta> planetaList;

    public PlanetaAdapt(Context mCtx, List<Planeta> planetaList) {
        this.mCtx = mCtx;
        this.planetaList = planetaList;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View v=inflater.inflate(R.layout.layout_list_item, null);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.title.setText(planetaList.get(position).getTitle());
        holder.descrip.setText(planetaList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return planetaList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView title,descrip ;

        public PlanetViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.titl);
            descrip=itemView.findViewById(R.id.descrip);
        }
    }

}
