package com.example.appmusics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Đúng người đúng thời điểm", "Thanh Hung", R.raw.dung_nguoi_dung_thoi_diem));
        arrayList.add(new Music("Em về đi em", "Hoa Vinh", R.raw.em_ve_di_em));
        arrayList.add(new Music("Ex's hate me", "Bray", R.raw.ex_is_hate_me));
        arrayList.add(new Music("Hồng nhan", "Jack", R.raw.hong_nhan));
        arrayList.add(new Music("Một bước yêu vạn dặm đau", "Mr Siro", R.raw.mot_buoc_yeu_van_dam_dau));
        arrayList.add(new Music("Xin một lần ngoại lệ", "Keyo", R.raw.xin_mot_lan_ngoai_le));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
