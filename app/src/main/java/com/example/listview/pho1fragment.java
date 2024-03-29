package com.example.listview;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pho1fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pho1fragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public  String account;
    private Button btn_takephotos;
    private Button btn_history;

    public pho1fragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pho1fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static pho1fragment newInstance(String param1, String param2) {
        pho1fragment fragment = new pho1fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getActivity(),R.layout.fragment_pho1fragment,null);
        view.findViewById(R.id.btn_takephotos).setOnClickListener(this);
        view.findViewById(R.id.btn_history).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_takephotos:
                Intent intent=new Intent();
                intent.setClass(Objects.requireNonNull(getActivity()).getApplicationContext(),TakephotoActivity.class);
                TakephotoActivity.account=account;
                startActivity(intent);
                break;
            case R.id.btn_history:
                Intent intent1=new Intent();
                intent1.setClass(Objects.requireNonNull(getActivity()).getApplicationContext(),HistoryActivity.class);
                HistoryActivity.account=account;
                startActivity(intent1);
        }

    }
}