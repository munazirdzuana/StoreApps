package lat.pam.storeapps;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    static Bundle extras;

    static MainActivity2 INSTANCE;
    public static MainActivity2 getActivityInstance() {
        return INSTANCE;
    }
    public Bundle getExrass(){
        return this.extras;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        INSTANCE=this;
        super.onCreate(savedInstanceState);
        Intent i=getIntent();
        setContentView(R.layout.activity_main2);
        extras = i.getExtras();
        String name =extras.getString("Nama");
        String lock =extras.getString("LOCK");
        String greting="Hello, "+name;

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.toolbar);

        View view =getSupportActionBar().getCustomView();
        TextView textView2=findViewById(R.id.nama);
        textView2.setText(greting);
        TextView textView=findViewById(R.id.place);
        textView.setText(lock);

        Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
        Button btn=(Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(intent);
            }
        });
    }
}