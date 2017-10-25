package abowers.sample.project.grimdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList<ItemCard> itemList = new ArrayList<ItemCard>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (GridView) findViewById(R.id.grimDBCategoryView);

        itemList = createItemListData();

        GrimDBArrayAdapter grimArrayAdapter = new GrimDBArrayAdapter(this, R.layout.grim_db_list_view, itemList);
        simpleList.setAdapter(grimArrayAdapter);
    }

    private ArrayList<ItemCard> createItemListData() {
        ArrayList<ItemCard> itemCardList = new ArrayList<ItemCard>();
        String[] attributes = {"100", "100", "100"};
        for (int i = 0; i < 15; i++) {
            ItemCard item = new ItemCard();
            item.setName("Test Name: " + i);
            item.setLevelRequirement(i);
            itemCardList.add(item);
        }

        return itemCardList;
    }
}
