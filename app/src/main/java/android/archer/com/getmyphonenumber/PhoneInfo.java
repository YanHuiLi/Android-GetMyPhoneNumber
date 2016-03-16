package android.archer.com.getmyphonenumber;

/**
 * Created by Archer on 2016/3/16.
 */
public class PhoneInfo {


    //构造器
    public PhoneInfo(String name ,String number){
                 setName(name);
                setNumber(number);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String  number;

}
