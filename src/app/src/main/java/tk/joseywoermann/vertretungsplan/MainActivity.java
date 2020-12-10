package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String page1 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        String page2 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";
        String page3 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm";
        String page4 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm";
        String page5 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm";

        String currentPage = "page1";

        WebView vertretungsplan_wv = (WebView)findViewById(R.id.vertretungsplan_wv);
        vertretungsplan_wv.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv.loadUrl(page1);
    }
}