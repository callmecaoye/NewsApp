package com.caoye.newsapp.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;

import com.caoye.newsapp.Model.News;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by admin on 11/1/16.
 */

public class NewsAdapter extends RecyclerArrayAdapter<News> {
    public NewsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(parent);
    }
}


