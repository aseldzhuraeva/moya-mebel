package com.example.pp_furniture.ui.kitchen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentKitchenBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KitchenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KitchenFragment extends Fragment {
    private FragmentKitchenBinding binding;

    List<FurnitureModel> list_kitchen = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kitchen);
        binding.rvKitchenRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_kitchen.add(new FurnitureModel("kitchen", "Стол Прованс" ,
                "890", "Деревянный стол в стиле прованс с резными ножками и столешницей из массива дуба" +
                " производство Франция, устойчив к влаге и повреждениям", R.drawable.table_provence));
        list_kitchen.add(new FurnitureModel("kitchen", "Стол Лесной Ручей" ,
                "1250", "Стол с натуральной деревянной столешницей и металлическим каркасом в стиле ретро" +
                " производство Германия, экологически чистые материалы", R.drawable.table_forest_stream));
        list_kitchen.add(new FurnitureModel("kitchen", "Стол Мраморный Взгляд" ,
                "1780", "Стол с мраморной столешницей и металлическим основанием с золотистым покрытием" +
                " производство Италия, роскошный дизайн и прочность", R.drawable.table_marble_gaze));
        list_kitchen.add(new FurnitureModel("kitchen", "Стол Фьюжн Декор" ,
                "980", "Стол с оригинальным фьюжн дизайном, сочетающим деревянные и металлические элементы" +
                " производство Япония, компактные размеры и функциональность", R.drawable.table_fusion_decor));
        list_kitchen.add(new FurnitureModel("kitchen", "Стол Скандинавский Бриз" ,
                "1450", "Стол с мягкими формами и натуральной дубовой столешницей в стиле скандинавского минимализма" +
                " производство Дания, прочный и легкий в уходе", R.drawable.table_scandinavian_breeze));



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kitchenFragment_to_navigation_home2);
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}