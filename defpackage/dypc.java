package defpackage;

import android.content.res.Resources;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypc implements View.OnAttachStateChangeListener {
    final /* synthetic */ dydi a;
    final /* synthetic */ dybw b;
    final /* synthetic */ vq c;
    final /* synthetic */ vq d;
    final /* synthetic */ dyfx e;
    final /* synthetic */ dyfx f;
    final /* synthetic */ vq g;
    final /* synthetic */ dypf h;

    public dypc(dypf dypfVar, dydi dydiVar, dybw dybwVar, vq vqVar, vq vqVar2, dyfx dyfxVar, dyfx dyfxVar2, vq vqVar3) {
        this.a = dydiVar;
        this.b = dybwVar;
        this.c = vqVar;
        this.d = vqVar2;
        this.e = dyfxVar;
        this.f = dyfxVar2;
        this.g = vqVar3;
        this.h = dypfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws Resources.NotFoundException {
        dypf dypfVar = this.h;
        ea eaVarF = fr.f(view);
        if (dypfVar.q.g()) {
            ((lvv) dypfVar.q.c()).f(eaVarF, dypfVar.g);
        }
        dydi dydiVar = this.a;
        dyay dyayVar = dypfVar.s;
        dydiVar.c(dyayVar);
        dybw dybwVar = this.b;
        vq vqVar = this.c;
        dybwVar.A(vqVar);
        vqVar.d(0, 0);
        dyayVar.b(dydiVar.a());
        vq vqVar2 = this.d;
        dybwVar.A(vqVar2);
        this.e.A(vqVar2);
        vqVar2.d(0, 0);
        dyfx dyfxVar = this.f;
        vq vqVar3 = this.g;
        dyfxVar.A(vqVar3);
        ((dypb) vqVar3).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dydi dydiVar = this.a;
        dypf dypfVar = this.h;
        dydiVar.d(dypfVar.s);
        dybw dybwVar = this.b;
        vq vqVar = this.d;
        dybwVar.C(vqVar);
        this.e.C(vqVar);
        dybwVar.C(this.c);
        this.f.C(this.g);
        if (dypfVar.q.g()) {
            ((lvv) dypfVar.q.c()).k(dypfVar.g);
        }
    }
}
