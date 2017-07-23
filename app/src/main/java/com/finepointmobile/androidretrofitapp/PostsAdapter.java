package com.finepointmobile.androidretrofitapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danielmalone on 7/22/17.
 */

class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    List<Item> mDataset;

    public PostsAdapter(List<Item> dataset) {
        mDataset = dataset;
    }

    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostsAdapter.ViewHolder holder, int position) {
        holder.mPostName.setText(mDataset.get(position).getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mPostName;

        public ViewHolder(View itemView) {
            super(itemView);

            mPostName = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
