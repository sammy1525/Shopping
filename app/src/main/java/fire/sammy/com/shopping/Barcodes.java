package fire.sammy.com.shopping;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Barcodes extends AppCompatActivity {

    public static TextView tvresult;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcodes);

    final Bundle extras=getIntent().getExtras();
         ;
        tvresult = (TextView) findViewById(R.id.tvresult);

        btn = (Button) findViewById(R.id.btn);

     Button   search = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Barcodes.this, ScanActivity.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bar=extras.getString("message");
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com.vn/search?q= "+ bar));
                Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
                v.getContext().startActivity(browserChooserIntent);
            }
        });

    }
}
