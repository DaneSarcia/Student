package sarcia.mcm.edu.ph.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4;

    int idnum = 20200000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student first = new Student("Daniel","Sarcia","18", 'M');
        txt1 = findViewById(R.id.txtf);
        txt2 = findViewById(R.id.txtf3);
        txt3 = findViewById(R.id.txtf2);
        txt4 = findViewById(R.id.txtf4);
        txt1.setText(first.getfname()+" "+first.getlname());
        txt2.setText(first.getage());
        txt3.setText(String.valueOf(first.getsex()));
        txt4.setText(String.valueOf(idnum++));
    }
}
