package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czco extends wv {
    public final cvjo s;
    public final TextView t;
    public final czcm u;

    public czco(cvjo cvjoVar, View view, czcm czcmVar) {
        super(view);
        this.s = cvjoVar;
        view.setClipToOutline(true);
        this.u = czcmVar;
        this.t = (TextView) view.findViewById(R.id.gif_browser_category_text);
    }
}
