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

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public int getRinghtoneVolLvl() {
        return ringhtoneVolLvl;
    }

    public void setRinghtoneVolLvl(int ringhtoneVolLvl) {
        this.ringhtoneVolLvl = ringhtoneVolLvl;
    }

    public int getNotificationVolLvl() {
        return notificationVolLvl;
    }

    public void setNotificationVolLvl(int notificationVolLvl) {
        this.notificationVolLvl = notificationVolLvl;
    }

    public int getAlarmVolLvl() {
        return alarmVolLvl;
    }

    public void setAlarmVolLvl(int alarmVolLvl) {
        this.alarmVolLvl = alarmVolLvl;
    }

    public int getSystemVolLvl() {
        return systemVolLvl;
    }

    public void setSystemVolLvl(int systemVolLvl) {
        this.systemVolLvl = systemVolLvl;
    }

    public int getMediaVolLvl() {
        return mediaVolLvl;
    }

    public void setMediaVolLvl(int mediaVolLvl) {
        this.mediaVolLvl = mediaVolLvl;
    }

    public boolean isVibrateOnCall() {
        return vibrateOnCall;
    }

    public void setVibrateOnCall(boolean vibrateOnCall) {
        this.vibrateOnCall = vibrateOnCall;
    }

    public boolean isVibrateOnNotification() {
        return vibrateOnNotification;
    }

    public void setVibrateOnNotification(boolean vibrateOnNotification) {
        this.vibrateOnNotification = vibrateOnNotification;
    }

    public boolean isCustomRinghtone() {
        return customRinghtone;
    }

    public void setCustomRinghtone(boolean customRinghtone) {
        this.customRinghtone = customRinghtone;
    }

    public String getRinghtoneName() {
        return ringhtoneName;
    }

    public void setRinghtoneName(String ringhtoneName) {
        this.ringhtoneName = ringhtoneName;
    }

    public boolean isWifiActive() {
        return wifiActive;
    }

    public void setWifiActive(boolean wifiActive) {
        this.wifiActive = wifiActive;
    }

    public boolean isBluetoothActive() {
        return bluetoothActive;
    }

    public void setBluetoothActive(boolean bluetoothActive) {
        this.bluetoothActive = bluetoothActive;
    }

    public boolean isGpsActive() {
        return gpsActive;
    }

    public void setGpsActive(boolean gpsActive) {
        this.gpsActive = gpsActive;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public DaySettings getMondaySettings() {
        return mondaySettings;
    }

    public void setMondaySettings(DaySettings mondaySettings) {
        this.mondaySettings = mondaySettings;
    }

    public DaySettings getTuesdaySettings() {
        return tuesdaySettings;
    }

    public void setTuesdaySettings(DaySettings tuesdaySettings) {
        this.tuesdaySettings = tuesdaySettings;
    }

    public DaySettings getWednesdaySettings() {
        return wednesdaySettings;
    }

    public void setWednesdaySettings(DaySettings wednesdaySettings) {
        this.wednesdaySettings = wednesdaySettings;
    }

    public DaySettings getThursday() {
        return thursday;
    }

    public void setThursday(DaySettings thursday) {
        this.thursday = thursday;
    }

    public DaySettings getFridaySettings() {
        return fridaySettings;
    }

    public void setFridaySettings(DaySettings fridaySettings) {
        this.fridaySettings = fridaySettings;
    }

    public DaySettings getSaturdaySettings() {
        return saturdaySettings;
    }

    public void setSaturdaySettings(DaySettings saturdaySettings) {
        this.saturdaySettings = saturdaySettings;
    }

    public DaySettings getSundaySettings() {
        return sundaySettings;
    }

    public void setSundaySettings(DaySettings sundaySettings) {
        this.sundaySettings = sundaySettings;
    }
}
