package abowers.sample.project.grimdb;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import java.util.ArrayList;

/**
 * Created by FDIC on 10/24/17.
 */

public class GrimDBArrayAdapter extends ArrayAdapter<ItemCard> {



    ArrayList<ItemCard> itemList = new ArrayList<ItemCard>();

    public GrimDBArrayAdapter(Context context, int textViewResourceId, ArrayList<ItemCard> objects) {
        super(context, textViewResourceId, objects);
        itemList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = inflater.inflate(R.layout.grim_db_item_category_view, null);

        //TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.categoryImageView);
        //extView.setText(itemList.get(position).getName());
        //textView.append(itemList.get(position).getLevelRequirement() + "");
        //Log.d("NAME", itemList.get(position).getName());
        return v;

    }


}
