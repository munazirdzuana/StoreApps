package lat.pam.storeapps;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static Bundle extras=new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.name_text);

        final Spinner List = findViewById(R.id.spinner);

        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                String name=editText.getText().toString();
                String text = List.getSelectedItem().toString();
                extras.putString("Nama",name);
                extras.putString("LOCK",text);
                i.putExtras(extras);
                startActivity(i);
            }
        });
    }
}