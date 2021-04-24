package com.example.tugas4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    //menghubungkan ke layout activity main
    private RecyclerView recyclerView;
    //data yg akan ditampilkan adapter ke recycler
    private ArrayList<OppoModel> oppoModels = new ArrayList<>();

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        oppoModels.addAll(OppoData.getListData());
        showRecycleList();
    }

    //mengatur tata letak tampilan
    private  void showRecycleList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        OppoAdapter oppoAdapter = new OppoAdapter(OppoData.getListData(), getActivity());
        oppoAdapter.setOppoModels(oppoModels);
        recyclerView.setAdapter(oppoAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}