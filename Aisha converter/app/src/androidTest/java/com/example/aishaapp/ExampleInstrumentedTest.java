package com.example.aishaapp;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.aishaapp.domain.HistoryItem;
import com.example.aishaapp.repos.IRepo;
import com.example.aishaapp.repos.Repo;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testHistorySize() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        IRepo repo = new Repo(appContext);
        assertTrue(repo.getHistory().size() <= 10);
    }

    @Test
    public void testHistoryElements() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        IRepo repo = new Repo(appContext);
        List<HistoryItem> history = repo.getHistory();
        boolean result = true;
        for (Object elem :
                history) {
            result &= (elem instanceof HistoryItem);
        }
        assertTrue(result);
    }

    @Test
    public void testUpdatingHistory() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        IRepo repo = new Repo(appContext);
        HistoryItem historyItem = new HistoryItem("1", "1", "1");
        repo.addHistoryItem(historyItem);
        assertEquals(historyItem, repo.getHistory().get(0));
    }

    @Test
    public void testIsCorrectSizeAfterUpdating() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        IRepo repo = new Repo(appContext);
        HistoryItem historyItem = new HistoryItem("1", "1", "1");
        repo.addHistoryItem(historyItem);
        assertTrue(repo.getHistory().size() <= 10);
    }

}