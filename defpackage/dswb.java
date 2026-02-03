package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswb {
    public final dsxb a;
    public final dsvx b;

    public dswb(dsxb dsxbVar) {
        this.a = dsxbVar;
        this.b = new dsvx(dsxbVar);
    }

    public final dsuy a(int i) {
        return new dsuy(dsvc.a(i), new ejvr() { // from class: dsvy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new UnsupportedOperationException("Do not call attach()");
            }
        }, this.a, null);
    }

    @Deprecated
    public final dsuy b(final View view, int i) {
        return new dsuy(dsvc.a(i), new ejvr() { // from class: dsvz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                View view2 = view;
                dsvd dsvdVar = (dsvd) obj;
                dsvd dsvdVarC = dsvu.c(view2);
                if (dsvdVarC == null) {
                    dsvu.s(view2, dsvdVar);
                    return dsvdVar;
                }
                if (!dsvdVarC.e()) {
                    dsvdVarC.d(dsvdVar);
                    return dsvdVarC;
                }
                dswb dswbVar = this.a;
                if (dsvdVarC.f()) {
                    dswbVar.a.d(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                    return dsvdVarC;
                }
                dswbVar.a.d(new IllegalStateException("CVE is already attached and cannot be replaced."));
                return dsvdVarC;
            }
        }, this.a, null);
    }
}
