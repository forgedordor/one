package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytk implements View.OnAttachStateChangeListener {
    final /* synthetic */ dytx a;
    final /* synthetic */ dytu b;

    public dytk(dytu dytuVar, dytx dytxVar) {
        this.a = dytxVar;
        this.b = dytuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dyax dyaxVar = ((dyrq) this.a).b;
        dytu dytuVar = this.b;
        dyay dyayVar = dytuVar.z;
        dyaxVar.c(dyayVar);
        if (dyaxVar.c) {
            dytuVar.h(false);
            dyayVar.b(dyaxVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((dyrq) this.a).b.d(this.b.z);
    }
}
