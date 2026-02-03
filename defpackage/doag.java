package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doag extends wv {
    public static final /* synthetic */ int w = 0;
    public final View s;
    public final ImageView t;
    public final TextView u;
    final /* synthetic */ doah v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doag(doah doahVar, View view) {
        super(view);
        this.v = doahVar;
        this.s = view;
        View viewFindViewById = view.findViewById(R.id.gifsticker_category_thumbnail);
        viewFindViewById.getClass();
        this.t = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.gifsticker_category_label);
        viewFindViewById2.getClass();
        this.u = (TextView) viewFindViewById2;
    }
}
