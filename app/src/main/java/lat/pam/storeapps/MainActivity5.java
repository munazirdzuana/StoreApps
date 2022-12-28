package lat.pam.storeapps;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity5 extends AppCompatActivity {
    public static String str;

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
//
//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
//        int duration = Toast.LENGTH_SHORT;

        Intent i=getIntent();
        extras = MainActivity2.getActivityInstance().getExrass();
        Bundle extras2=i.getExtras();
        String nama=extras.getString("Nama");
        String lock=extras.getString("LOCK");
        String sand=extras2.getString("judul");

        TextView tv1=findViewById(R.id.nama_d);
        TextView tv2=findViewById(R.id.cabang);
        TextView tv3=findViewById(R.id.pesan);

        String tambah=sand+" telah Di pesan";
        tv1.setText("Atas Nama  : "+nama);
        tv2.setText("Toko             : "+lock);
        tv3.setText(tambah);

        String gabung="Terima Kasih "+nama+" Sudah memesan Di toko Kami, Dengan pesanan "+sand;

        Button btn1 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {

                Toast.makeText(getBaseContext(),gabung , Toast.LENGTH_LONG ).show();
            }
        });

    }
}