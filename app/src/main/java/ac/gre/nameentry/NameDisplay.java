package ac.gre.nameentry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class NameDisplay extends Activity {
    public static final String NAME = "name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

        TextView mGreeting = (TextView)findViewById(R.id.showname);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString(NAME);
            if (name != null) {
                mGreeting.setText(getString(R.string.greeting) + " " + name);
            }
        }
    }
}
