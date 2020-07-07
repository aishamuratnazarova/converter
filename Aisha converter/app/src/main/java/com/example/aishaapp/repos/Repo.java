package com.example.aishaapp.repos;

import android.content.Context;

import com.example.aishaapp.domain.HistoryItem;
import com.example.aishaapp.helpers.DBHelper;

import java.util.List;

public class Repo implements IRepo {

    private DBHelper dbHelper;

    public Repo(Context ctx) {
        dbHelper = new DBHelper(ctx);
    }


    @Override
    public List<HistoryItem> getHistory() {
        return dbHelper.getItems();
    }

    @Override
    public void addHistoryItem(HistoryItem item) {
        dbHelper.addItem(item);
    }
}
