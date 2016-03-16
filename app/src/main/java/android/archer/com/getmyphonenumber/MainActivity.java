package android.archer.com.getmyphonenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// 调用getnumber里面的getnumber方法
        GetNumber.getNumber(this);
    }
}
