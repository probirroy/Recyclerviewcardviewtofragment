package com.example.probir.recyclerviewcardviewtofragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class contentAdapter extends Adapter<contentAdapter.ViewHolder> {
    Context context;
    ArrayList<String> message;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        TextView messageTV;

        public ViewHolder(View itemView) {
            super(itemView);
            this.messageTV = (TextView) itemView.findViewById(R.id.messageTV);
        }
    }

    public contentAdapter(ArrayList<String> message, Context context) {
        this.message = message;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = this.context;
        Context context2 = this.context;
        return new ViewHolder(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.content_item_view, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.messageTV.setText((CharSequence) this.message.get(position));
    }

    public int getItemCount() {
        return this.message.size();
    }
}
