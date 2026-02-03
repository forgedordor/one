package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyli implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ dzdh a;
    final /* synthetic */ View b;
    final /* synthetic */ lvj c;
    final /* synthetic */ fr d;
    final /* synthetic */ ejwi e;
    final /* synthetic */ dyll f;

    public dyli(dyll dyllVar, dzdh dzdhVar, View view, lvj lvjVar, fr frVar, ejwi ejwiVar) {
        this.a = dzdhVar;
        this.b = view;
        this.c = lvjVar;
        this.d = frVar;
        this.e = ejwiVar;
        this.f = dyllVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dzdh dzdhVar = this.a;
        if (dzdg.a(dzdhVar)) {
            dyqy.a(this.b, this);
            this.f.b(this.c, this.d, dzdhVar);
        }
    }
}
