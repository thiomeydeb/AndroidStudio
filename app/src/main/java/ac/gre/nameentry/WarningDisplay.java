package ac.gre.nameentry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class WarningDisplay extends Activity {
    public static final String NAME = "name";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warning);

     /*   TextView mCaution = (TextView)findViewById(R.id.showwarning );
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString(NAME);
            if (name != null) {
                mCaution .setText(getString(R.string.dontpress) + " " + name);
            }
        }
    }*/
    }
}