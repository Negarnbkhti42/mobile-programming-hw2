package com.example.bookshelf.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookshelf.R;
import com.example.bookshelf.viewholders.BookViewHolder;

import java.util.LinkedList;
import java.util.List;

public class BookListAdaptor extends RecyclerView.Adapter<BookViewHolder>{

    private List<String> bookList;
    private LayoutInflater bookInflater;

    public BookListAdaptor(Context context, List<String> BookList) {
        bookInflater = LayoutInflater.from(context);
        this.bookList = BookList;
    }
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = bookInflater.inflate(R.layout.layout_book_item, parent, false);
        return new BookViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
