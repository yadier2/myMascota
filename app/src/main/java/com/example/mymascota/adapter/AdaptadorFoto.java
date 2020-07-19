package com.example.mymascota.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymascota.pojo.MacotaModelo;
import com.example.mymascota.R;

import java.util.List;

public class AdaptadorFoto extends RecyclerView.Adapter<AdaptadorFoto.ViewHolder>{
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgMascota;
        private TextView tvRating;

        Context context;

        RecyclerView recyclerMascota;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context =itemView.getContext();
            recyclerMascota= itemView.findViewById(R.id.recyclerView);

            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota1);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating1);

        }
    }
    public List<MacotaModelo> mascotaLista;

    public AdaptadorFoto(List<MacotaModelo> cantantelista) {
        this.mascotaLista = cantantelista;

    }

    @NonNull
    @Override
    public AdaptadorFoto.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foto,parent,false);
        AdaptadorFoto.ViewHolder viewHolder=new AdaptadorFoto.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorFoto.ViewHolder holder, int position) {
        final MacotaModelo mascota = mascotaLista.get(position);

        holder.imgMascota.setImageResource(mascota.getImagen());
        holder.tvRating.setText(Integer.toString(mascota.getRating()));

    }

    @Override
    public int getItemCount() {

            return mascotaLista.size();
    }

}
