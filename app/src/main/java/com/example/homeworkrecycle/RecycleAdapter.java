package com.example.homeworkrecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {
    List<TaskModel> list = new ArrayList<>();
    Context context;

    public RecycleAdapter(Context context){
        this.context =context;

    }
    public void addTask(TaskModel model){
        this.list.add(model);
        notifyDataSetChanged();
    }


    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);

        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.RecycleViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTxtTitle());
        holder.txtDescription.setText(list.get(position).getTxtDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle,txtDescription;
        public RecycleViewHolder(View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txt_title);
            txtDescription=itemView.findViewById(R.id.txt_description);
        }
    }
}
