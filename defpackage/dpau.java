package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpau extends wv {
    public static final /* synthetic */ int y = 0;
    public final View s;
    public final TextView t;
    public final TextView u;
    public final View v;
    public final ImageView w;
    final /* synthetic */ dpav x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpau(dpav dpavVar, View view) {
        super(view);
        this.x = dpavVar;
        this.s = view;
        View viewFindViewById = view.findViewById(R.id.sticker_pack_title_label);
        viewFindViewById.getClass();
        this.t = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sticker_pack_artist_label);
        viewFindViewById2.getClass();
        this.u = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.back_button);
        viewFindViewById3.getClass();
        this.v = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.favorite_button);
        viewFindViewById4.getClass();
        this.w = (ImageView) viewFindViewById4;
    }

    public final void C(View view) {
        doyu doyuVar = this.x.f;
        if (doyuVar == null) {
            fdbq.c("stickerPack");
            doyuVar = null;
        }
        if (doyuVar.f) {
            ImageView imageView = this.w;
            imageView.setImageResource(R.drawable.quantum_gm_ic_favorite_vd_theme_24);
            imageView.setContentDescription(view.getResources().getString(R.string.sticker_pack_favorite_button_remove_content_description));
            imageView.setSelected(true);
            return;
        }
        ImageView imageView2 = this.w;
        imageView2.setImageResource(R.drawable.quantum_gm_ic_favorite_border_vd_theme_24);
        imageView2.setSelected(false);
        imageView2.setContentDescription(view.getResources().getString(R.string.sticker_pack_favorite_button_add_content_description));
    }
}
