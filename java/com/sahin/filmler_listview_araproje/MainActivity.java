package com.sahin.filmler_listview_araproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<TBLFilmler> filmler = new ArrayList<>();
        filmler.add(new TBLFilmler("Alt Kattaki Katil", R.drawable.altkattakikatil));
        filmler.add(new TBLFilmler("Arog", R.drawable.arog));
        filmler.add(new TBLFilmler("Aşk Bu Mu?", R.drawable.askbumu));
        filmler.add(new TBLFilmler("Ben Böyleyim", R.drawable.benboyleyim));
        filmler.add(new TBLFilmler("Çakallarla Dans 5", R.drawable.cakallarladans));
        filmler.add(new TBLFilmler("Cumali Ceber 2",R.drawable.cumaliceber));
        filmler.add(new TBLFilmler("Efsane", R.drawable.efsane));
        filmler.add(new TBLFilmler("Hayalet Dayı", R.drawable.hayaletdayi));
        filmler.add(new TBLFilmler("Hayat Okulu", R.drawable.hayatokulu));
        filmler.add(new TBLFilmler("211", R.drawable.ikiyuzonbir));
        filmler.add(new TBLFilmler("Kül Kedisi Sinderella", R.drawable.kulkedisisinderella));
        filmler.add(new TBLFilmler("Maidenin Altın Günü", R.drawable.maideninaltingunu));
        filmler.add(new TBLFilmler("Meryem", R.drawable.meryem));
        filmler.add(new TBLFilmler("Meteler", R.drawable.meteler));
        filmler.add(new TBLFilmler("Nasıl Yani", R.drawable.nasilyani));
        filmler.add(new TBLFilmler("Yanlış Anlama", R.drawable.yanlisanlama));
        filmler.add(new TBLFilmler("Zamana Karşı", R.drawable.zamanakarsi));
        filmler.add(new TBLFilmler("Zaman Makinesi 1973", R.drawable.zamanmakinesi));


        GridView  gridview = findViewById(R.id.MyList);
        CustomAdapter adapter = new CustomAdapter(this,filmler);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(0);
            Intent intent = new Intent(getApplicationContext(), DetayActivityAltkattakikatil.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(1);
            Intent intent = new Intent(getApplicationContext(), DetayActivityArog.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(2);
            Intent intent = new Intent(getApplicationContext(), DetayActivityAskbumu.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(3);
            Intent intent = new Intent(getApplicationContext(), DetayActivityBenboyleyim.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(4);
            Intent intent = new Intent(getApplicationContext(), DetayActivitycakallarladans5.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(5);
            Intent intent = new Intent(getApplicationContext(), DetayActivityCumaliceber2.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(6);
            Intent intent = new Intent(getApplicationContext(), DetayActivityEfsane.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(7);
            Intent intent = new Intent(getApplicationContext(), DetayActivityHayaletdayi.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(8);
            Intent intent = new Intent(getApplicationContext(), DetayActivityHayatokulu.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(9);
            Intent intent = new Intent(getApplicationContext(), DetayActivityIkiyuzonbir.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(10);
            Intent intent = new Intent(getApplicationContext(), DetayActivityKulkedisisinderella.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(11);
            Intent intent = new Intent(getApplicationContext(), DetayActivityMaideninaltingunu.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(12);
            Intent intent = new Intent(getApplicationContext(), DetayActivityMeryem.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(13);
            Intent intent = new Intent(getApplicationContext(), DetayActivityMeteler.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(14);
            Intent intent = new Intent(getApplicationContext(), DetayActivityNasilyani.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(15);
            Intent intent = new Intent(getApplicationContext(), DetayActivityYanlisanlama.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(16);
            Intent intent = new Intent(getApplicationContext(), DetayActivityZamanakarsi.class);
            startActivity(intent);

        });
        gridview.setOnItemClickListener((parent,v,position,id) -> {
            parent.getAdapter().getItemId(17);
            Intent intent = new Intent(getApplicationContext(), DetayActivityZamanmakinesi1973.class);
            startActivity(intent);

        });





        }
}




