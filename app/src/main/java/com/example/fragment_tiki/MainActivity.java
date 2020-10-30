package com.example.fragment_tiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fragment_tiki.adapter.BookAdapter;
import com.example.fragment_tiki.adapter.HeroAdapter;
import com.example.fragment_tiki.fragment.Fragment_recycleview;
import com.example.fragment_tiki.model.Book;
import com.example.fragment_tiki.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Book> bookList;
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment_recycleview fragment_recycleview = new Fragment_recycleview();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame, fragment_recycleview, "fragmentAbove")
                .commit();

//        addControl();
//        addEvent();
    }

    private void addControl() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        bookList = new ArrayList<>();
        bookAdapter = new BookAdapter(this,bookList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(bookAdapter);
    }

    private void addEvent() {
        /** Call method add data*/
        createData();
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
}