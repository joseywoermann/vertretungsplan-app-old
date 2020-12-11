package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton5);
        Button increasePageButton = findViewById(R.id.increasePageButton5);

        WebView vertretungsplan_wv5 = (WebView)findViewById(R.id.vertretungsplan_wv5);
        vertretungsplan_wv5.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv5.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm");
    }

    public void nextPage5(View view) {
        Intent mainactivity = new Intent(this, MainActivity.class);
        startActivity(mainactivity);
    }

    public void previousPage5(View view) {
        Intent page4 = new Intent(this, Page4.class);
        startActivity(page4);
    }
}
