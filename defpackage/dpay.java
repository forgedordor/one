package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpay extends wv {
    public static final /* synthetic */ int x = 0;
    public final View s;
    public final ImageView t;
    public final TextView u;
    public final View v;
    final /* synthetic */ dpaz w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpay(dpaz dpazVar, View view) {
        super(view);
        this.w = dpazVar;
        this.s = view;
        View viewFindViewById = view.findViewById(R.id.sticker_pack_thumbnail);
        viewFindViewById.getClass();
        this.t = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sticker_pack_label);
        viewFindViewById2.getClass();
        this.u = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sticker_pack_favorite_indicator);
        viewFindViewById3.getClass();
        this.v = viewFindViewById3;
    }
}
