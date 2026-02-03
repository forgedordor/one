package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxec {
    public final dxeb a;

    public dxec(View view, View view2) {
        view.getClass();
        view2.getClass();
        dxeb dxebVar = new dxeb(dwyh.a(view2.getContext(), fbfm.i()));
        dxebVar.setWillNotDraw(false);
        dxebVar.setLayerType(1, dxebVar.a);
        dxebVar.setOnClickListener(new View.OnClickListener() { // from class: dxdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ((dxeb) view3).c();
            }
        });
        this.a = dxebVar;
        dxebVar.d = view;
        dxebVar.b = new PopupWindow(dxebVar);
        dxebVar.addView(view);
        dxebVar.f = view2;
        dxebVar.d();
        dxebVar.e = 1;
        dxebVar.g = 2;
    }
}
