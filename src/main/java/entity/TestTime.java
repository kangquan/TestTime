package entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Clown on 2017/06/23.
 */
public class TestTime {
    private int id;
    private Date datetest;
    private Timestamp datetimetest;

    @Override
    public String toString() {
        return "TestTime{" +
                "id=" + id +
                ", datetest=" + datetest +
                ", datetimetest=" + datetimetest +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatetest() {
        return datetest;
    }

    public void setDatetest(Date datetest) {
        this.datetest = datetest;
    }

    public Timestamp getDatetimetest() {
        return datetimetest;
    }

    public void setDatetimetest(Timestamp datetimetest) {
        this.datetimetest = datetimetest;
    }

    public TestTime(int id, Date datetest, Timestamp datetimetest) {

        this.id = id;
        this.datetest = datetest;
        this.datetimetest = datetimetest;
    }

    public TestTime() {

    }
}
