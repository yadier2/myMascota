package com.example.mymascota.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymascota.pojo.MacotaModelo;
import com.example.mymascota.adapter.MyAdaptador;
import com.example.mymascota.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {
    private RecyclerView  recyclerViewMascota;
    private MyAdaptador   adaptadorMascota;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_reciclerview,container,false);
        recyclerViewMascota=(RecyclerView)v.findViewById(R.id.recyclerMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(getActivity()));

        adaptadorMascota=new MyAdaptador(obtenerCantantes());

        recyclerViewMascota.setAdapter(adaptadorMascota);
        return v;
    }
    public List<MacotaModelo> obtenerCantantes(){
        List<MacotaModelo> mascota= new ArrayList<>();
        mascota.add(new MacotaModelo("Conejo",0,R.drawable.conejo));
        mascota.add(new MacotaModelo("Gato",0,R.drawable.gato));
        mascota.add(new MacotaModelo("Hamster",0,R.drawable.hamster));
        mascota.add(new MacotaModelo("Loro",0,R.drawable.loro));
        mascota.add(new MacotaModelo("Perro",0,R.drawable.perro));
        mascota.add(new MacotaModelo("Pez",0,R.drawable.pez));
        mascota.add(new MacotaModelo("Perro",0,R.drawable.perro2));
        mascota.add(new MacotaModelo("Pez",0,R.drawable.pez2));

        return mascota;
    }

}

