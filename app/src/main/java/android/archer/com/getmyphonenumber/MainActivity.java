package android.archer.com.getmyphonenumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// 调用getnumber里面的getnumber方法
        GetNumber.getNumber(this);

        lv= (ListView) findViewById(R.id.lv);

        //初始化适配器
        adapter=new MyAdapter(GetNumber.lists,this);
//填充适配器
        lv.setAdapter(adapter);

    }
}
