package com.simplelinearrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplelinearrecyclerview.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;

    private List<Integer>listimage;

    private List<String>listtitle;

    public RecyclerViewAdapter(Context context, List<Integer> listimage, List<String> listtitle) {
        this.context = context;
        this.listimage = listimage;
        this.listtitle = listtitle;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_title.setText(listtitle.get(position));
        holder.iv_icon.setImageResource(listimage.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (holder.getAdapterPosition()==2)
                {
                    Toast.makeText(view.getContext(),"shubham",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return listimage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_icon;
        private TextView tv_title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_icon=itemView.findViewById(R.id.iv_icon);
            tv_title=itemView.findViewById(R.id.tv_title);

        }
    }
}
