package sg.edu.rp.c346.id22021506.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement;
    Button btnAdd;
    ListView lvColour;

    ArrayList<String> alColours;
    ArrayAdapter<String> aaColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextColour);
        btnAdd = findViewById(R.id.buttonAddItem);
        lvColour=findViewById(R.id.listViewColour);

        alColours=new ArrayList<>();
        aaColour=new ArrayAdapter<>(this,
        android.R.layout.simple_list_item_1,alColours);
        alColours.add("red");
        alColours.add("Orange");

        lvColour.setAdapter(aaColour);
    }
}