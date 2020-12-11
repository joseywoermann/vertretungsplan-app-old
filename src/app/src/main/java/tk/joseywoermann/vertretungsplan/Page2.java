package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton2);
        Button increasePageButton = findViewById(R.id.increasePageButton2);

        WebView vertretungsplan_wv2 = (WebView)findViewById(R.id.vertretungsplan_wv2);
        vertretungsplan_wv2.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv2.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm");
    }

    public void nextPage2(View view) {
        Intent page3 = new Intent(this, Page3.class);
        startActivity(page3);
    }

    public void previousPage2(View view) {
        Intent mainactivity = new Intent(this, MainActivity.class);
        startActivity(mainactivity);
    }
}
