package com.example.fragment_tiki.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_tiki.R;
import com.example.fragment_tiki.adapter.BookAdapter;
import com.example.fragment_tiki.adapter.DonutAdapter;
import com.example.fragment_tiki.model.Book;
import com.example.fragment_tiki.model.Donut;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_recycleview extends Fragment {


    private List<Book> bookList;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Donut> donutList;
    private DonutAdapter donutAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycleview,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        bookList = new ArrayList<>();
        donutList = new ArrayList<>();
//        bookAdapter = new BookAdapter(getActivity(),bookList);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setAdapter(bookAdapter);
        donutAdapter = new DonutAdapter(donutList, getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(donutAdapter);
        createData1();
        return view;
    }



    /** Add data to bookList*/
    public void createData() {
        Book book = new Book("Kỳ Án Ánh Trăng","Xác treo trong nhà gỗ","100.000");
        bookList.add(book);
        book = new Book("Tuyết Đoạt Hồn","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        book = new Book("Tơ Đòng Rỏ Máu","Xác treo trong nhà gỗ","100.000");
        bookList.add(book);
        book = new Book("Hồ Tuyệt Mệnh","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        book = new Book("Nỗi Đau Của Đom Đóm","Qủy Cổ Nữ","100.000");
        bookList.add(book);
        bookAdapter.notifyDataSetChanged();
    }

    public void createData1(){
        Donut donut = new Donut("bánh 1","ngon", "300",R.drawable.donut_yellow);
        Donut donut2 = new Donut("bánh 2","ngon lắm","300", R.drawable.donut_yellow);
        Donut donut3 = new Donut("bánh 3","rất ngon","300", R.drawable.donut_yellow);
        Donut donut4 = new Donut("bánh 4","rất ngon","300", R.drawable.donut_yellow);
        donutList.add(donut);
        donutList.add(donut2);
        donutList.add(donut3);
        donutList.add(donut4);
        donutAdapter.notifyDataSetChanged();

    }
}
