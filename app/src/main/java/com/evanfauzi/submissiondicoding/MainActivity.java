package com.evanfauzi.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvProsesor;
    private ArrayList<Prosesor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProsesor = findViewById(R.id.rv_prosesor);
        rvProsesor.setHasFixedSize(true);

        list.addAll(DataProsesor.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvProsesor.setLayoutManager(new LinearLayoutManager(this));
        ListProsesorAdaptor listProsesorAdaptor = new ListProsesorAdaptor(list);
        rvProsesor.setAdapter(listProsesorAdaptor);

        listProsesorAdaptor.setOnItemClickCallback(new ListProsesorAdaptor.OnItemClickCallback() {
            @Override
            public void onItemClicked(Prosesor data) {
                showSelectedProsesor(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }


    private void showSelectedProsesor(Prosesor prosesor) {
        Intent detail = new Intent(MainActivity.this,DetailProsesor.class);
        detail.putExtra("ProsesorImages", prosesor.getPhoto());
        detail.putExtra("ProsesorNames", prosesor.getName());
        detail.putExtra("ProsesorDetails", prosesor.getDetail());
        detail.putExtra("ProsesorSpek", prosesor.getSpek());
        startActivity(detail);
    }
}
