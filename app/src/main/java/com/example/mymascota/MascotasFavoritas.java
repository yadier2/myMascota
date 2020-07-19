package com.example.mymascota;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import com.example.mymascota.adapter.MyAdaptador;
        import com.example.mymascota.pojo.MacotaModelo;

        import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
    ArrayList<MacotaModelo> mascotaLista;
    private RecyclerView rvMascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionBarFavoritos = (Toolbar) findViewById(R.id.miActionBarFavoritos);

        setSupportActionBar(miActionBarFavoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rvMascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotasFavoritas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }
    public void inicializarAdaptador(){
        MyAdaptador adaptador = new MyAdaptador(mascotaLista);
        rvMascotasFavoritas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotaLista = new ArrayList<MacotaModelo>();
        mascotaLista.add(new MacotaModelo("Hamster",5,R.drawable.hamster));
        mascotaLista.add(new MacotaModelo("Conejo",5,R.drawable.conejo));
        mascotaLista.add(new MacotaModelo("Loro",5,R.drawable.loro));
        mascotaLista.add(new MacotaModelo("Gato",5,R.drawable.gato));
        mascotaLista.add(new MacotaModelo("Pez",5,R.drawable.pez));

    }

}