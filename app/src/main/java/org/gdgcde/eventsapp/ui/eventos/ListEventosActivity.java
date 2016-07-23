package org.gdgcde.eventsapp.ui.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.gdgcde.eventsapp.R;
import org.gdgcde.eventsapp.adapters.EventosAdapter;

public class ListEventosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        String[] mDataset = new String[3];
        mDataset[0] = "evento1";
        mDataset[1] = "evento2";
        mDataset[2] = "evento3";
        // specify an adapter (see also next example)
        mAdapter = new EventosAdapter(mDataset);
        recyclerView.setAdapter(mAdapter);

    }
}
