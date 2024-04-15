package com.example.pp_furniture.ui.dashboard;

import android.app.Activity;
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
import com.example.pp_furniture.databinding.FragmentBedRoomBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {

        list_bedroom.add(new FurnitureModel("bed_room", "Кровать ЛАЙТ КР-002", "10 000",
                "Отличительной особенностью кровати ЛАЙТ являются геометрически правильные формы. Кровать ЛАЙТ прекрасно сочетается с остальной мебелью из линейки \"ЛАЙТ\" и станет неотъемлемой частью, для любой спальни.", R.drawable.bed_shining_dawn));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать без основания НЕПО", "6 825",
                "Коллекция Непо создана для ценителей натуральных оттенков дерева, простых форм, четких линий.", R.drawable.bed_moon_lake));
        list_bedroom.add(new FurnitureModel("bed_room", "Детская кровать Маленький исследователь", "14500",
                "Представляем вам детскую кровать Маленький исследователь - идеальное решение для создания уютной и безопасной спальной зоны для вашего ребенка. Эта кровать сочетает в себе стильный дизайн, высокое качество материалов и функциональность. " +
                        "Система управления комфортом через мобильное приложение.", R.drawable.bed_zenith_light));
        list_bedroom.add(new FurnitureModel("bed_room", "Диван-кровать Универсальный комфорт", "25000",
                "Представляем вам удивительное сочетание стиля, функциональности и комфорта - диван-кровать Универсальный комфорт. Этот многофункциональный предмет мебели идеально подходит для гостиной, кабинета или спальни, обеспечивая уютное место для отдыха и сна. " +
                        "Элегантный дизайн с ручной резьбой и встроенные ящики для белья.", R.drawable.bed_imperial_rest));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать с балдахином", "16690",
                "Кровать из массива красного дуба с мягкой тканью, размер 2.2м х 2.0м, производство Голландия. " +
                        "Интегрированная система релаксации с ароматическими диффузорами.", R.drawable.bed_magic_dream));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать с мягким изголовьем", "1950",
                "Кровать из массива вишневого дерева с роскошной шелковой обивкой, размер 2.6м х 2.3м, производство Испания. " +
                        "Ручная роспись элементов и встроенная система массажа.", R.drawable.bed_luxurious_rest));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать-трансформер (с возможностью изменения конфигурации)", "1780",
                "Кровать из массива ясеня с декоративной тканью, размер 2.4м х 2.2м, производство США. " +
                        "Уникальный дизайн в стиле ретро и встроенная подсветка.", R.drawable.bed_fairy_floor));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать-мансарда (встроенная в потолок или стену)", "2100",
                "Кровать из массива ольхи с мягким бархатом, размер 2.8м х 2.5м, производство Швеция. " +
                        "Встроенная система звукового сна и регулируемая подсветка.", R.drawable.bed_star_sleep));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}