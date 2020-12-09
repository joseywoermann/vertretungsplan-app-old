package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        WebView vertretungsplan_wv = (WebView)findViewById(R.id.vertretungsplan_wv);
        vertretungsplan_wv.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv.loadUrl(url);
    }
}