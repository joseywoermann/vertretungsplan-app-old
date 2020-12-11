package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton4);
        Button increasePageButton = findViewById(R.id.increasePageButton4);

        WebView vertretungsplan_wv4 = (WebView)findViewById(R.id.vertretungsplan_wv4);
        vertretungsplan_wv4.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv4.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm");
    }

    public void nextPage4(View view) {
        Intent page5 = new Intent(this, Page5.class);
        startActivity(page5);
    }

    public void previousPage4(View view) {
        Intent page3 = new Intent(this, Page3.class);
        startActivity(page3);
    }
}
