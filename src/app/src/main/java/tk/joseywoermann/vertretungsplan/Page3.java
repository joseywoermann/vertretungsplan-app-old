package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton3);
        Button increasePageButton = findViewById(R.id.increasePageButton3);

        WebView vertretungsplan_wv3 = (WebView) findViewById(R.id.vertretungsplan_wv3);
        vertretungsplan_wv3.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv3.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm");
    }
    public void nextPage3(View view) {
        Intent page4 = new Intent(this, Page4.class);
        startActivity(page4);
    }

    public void previousPage3(View view) {
        Intent page2 = new Intent(this, Page2.class);
        startActivity(page2);
    }
}
