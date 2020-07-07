package com.example.aishaapp.presenters;

import android.content.Context;

import com.example.aishaapp.adapters.Adapter;
import com.example.aishaapp.contracts.ConverterContract;
import com.example.aishaapp.domain.HistoryItem;
import com.example.aishaapp.repos.IRepo;
import com.example.aishaapp.repos.Repo;

import java.util.Calendar;

public class HistoryPresenter {
    IRepo repo;

    public HistoryPresenter(Context ctx) {
        this.repo = new Repo(ctx);
    }

    public void addHistoryItem(ConverterContract contract) {
        Calendar calendar = Calendar.getInstance();
        repo.addHistoryItem(new HistoryItem(
                calendar.getTime().toString(),
                contract.getAmount() + " " + contract.getFromName(),
                contract.getResult() + " " + contract.getToName()
        ));

    }

    public Adapter getHistory() {
        return new Adapter(repo.getHistory());
    }
}
