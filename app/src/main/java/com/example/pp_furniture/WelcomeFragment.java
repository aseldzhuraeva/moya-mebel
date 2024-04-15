package com.example.pp_furniture;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pp_furniture.databinding.FragmentKitchenBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WelcomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WelcomeFragment extends Fragment {

    private FragmentKitchenBinding binding;

    List<FurnitureModel> list_welcome = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_welcome);
        binding.rvKitchenRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_welcome.add(new FurnitureModel("Прихожая", "Консоль 'Элегантная Линия'",
                "720", "Эта элегантная консоль с изящными изгибами и стеклянной столешницей станет прекрасным дополнением к вашей прихожей. " +
                "Идеально подходит для размещения декоративных предметов и создания стильного интерьера.", "50%", R.drawable.console_elegant_line));
        list_welcome.add(new FurnitureModel("Прихожая", "Шкаф 'Гармония Порядка'",
                "1050", "Этот шкаф с ящиками и вешалками поможет вам организовать пространство в вашей прихожей и сохранить порядок. " +
                "Изготовлен из прочного дерева с эстетичным дизайном и функциональной компоновкой.", "40%", R.drawable.cabinet_harmony_order));
        list_welcome.add(new FurnitureModel("Прихожая", "Пуф 'Уютный Уголок'",
                "350", "Этот мягкий пуф с текстильной обивкой и вместительным внутренним отделением идеально подойдет для вашей прихожей. " +
                "Удобное сиденье и дополнительное хранение - все, что нужно для комфортного пребывания.", "60%", R.drawable.ottoman_cozy_corner));




    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_welcomeFragment_to_navigation_home);
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}