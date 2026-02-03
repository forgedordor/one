package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofy extends wv {
    public final TextView s;
    public final TextView t;
    public final ImageView u;

    public ofy(final ogh oghVar, View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.exo_main_text);
        this.t = (TextView) view.findViewById(R.id.exo_sub_text);
        this.u = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new View.OnClickListener() { // from class: ofx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ogh oghVar2 = oghVar;
                int iFt = this.a.ft();
                if (iFt == 0) {
                    ofw ofwVar = oghVar2.g;
                    View view3 = oghVar2.v;
                    mee.f(view3);
                    oghVar2.a(ofwVar, view3);
                    return;
                }
                if (iFt != 1) {
                    oghVar2.j.dismiss();
                    return;
                }
                oft oftVar = oghVar2.i;
                View view4 = oghVar2.v;
                mee.f(view4);
                oghVar2.a(oftVar, view4);
            }
        });
    }
}
