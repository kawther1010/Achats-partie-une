package com.example.appexo01tp03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listAchats;
    private ArrayAdapter<String> adapter;

    ListView listAchatsView;
    Button btn;
    EditText editText;
    EditText editText2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAchatsView= (ListView) findViewById(R.id.listAchatsView);
        btn= findViewById(R.id.btn);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);


        listAchats= new ArrayList<String>();
        listAchats.add("10 kg Farine");
        listAchats.add("10 L Huil");
        listAchats.add("4 kg Tomates");
        listAchats.add("10 Levures");
        listAchats.add("10 L Eau");
        listAchats.add("1 Extrait de vanille");
        listAchats.add("10 g poivre noir");
        listAchats.add("200 g Olives noires");



        //Question 1 partie 02
        /*
        ArrayList<Achats> listAchats= new ArrayList<Achats>();
        listAchats.add( new Achats("Farine", 10));
        listAchats.add( new Achats("Huil", 10));
        listAchats.add( new Achats("Tomate", 4));
        listAchats.add( new Achats("Levure", 10));
        listAchats.add( new Achats("Eau", 10));
        listAchats.add( new Achats("Extrait de vanille", 1));
        listAchats.add( new Achats("poivre noir", 10));
        listAchats.add( new Achats("Olive noires", 200));
*/
        ListView ListAChatsView= (ListView) findViewById(R.id.listAchatsView);



        //R.id.textView,
        adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  listAchats);
        //MyAdapter adapter= new ArrayAdapter<Achats>(this, listAchats);

        listAchatsView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text and add it in array
                listAchats.add(editText2.getText().toString()+ " " + editText.getText().toString());

                //for updating data
                adapter.notifyDataSetChanged();
            }
        });


    }
}