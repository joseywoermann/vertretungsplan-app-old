package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Page1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //int pageNumber = 1;
        String currentPage = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";


        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton);
        Button increasePageButton = findViewById(R.id.increasePageButton);

        increasePageButton.setOnClickListener(this);
        decreasePageButton.setOnClickListener(this);

        String page1 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        String page2 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";
        String page3 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm";
        String page4 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm";
        String page5 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm";

        //String currentPage = "page1";

        WebView vertretungsplan_wv = (WebView)findViewById(R.id.vertretungsplan_wv);
        vertretungsplan_wv.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv.loadUrl(currentPage);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.increasePageButton:
                Toast.makeText(this, "button1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.decreasePageButton:
                Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
