package com.mieho.sm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mieho.sm.settings.persistence.SchedulesDatabase;
import com.mieho.sm.settings.persistence.entity.ScheduleEntity;

import java.util.List;

public class EntryScreen extends AppCompatActivity {

    private SeekBar mediaVolBar;
    private TextView mediaVolLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_screen);

        SchedulesDatabase scheduleDb = SchedulesDatabase.getDatabase(getApplicationContext());


        ScheduleEntity scheduleEntity = null;

        List<ScheduleEntity> schedulesList = scheduleDb.scheduleDao().getAll();
        if (schedulesList == null || schedulesList.isEmpty()) {
            scheduleEntity = new ScheduleEntity();
            scheduleEntity.setScheduleName("NaszScheduleNowy");
            scheduleDb.scheduleDao().insertAll(scheduleEntity);
        } else {
            scheduleEntity = schedulesList.stream().findFirst().get();
            String name = scheduleEntity.getScheduleName();
            scheduleEntity.setScheduleName(name + "_nowyName");
        }


        ((TextView) findViewById(R.id.ShceduleText)).setText(scheduleEntity.getScheduleName());
        mediaVolBar = (SeekBar) findViewById(R.id.mediaVolBar);
        mediaVolLabel = (TextView) findViewById(R.id.mediaVolLabel);

        mediaVolBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
                String label = getResources().getString(R.string.mediaVolLabel);
                mediaVolLabel.setText(label + " " + progress + "/" + seekBar.getMax());
                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                String label = getResources().getString(R.string.mediaVolLabel);
                mediaVolLabel.setText(label + " " + progress + "/" + seekBar.getMax());
                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
