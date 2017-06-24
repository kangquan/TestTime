package dao.mapper;

import entity.TestTime;

/**
 * Created by Clown on 2017/06/23.
 */
public interface TimeMapper {
    TestTime queryById(int id);
    int addTestTime(TestTime testTime);
}
