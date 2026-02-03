package defpackage;

import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjf extends dmiz {
    public final dngc u;
    public final dmiv v;
    private final Button w;

    public dmjf(dngc dngcVar, View view, dmiv dmivVar) {
        super(view);
        this.u = dngcVar;
        this.v = dmivVar;
        this.w = (Button) view;
    }

    @Override // defpackage.dmiz
    public final Object C(fcxy fcxyVar) {
        this.w.setOnClickListener(new View.OnClickListener() { // from class: dmje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final dmjf dmjfVar = this.a;
                dmjfVar.u.a("CameraButtonViewHolder#onButtonClick", new View.OnClickListener() { // from class: dmjd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        view2.getClass();
                        dmjfVar.v.c.a(view2);
                    }
                });
            }
        });
        return fctx.a;
    }

    @Override // defpackage.dmiz
    public final Object E() {
        return fctx.a;
    }

    @Override // defpackage.dmiz
    public final void D(dmiu dmiuVar) {
    }
}
