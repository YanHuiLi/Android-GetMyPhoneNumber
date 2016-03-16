package android.archer.com.getmyphonenumber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Archer on 2016/3/16.
 */

//使用自定义的adapter来适配listView组件

public class MyAdapter extends BaseAdapter {

    private List<PhoneInfo> lists;
    private Context context;
    private LinearLayout layout;



    public MyAdapter(List<PhoneInfo>lists,Context  context){

        this.lists=lists;
        this.context =context;
    }

    //返回集合的数量
    @Override
    public int getCount() {
        return lists.size();
    }

    //获取当前集合里面的数据
    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //加载布局的权限
        LayoutInflater inflater=LayoutInflater.from(context);
        layout = (LinearLayout) inflater.inflate(R.layout.cell,null);

        //初始化组件
        TextView nameTV= (TextView) layout.findViewById(R.id.nameId);
        TextView numberTv= (TextView) layout.findViewById(R.id.numberId);
        //填充数据进入组件
         nameTV.setText(lists.get(position).getName());
          numberTv.setText(lists.get(position).getNumber());


           return layout;

    }
}
