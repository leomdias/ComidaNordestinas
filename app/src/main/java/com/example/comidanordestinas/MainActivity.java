package com.example.comidanordestinas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comidanordestinas.adaptador.FoodAdapter;
import com.example.comidanordestinas.databinding.ActivityMainBinding;
import com.example.comidanordestinas.model.food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter; // Corrigido: nome da variável
    private ArrayList<food> foodList = new ArrayList<>(); // Corrigido: Nome da classe "Food"

    @Override // Adicionado: Anotação @Override é uma boa prática
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configuração do RecyclerView
        RecyclerView recyclerviewfood = binding.recyclerviewfood;
        recyclerviewfood.setLayoutManager(new LinearLayoutManager(this));
        recyclerviewfood.setHasFixedSize(true);

        // Configuração do Adapter
        foodAdapter = new FoodAdapter(foodList); // <-- Agora sem o 'this'
        recyclerviewfood.setAdapter(foodAdapter);


        getFoods();
    }

    private void getFoods() {

        food food1 = new food(
                R.drawable.food,
                "Baião de Dois",
                "Um prato clássico com arroz, feijão fradinho, carne seca e queijo coalho.",
                "R$ 25,00"
        );
        foodList.add(food1);

        food Food2 = new food(
                R.drawable.food2 ,
                "Carne de Sol com Macaxeira",
                "Carne de sol acebolada servida com macaxeira (aipim) frita na manteiga de garrafa.",
                "R$ 35,00"
        );
        foodList.add(Food2);

        food food3 = new food(
                R.drawable.food3,
                "Moqueca de Camarão",
                "Deliciosa moqueca com camarões frescos, leite de coco, azeite de dendê e pimentões.",
                "R$ 45,00"
        );
        foodList.add(food3);

        food food4 = new food(
                R.drawable.food4,
                "Tapioca Rendada",
                "Tapioca com queijo coalho tostado por fora, recheada com carne seca e catupiry.",
                "R$ 15,00"
        );
        foodList.add(food4);
    }
}