package de.fischerprofil.fp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.fischerprofil.fp.R;
import de.fischerprofil.fp.model.reference.ReferenceImage;
import de.fischerprofil.fp.rest.PicassoUtils;
import de.fischerprofil.fp.rest.RestUtils;
import de.fischerprofil.fp.ui.UIUtils;

/**
 * Created by Suleiman19 on 10/22/15.
 */
public class GalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<ReferenceImage> data = new ArrayList<>();

    Picasso picasso;

    private final String URL = RestUtils.getApiURL();

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

      // Bilder laden mit Glide
//        Glide.with(context).load(data.get(position).getUrl())
        Glide.with(context).load("https://www.google.es/images/srpr/logo11w.png")
                .thumbnail(0.5f)
                .override(200,200)
                .crossFade()
                .error(R.drawable.ic_default)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(((MyItemHolder) holder).mImg);


//        picasso.load(data.get(position).getUrl()).
//                resize(150,150).
//                placeholder(R.drawable.ic_logo_small_transparent).
//                error(R.drawable.ic_default).
//                into(((MyItemHolder) holder).
//                        mImg);
//        picasso.load(data.get(position).getUrl()).resize(200,200).error(R.drawable.ic_default).into(((MyItemHolder) holder).mImg);
//        picasso.load(data.get(position).getUrl()).resize(200,200).placeholder(R.drawable.progress_small).error(R.drawable.ic_default).into(((MyItemHolder) holder).mImg);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static public class MyItemHolder extends RecyclerView.ViewHolder {

        TextView mTag;

        public final ImageView mImg;

        public MyItemHolder(View itemView) {
            super(itemView);

            mImg = (ImageView) itemView.findViewById(R.id.item_img);
            mTag = (TextView) itemView.findViewById(R.id.tvImageName);

            mImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showGalleryDialog(v, "https://222.222.222.60/pics/2008/BARD%20Emden/DSCF1241_1.jpg"); //TEST
                }
            });
        }
    }

    static void showGalleryDialog(View v, String nr) {

        UIUtils.makeToast(v.getContext(), "Starte " + nr); //TEST

        try {
            if (nr != null && nr != "") {

                //TODO neues fragment anzeigen
//                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(nr).build();
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                v.getContext().startActivity(intent);

//                Intent intent = new Intent(context, ReferenceDetailActivity.class);
//                intent.putParcelableArrayListExtra("data", data);
//                intent.putExtra("pos", position);
//                v.getContext().startActivity(intent);

            }
        }
        catch (Exception e) {
            UIUtils.makeToast(v.getContext(), "Image kann nicht angezeigt werden");
        }
    }
}
