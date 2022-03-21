package com.example.ets;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public abstract class WordListAdapter extends RecyclerView.Adapter {
    public WordListAdapter(MainActivity mainActivity, LinkedList<String> mWordList) {

    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
