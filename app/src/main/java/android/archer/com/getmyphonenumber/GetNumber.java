package android.archer.com.getmyphonenumber;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Archer on 2016/3/16.
 */
public class GetNumber {

    //拿到数据进行封装，使用list
    public static List<PhoneInfo>lists=new ArrayList<PhoneInfo>();



    public static String getNumber(Context mcontext) {

        //获取通讯录的方法
        //因为通讯记录保存在手机的数据库之中，调用query方法返回的是一个cursor对象的数组？
        Cursor mcursor = mcontext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);

        String PhoneNumber,PhoneName;

        //用PhoneNumber来存储取出来的数据
        assert mcursor != null;
        while (mcursor.moveToNext()) {
            //获取电话号码
            PhoneNumber = mcursor.getString(mcursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            PhoneName= mcursor.getString(mcursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));

            //在这进行实例化填入数据进入list
            PhoneInfo phoneInfo=new PhoneInfo(PhoneName,PhoneNumber);
            lists.add(phoneInfo);


//            打印出来看看
            System.out.println(PhoneName+PhoneNumber);

        }

        return null;
    }
}