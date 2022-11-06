package lat.pam.storeapps;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageView img=findViewById(R.id.images);
        TextView tv1=findViewById(R.id.judul);
        TextView tv2=findViewById(R.id.desc);
        Intent i=getIntent();
        Bundle extras = i.getExtras();
        int pic=extras.getInt("pitzza");
        int title=extras.getInt("t");
        int desc=extras.getInt("p");
        img.setImageResource(pic);
        tv1.setText(title);
        tv2.setText(desc);

        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Intent i = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(i);
            }
        });

    }
}