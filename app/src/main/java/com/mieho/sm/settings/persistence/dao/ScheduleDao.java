package com.mieho.sm.settings.persistence.dao;

import com.mieho.sm.settings.persistence.entity.ScheduleEntity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * @author Gabriel Kiełbus on 15.11.2018 22:20
 * @project SoundsManager
 */
@Dao
public interface ScheduleDao {

    @Query("SELECT * FROM scheduleentity")
    List<ScheduleEntity> getAll();

    @Query("SELECT * FROM scheduleentity WHERE scheduleId IN (:scheduleIds)")
    List<ScheduleEntity> loadAllByIds(int[] scheduleIds);

    @Query("SELECT * FROM scheduleentity WHERE scheduleName LIKE :scheduleName LIMIT 1")
    ScheduleEntity findByName(String scheduleName);

    @Insert
    void insertAll(ScheduleEntity... schedules);

    @Delete
    void delete(ScheduleEntity schedule);

}
