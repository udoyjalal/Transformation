package com.example.transformation.FatBurn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.transformation.R;

import java.util.ArrayList;

public class FatBurnAdapter extends  RecyclerView.Adapter<FatBurnAdapter.ViewHolder>{

    private static final String TAG = "FatBurnAdapter";
    private final Context context;
    private final ArrayList<FatBurnDataModel> fatBurnDataModelList;
    ItemClickListenerFatBurn itemClickListenerFatBurn;
    int selectedIndex = -1;

    private FatBurnAdapterAction fatBurnAdapterAction;


    public FatBurnAdapter(Context context, ArrayList<FatBurnDataModel> fatBurnDataModelList, ItemClickListenerFatBurn itemClickListenerFatBurn) {
        this.context = context;
        this.fatBurnAdapterAction = (FatBurnAdapterAction) context;
        this.fatBurnDataModelList = fatBurnDataModelList;
        this.itemClickListenerFatBurn = itemClickListenerFatBurn;
    }
    @NonNull
    @Override
    public FatBurnAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_fatburn_list, parent, false);
        return new FatBurnAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        //     selectedIndex = position;

        FatBurnDataModel model = fatBurnDataModelList.get(position);
        holder.musicImage.setImageResource(model.getImage_fatBurn_workout());
        holder.musicName.setText(model.getTitle_fatBurn_workout());
        if(selectedIndex != -1){
            if(position == selectedIndex){
            }
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fatBurnAdapterAction.addFatBurnAdapterAction(position);
                notifyDataSetChanged();
            }
        });

    }


    @Override
    public int getItemCount() {

        Log.d(TAG, "getItemCount: dfbvdkfj "+ fatBurnDataModelList.size());
        return fatBurnDataModelList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView musicImage;
        TextView musicName, musicDuration;
        AppCompatButton btnMusicUse;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            musicImage = itemView.findViewById(R.id.imageMusic);
            musicName = itemView.findViewById(R.id.musicName);


        }
    }

}
