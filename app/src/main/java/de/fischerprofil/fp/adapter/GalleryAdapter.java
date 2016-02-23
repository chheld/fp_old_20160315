package de.fischerprofil.fp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.fischerprofil.fp.R;
import de.fischerprofil.fp.model.reference.GalleryImage;
import de.fischerprofil.fp.rest.PicassoUtils;
import de.fischerprofil.fp.rest.RestUtils;
import de.fischerprofil.fp.ui.UIUtils;

public class GalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;
    List<GalleryImage> mDataset = new ArrayList<>();

    Picasso mPicasso;

    static final String URL = RestUtils.getApiURL();

    public GalleryAdapter(Context context, List<GalleryImage> data) {
        mContext = context;
        mDataset = data;
        mPicasso = PicassoUtils.buildPicasso(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallerylist, parent, false);
        viewHolder = new MyItemHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

      // Bilder laden mit Glide
//        Glide.with(mContext).load("https://www.google.es/images/srpr/logo11w.png")
//        Glide.with(mContext).load(mDataset.get(position).getUrl())
//                .thumbnail(0.8f)
//                .override(200,200)
//                .crossFade()
//                .error(R.drawable.ic_default)
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(((MyItemHolder) holder).mImg);

    mPicasso.with(mContext);
    mPicasso.setIndicatorsEnabled(true);
    mPicasso.setLoggingEnabled(true);

    mPicasso.load(mDataset.get(position).getUrl())
            .stableKey(mDataset.get(position).getUrl())
            .resize(150,150)
            .placeholder(R.drawable.ic_hourglass_black)
            .error(R.drawable.ic_default)
            .centerCrop()
            .tag(holder)
            .into(((MyItemHolder) holder).mImg, new Callback() {
                @Override
                public void onSuccess() {
                    // mLoaderBar.setVisibility(View.GONE);
                }

                @Override
                public void onError() {
                    //
                }
            });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
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
                    showGalleryDialog(v, URL + "/../pics/2008/BARD%20Emden/DSCF1241_1.jpg"); //TEST
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

//                Intent intent = new Intent(mContext, ReferenceDetailActivity.class);
//                intent.putParcelableArrayListExtra("mDataset", mDataset);
//                intent.putExtra("pos", position);
//                v.getContext().startActivity(intent);

            }
        }
        catch (Exception e) {
            UIUtils.makeToast(v.getContext(), "Image kann nicht angezeigt werden");
        }
    }
}
