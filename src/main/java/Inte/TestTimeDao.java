package Inte;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Clown on 2017/06/23.
 */
public interface TestTimeDao {
    Date returnDate(String date);

    Timestamp returnTime(String time);
}
