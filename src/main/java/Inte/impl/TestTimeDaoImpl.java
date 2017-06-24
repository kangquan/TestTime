package Inte.impl;

import Inte.TestTimeDao;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by Clown on 2017/06/23.
 */
public class TestTimeDaoImpl implements TestTimeDao {
    @Override
    public Date returnDate(String date) {
        Date d = null;
        if (date == null) {
            d = new Date(new java.util.Date().getTime());
        }else{
            d = Date.valueOf(date);
        }
        return d;
    }

    @Override
    public Timestamp returnTime(String time) {
        Timestamp t = null;
        if (time == null) {
            java.util.Date date = new java.util.Date();//获得系统时间.
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nowTime = sdf.format(date);//将时间格式转换成符合Timestamp要求的格式.
            t =Timestamp.valueOf(nowTime);//把时间转换
        }else{
            //有疑问，sdf并没有使用
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            t =  java.sql.Timestamp.valueOf(time);
/*
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            String time = format.format(new Date()).concat("-0100:00:00");
            java.sql.Date timePara  = null;
            try {
                timePara = newjava.sql.Date(format.parse(time).getTime());
                System.out.println(timePara);
            } catch (ParseException e) {
                e.printStackTrace();
            }
*/

        }
        return t;
    }
}
