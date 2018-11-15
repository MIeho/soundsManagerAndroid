package com.mieho.sm.settings.persistence;

import android.content.Context;

import com.mieho.sm.settings.persistence.dao.ScheduleDao;
import com.mieho.sm.settings.persistence.entity.ScheduleEntity;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author Gabriel Kiełbus on 15.11.2018 22:47
 * @project SoundsManager
 */
@Database(entities = {ScheduleEntity.class}, version = 1, exportSchema = false)
public abstract class SchedulesDatabase extends RoomDatabase {

    private static volatile SchedulesDatabase INSTANCE;

    public abstract ScheduleDao scheduleDao();

    public static SchedulesDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SchedulesDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SchedulesDatabase.class, "schedule-database").build();
                }
            }
        }
        return INSTANCE;
    }
}
