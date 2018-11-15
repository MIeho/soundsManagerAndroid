package com.mieho.sm.settings.persistence.entity;

import com.mieho.sm.settings.persistence.entity.DaySettings;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author Gabriel Kiełbus on 15.11.2018 20:39
 * @project SoundsManager
 */
@Entity
public class ScheduleEntity {

    @PrimaryKey
    private int scheduleId;

    @ColumnInfo
    private String scheduleName;

    @ColumnInfo
    private int ringhtoneVolLvl;

    @ColumnInfo
    private int notificationVolLvl;

    @ColumnInfo
    private int alarmVolLvl;

    @ColumnInfo
    private int systemVolLvl;

    @ColumnInfo
    private int mediaVolLvl;

    @ColumnInfo
    private boolean vibrateOnCall;

    @ColumnInfo
    private boolean vibrateOnNotification;

    @ColumnInfo
    private boolean customRinghtone;

    @ColumnInfo
    private String ringhtoneName;

    @ColumnInfo
    private boolean wifiActive;

    @ColumnInfo
    private boolean bluetoothActive;

    @ColumnInfo
    private boolean gpsActive;

    @ColumnInfo
    private String startTime;

    @ColumnInfo
    private String stopTime;

    @Embedded(prefix = "mon_")
    private DaySettings mondaySettings;

    @Embedded(prefix = "tue_")
    private DaySettings tuesdaySettings;

    @Embedded(prefix = "wen_")
    private DaySettings wednesdaySettings;

    @Embedded(prefix = "thu_")
    private DaySettings thursday;

    @Embedded(prefix = "fri_")
    private DaySettings fridaySettings;

    @Embedded(prefix = "sat_")
    private DaySettings saturdaySettings;

    @Embedded(prefix = "sun_")
    private DaySettings sundaySettings;

    public int getScheduleId() {
        return scheduleId;
    }

    public ScheduleEntity setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public ScheduleEntity setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }

    public int getRinghtoneVolLvl() {
        return ringhtoneVolLvl;
    }

    public ScheduleEntity setRinghtoneVolLvl(int ringhtoneVolLvl) {
        this.ringhtoneVolLvl = ringhtoneVolLvl;
        return this;
    }

    public int getNotificationVolLvl() {
        return notificationVolLvl;
    }

    public ScheduleEntity setNotificationVolLvl(int notificationVolLvl) {
        this.notificationVolLvl = notificationVolLvl;
        return this;
    }

    public int getAlarmVolLvl() {
        return alarmVolLvl;
    }

    public ScheduleEntity setAlarmVolLvl(int alarmVolLvl) {
        this.alarmVolLvl = alarmVolLvl;
        return this;
    }

    public int getSystemVolLvl() {
        return systemVolLvl;
    }

    public ScheduleEntity setSystemVolLvl(int systemVolLvl) {
        this.systemVolLvl = systemVolLvl;
        return this;
    }

    public int getMediaVolLvl() {
        return mediaVolLvl;
    }

    public ScheduleEntity setMediaVolLvl(int mediaVolLvl) {
        this.mediaVolLvl = mediaVolLvl;
        return this;
    }

    public boolean isVibrateOnCall() {
        return vibrateOnCall;
    }

    public ScheduleEntity setVibrateOnCall(boolean vibrateOnCall) {
        this.vibrateOnCall = vibrateOnCall;
        return this;
    }

    public boolean isVibrateOnNotification() {
        return vibrateOnNotification;
    }

    public ScheduleEntity setVibrateOnNotification(boolean vibrateOnNotification) {
        this.vibrateOnNotification = vibrateOnNotification;
        return this;
    }

    public boolean isCustomRinghtone() {
        return customRinghtone;
    }

    public ScheduleEntity setCustomRinghtone(boolean customRinghtone) {
        this.customRinghtone = customRinghtone;
        return this;
    }

    public String getRinghtoneName() {
        return ringhtoneName;
    }

    public ScheduleEntity setRinghtoneName(String ringhtoneName) {
        this.ringhtoneName = ringhtoneName;
        return this;
    }

    public boolean isWifiActive() {
        return wifiActive;
    }

    public ScheduleEntity setWifiActive(boolean wifiActive) {
        this.wifiActive = wifiActive;
        return this;
    }

    public boolean isBluetoothActive() {
        return bluetoothActive;
    }

    public ScheduleEntity setBluetoothActive(boolean bluetoothActive) {
        this.bluetoothActive = bluetoothActive;
        return this;
    }

    public boolean isGpsActive() {
        return gpsActive;
    }

    public ScheduleEntity setGpsActive(boolean gpsActive) {
        this.gpsActive = gpsActive;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ScheduleEntity setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStopTime() {
        return stopTime;
    }

    public ScheduleEntity setStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    public DaySettings getMondaySettings() {
        return mondaySettings;
    }

    public ScheduleEntity setMondaySettings(DaySettings mondaySettings) {
        this.mondaySettings = mondaySettings;
        return this;
    }

    public DaySettings getTuesdaySettings() {
        return tuesdaySettings;
    }

    public ScheduleEntity setTuesdaySettings(DaySettings tuesdaySettings) {
        this.tuesdaySettings = tuesdaySettings;
        return this;
    }

    public DaySettings getWednesdaySettings() {
        return wednesdaySettings;
    }

    public ScheduleEntity setWednesdaySettings(DaySettings wednesdaySettings) {
        this.wednesdaySettings = wednesdaySettings;
        return this;
    }

    public DaySettings getThursday() {
        return thursday;
    }

    public ScheduleEntity setThursday(DaySettings thursday) {
        this.thursday = thursday;
        return this;
    }

    public DaySettings getFridaySettings() {
        return fridaySettings;
    }

    public ScheduleEntity setFridaySettings(DaySettings fridaySettings) {
        this.fridaySettings = fridaySettings;
        return this;
    }

    public DaySettings getSaturdaySettings() {
        return saturdaySettings;
    }

    public ScheduleEntity setSaturdaySettings(DaySettings saturdaySettings) {
        this.saturdaySettings = saturdaySettings;
        return this;
    }

    public DaySettings getSundaySettings() {
        return sundaySettings;
    }

    public ScheduleEntity setSundaySettings(DaySettings sundaySettings) {
        this.sundaySettings = sundaySettings;
        return this;
    }
}
