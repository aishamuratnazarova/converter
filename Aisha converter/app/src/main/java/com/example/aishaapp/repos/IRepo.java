package com.example.aishaapp.repos;

import com.example.aishaapp.domain.HistoryItem;

import java.util.List;

public interface IRepo {
    List<HistoryItem> getHistory();
    void addHistoryItem(HistoryItem item);
}
