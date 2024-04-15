package com.example.pp_furniture.ui.home;

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

import com.airbnb.lottie.LottieAnimationView;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentHomeBinding;
import com.example.pp_furniture.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    List<CategoryModel> list_category = new ArrayList<>();
    CategoryAdapter adapter;
    LottieAnimationView lotty_sale;
    LottieAnimationView lotty_discount;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.furnitura);

        lotty_discount = binding.lottyDiscout;
        lotty_discount.setAnimation(R.raw.skidka);

        createList();
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_category.add(new CategoryModel("Для спальни", R.drawable.bed_parlament));
        list_category.add(new CategoryModel("Для гостинной",R.drawable.sofa_yellow));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.kuh_furn));
        list_category.add(new CategoryModel("Юношеские гарнитуры",R.drawable.detskii_garnitur58));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.garden_furn));
        list_category.add(new CategoryModel("Мебель для прихожей",R.drawable.prihozhaya_mebel));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}