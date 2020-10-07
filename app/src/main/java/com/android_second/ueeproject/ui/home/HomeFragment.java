package com.android_second.ueeproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android_second.ueeproject.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ViewFlipper imgBanner;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        imgBanner=root.findViewById(R.id.select_product_image);
        int sliders[]={R.drawable.slider,R.drawable.slider2,R.drawable.slider3,R.drawable.slider4};
        for(int slide:sliders){
            bannerFlipper(slide);
        }
        return root;
    }
    private void bannerFlipper(int image){
        ImageView imgView=new ImageView(getContext());
        imgView.setImageResource(image);
        imgBanner.addView(imgView);
        imgBanner.setFlipInterval(6000);
        imgBanner.setAutoStart(true);
        imgBanner.setInAnimation(getContext(),android.R.anim.fade_in);
        imgBanner.setOutAnimation(getContext(),android.R.anim.fade_out);
    }

}