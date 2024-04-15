package com.example.pp_furniture.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentZalBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;

NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("zal", "Диван Лаванда" ,
                "1790", "Диван трехместный с мягкой обивкой из натурального льна" +
                " производство Франция, вставки из дерева и кованые элементы", R.drawable.sofa_lavender));
        list_zal.add(new FurnitureModel("zal", "Диван Летний Бриз" ,
                "2050", "Угловой диван с модульной конструкцией и встроенными подушками для оптимального комфорта" +
                " производство Испания, экологически чистые материалы", R.drawable.sofa_summer_breeze));
        list_zal.add(new FurnitureModel("zal", "Диван Марокканский Сон" ,
                "2390", "Элегантный диван с мягкой вельветовой обивкой в стиле марокканского искусства" +
                " производство Марокко, ручная роспись и декоративные подушки", R.drawable.sofa_moroccan_dream));
        list_zal.add(new FurnitureModel("zal", "Диван Амстердамский Вечер" ,
                "1850", "Диван с высокой спинкой из натурального дерева и мягкой тканью в стиле амстердамского классицизма" +
                " производство Нидерланды, функциональные подлокотники", R.drawable.sofa_amsterdam_evening));
        list_zal.add(new FurnitureModel("zal", "Диван Римская Роскошь" ,
                "2650", "Роскошный диван с резными элементами из массива дуба и бархатной обивкой в римском стиле" +
                " производство Италия, инкрустация из драгоценных камней", R.drawable.sofa_roman_luxury));
        list_zal.add(new FurnitureModel("zal", "Диван Провансальный Шарм" ,
                "1980", "Уютный диван в стиле прованс с мягкой льняной обивкой и деревянными ножками" +
                " производство Франция, декоративные подушки в комплекте", R.drawable.sofa_provence_charm));
        list_zal.add(new FurnitureModel("zal", "Диван Скандинавская Простота" ,
                "1750", "Минималистичный диван с прочной обивкой из шерсти и деревянными подлокотниками" +
                " производство Дания, функциональный дизайн и устойчивость", R.drawable.sofa_scandinavian_simplicity));
        list_zal.add(new FurnitureModel("zal", "Диван Венецианская Элегантность" ,
                "2250", "Элегантный диван с изогнутой спинкой из массива вишневого дерева и шелковой обивкой" +
                " производство Италия, ручная роспись и декоративные детали", R.drawable.sofa_venetian_elegance));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            binding.btnBack.setOnClickListener(v->{
                navController = Navigation.findNavController(requireActivity(),
                        R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.action_navigation_zal_to_navigation_home);
            });

          

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}