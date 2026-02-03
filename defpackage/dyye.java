package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyye implements dyyb {
    private final dtah a;
    private final dyxp b;
    private final ejxr c;

    public dyye(dxxk dxxkVar, dyau dyauVar, dtah dtahVar, ejxr ejxrVar) {
        this.a = dtahVar;
        this.c = ejxrVar;
        this.b = new dyxp(this, new dyyd(this, dtahVar), dxxkVar, dyauVar);
    }

    private final dsuy h(int i) {
        return g(i, ejud.a);
    }

    @Override // defpackage.dyyb
    public final void a(View view, int i) {
        ecem.c();
        dyxp dyxpVar = this.b;
        dyxo dyxoVar = new dyxo(dyxpVar, view, i);
        view.addOnAttachStateChangeListener(dyxoVar);
        dyxpVar.b(view, i, dyxpVar.a.a());
        int[] iArr = ley.a;
        if (view.isAttachedToWindow()) {
            dyxoVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.dyyb
    public final void b(View view, int i) {
        ecem.c();
        this.a.b().b(view, h(i));
    }

    @Override // defpackage.dyyb
    public final void c(View view, int i) {
        ecem.c();
        this.a.b().e(view, h(i));
    }

    @Override // defpackage.dyyb
    public final void d(View view, int i, dsva dsvaVar) {
        ecem.c();
        dsvx dsvxVarB = this.a.b();
        dsuy dsuyVarH = h(i);
        dsuyVarH.f(dsvaVar);
        dsvxVarB.b(view, dsuyVarH);
    }

    @Override // defpackage.dyyb
    public final void e(View view) {
        ecem.c();
        this.a.b().c(view);
    }

    @Override // defpackage.dyyb
    public final void f(dsve dsveVar, View view) {
        dyyg.a(this.a.a(), dsveVar, view);
    }

    public final dsuy g(int i, ejwi ejwiVar) {
        dsuy dsuyVarA = this.a.c().a(i);
        dsvb dsvbVar = (dsvb) this.c.get();
        if (dsvbVar != null) {
            dsuyVarA.g(dsvbVar);
            return dsuyVarA;
        }
        if (ejwiVar.g()) {
            dsuyVarA.g(((dyxj) ejwiVar.c()).a());
        }
        return dsuyVarA;
    }
}
