package com.example.comidanordestinas.adaptador;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comidanordestinas.databinding.FoodItemBinding;
import com.example.comidanordestinas.model.food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private final ArrayList<food> foodList;

    public FoodAdapter(ArrayList<food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Infla o layout para cada item da lista
        FoodItemBinding binding = FoodItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new FoodViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        // Pega o objeto 'Food' da posição atual na lista
        food currentFood = foodList.get(position);

        // Usa os métodos 'get' do objeto 'Food' para preencher as Views
        holder.binding.imgfood.setImageResource(currentFood.getImgfood());
        holder.binding.txtfoodname.setText(currentFood.getFoodname());
        holder.binding.txtfooddescription.setText(currentFood.getFooddescription());
        holder.binding.txtprice.setText(currentFood.getPrice());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        FoodItemBinding binding;

        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding; // Armazena a referência para o binding do layout do item
        }
    }
}