package com.example.probir.recyclerviewcardviewtofragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.probir.recyclerviewcardviewtofragment.FourFragment;
import com.example.probir.recyclerviewcardviewtofragment.FiveFragment;
import com.example.probir.recyclerviewcardviewtofragment.SixFragment;
import com.example.probir.recyclerviewcardviewtofragment.SevenFragment;
import com.example.probir.recyclerviewcardviewtofragment.EightFragment;
import com.example.probir.recyclerviewcardviewtofragment.NineFragment;
import com.example.probir.recyclerviewcardviewtofragment.TenFragment;
import com.example.probir.recyclerviewcardviewtofragment.ElevenFragment;
import com.example.probir.recyclerviewcardviewtofragment.TwelveFragment;
import com.example.probir.recyclerviewcardviewtofragment.ThirteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.FourteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.FifteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.SixteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.SeventeenFragment;
import com.example.probir.recyclerviewcardviewtofragment.EighteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.NinteenFragment;
import com.example.probir.recyclerviewcardviewtofragment.TwenteeyFragment;
import com.example.probir.recyclerviewcardviewtofragment.ItemModel;
import com.example.probir.recyclerviewcardviewtofragment.R;
import java.util.ArrayList;

public class ItemAdapter extends Adapter<ItemAdapter.itemView> {
    Context context;
    ArrayList<ItemModel> itemList = new ArrayList();

    public class itemView extends ViewHolder {
        TextView itemTV;

        public itemView(View itemView) {
            super(itemView);
            this.itemTV = (TextView) itemView.findViewById(R.id.itemTV);
            itemView.setOnClickListener(new OnClickListener(){
                public void onClick(View view) {
                    int id = itemView.this.getAdapterPosition();
                    Fragment fragment = null;
                    boolean flag = false;
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    switch (id) {
                        case 0:
                            fragment = new FourFragment();
                            flag = true;
                            break;
                        case 1:
                            fragment = new FiveFragment();
                            flag = true;
                            break;
                        case 2:
                            fragment = new SixFragment();
                            flag = true;
                            break;
                        case 3:
                            fragment = new SevenFragment();
                            flag = true;
                            break;
                        case 4:
                            fragment = new EightFragment();
                            flag = true;
                            break;
                        case 5:
                            fragment = new NineFragment();
                            flag = true;
                            break;
                        case 6:
                            fragment = new TenFragment();
                            flag = true;
                            break;
                        case 7:
                            fragment = new ElevenFragment();
                            flag = true;
                            break;
                        case 8:
                            fragment = new TwelveFragment();
                            flag = true;
                            break;
                        case 9:
                            fragment = new ThirteenFragment();
                            flag = true;
                            break;
                        case 10:
                            fragment = new FourteenFragment();
                            flag = true;
                            break;
                        case 11:
                            fragment = new FifteenFragment();
                            flag = true;
                            break;
                        case 12:
                            fragment = new SixteenFragment();
                            flag = true;
                            break;
                        case 13:
                            fragment = new SeventeenFragment();
                            flag = true;
                            break;
                        case 14:
                            fragment = new EighteenFragment();
                            flag = true;
                            break;
                        case 15:
                            fragment = new NinteenFragment();
                            flag = true;
                            break;
                        case 16:
                            fragment = new TwenteeyFragment();
                            flag = true;
                            break;
                        default:
                            Toast.makeText(ItemAdapter.this.context, id + BuildConfig.FLAVOR, 0).show();
                            break;
                    }
                    if (flag) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).addToBackStack(null).commit();
                    }
                }

            });
        }
    }


    public ItemAdapter(Context context, ArrayList<ItemModel> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    public itemView onCreateViewHolder(ViewGroup parent, int viewType) {
        return new itemView(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false));
    }

    public void onBindViewHolder(itemView holder, int position) {
        holder.itemTV.setText(((ItemModel) this.itemList.get(position)).getListitem());
    }

    public int getItemCount() {
        return this.itemList.size();
    }

}
