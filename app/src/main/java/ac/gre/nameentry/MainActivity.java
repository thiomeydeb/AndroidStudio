package ac.gre.nameentry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private EditText mNameText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView tv= new TextView(this);
        //setText("App says Lollipop") ;
        setContentView(R.layout.activity_main);
        mNameText = (EditText) findViewById(R.id.txtName);
        Button btnPress = (Button) findViewById(R.id.btnPress);
        Button btnDontPress = (Button) findViewById(R.id.btnDontPress);
        btnPress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                handleButtonClick();
            }
        });
        btnDontPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

    }
    private void handleButtonClick() {
        String strName = mNameText.getText().toString();
        Intent i = new Intent(this, NameDisplay.class);
        i.putExtra(NameDisplay.NAME, strName);
        startActivity(i);
    }
    private void click(View view){
        Intent e = new Intent(this, WarningDisplay.class);
        startActivity(e);

       // startActivity(new Intent(MainActivity.this, WarningDisplay.class));
    }
}