package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String plan1 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        String plan2 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";
        String plan3 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm";
        String plan4 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm";
        String plan5 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm";
        WebView vertretungsplan_wv = findViewById(R.id.vertretungsplan_wv);
        vertretungsplan_wv.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv.loadUrl(plan1);
    }
}