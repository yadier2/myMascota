package com.example.mymascota.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymascota.pojo.MacotaModelo;
import com.example.mymascota.R;
import com.example.mymascota.adapter.AdaptadorFoto;

import java.util.ArrayList;
import java.util.List;

public class PerfilFragment extends Fragment {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    private AdaptadorFoto adaptadorMascota;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil,container,false);
        recyclerView = v.findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(getActivity(),2);

        recyclerView.setLayoutManager(layoutManager);


         adaptadorMascota=new AdaptadorFoto(obtenerCantantes());

        recyclerView.setAdapter(adaptadorMascota);
        recyclerView.setHasFixedSize(true);
        return v;
    }

    public List<MacotaModelo> obtenerCantantes(){
        List<MacotaModelo> mascota= new ArrayList<>();
        mascota.add(new MacotaModelo("Perro",3,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",5,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",4,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",0,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",5,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",3,R.drawable.perro2));
        mascota.add(new MacotaModelo("Perro",5,R.drawable.perro));
        mascota.add(new MacotaModelo("Perro",1,R.drawable.perro));
        return mascota;
    }

}
