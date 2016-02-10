package de.fischerprofil.fp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.fischerprofil.fp.R;
import de.fischerprofil.fp.model.reference.ReferenceImage;
import de.fischerprofil.fp.rest.PicassoUtils;

/**
 * Created by Suleiman19 on 10/22/15.
 */
public class GalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<ReferenceImage> data = new ArrayList<>();

    Picasso picasso;

    public GalleryAdapter(Context context, List<ReferenceImage> data) {
        this.context = context;
        this.data = data;
        picasso = PicassoUtils.buildPicasso(context);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        View v;
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_refeferencelist, parent, false);
            viewHolder = new MyItemHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

/*      // Bilder laden mit Glide
        Glide.with(context).load(data.get(position).getUrl())
                .thumbnail(0.5f)
                .override(200,200)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(((MyItemHolder) holder).mImg);
*/

        picasso.load(data.get(position).getUrl()).resize(200,200).placeholder(R.drawable.progress_animation_small).error(R.drawable.ic_default).into(((MyItemHolder) holder).mImg);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyItemHolder extends RecyclerView.ViewHolder {

        ImageView mImg;
        TextView mTag;

        ImageView img1;

        public MyItemHolder(View itemView) {
            super(itemView);

            mImg = (ImageView) itemView.findViewById(R.id.item_img);
            mTag = (TextView) itemView.findViewById(R.id.tvImageName);

            img1 = (ImageView) itemView.findViewById(R.id.item_img);

            img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Image geklickt", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


}
