package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czcy extends wv {
    public final ImageView s;
    public final rbr t;
    public final czcu u;
    public final ConstraintLayout v;

    public czcy(View view, rbr rbrVar, czcu czcuVar) {
        super(view);
        this.t = rbrVar;
        this.u = czcuVar;
        this.s = (ImageView) view.findViewById(R.id.gif_content_image);
        this.v = (ConstraintLayout) view;
        view.setClipToOutline(true);
    }
}
