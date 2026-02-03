package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnpv implements fdpm, fdbl {
    final /* synthetic */ dnpz a;

    public dnpv(dnpz dnpzVar) {
        this.a = dnpzVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, dnpz.class, "onRecyclerViewWidthChanged", "onRecyclerViewWidthChanged(I)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) throws Resources.NotFoundException {
        int iIntValue = ((Number) obj).intValue();
        dnpz dnpzVar = this.a;
        Context contextA = dnpzVar.A();
        dnpzVar.p().M(contextA, iIntValue);
        dnpzVar.q().M(contextA, iIntValue);
        GridLayoutManager gridLayoutManager = dnpzVar.an;
        if (gridLayoutManager != null) {
            gridLayoutManager.r(dnpzVar.p().h);
        }
        dnph dnphVar = dnpzVar.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        dnphVar.a.an(dnpzVar.p().h * 12);
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
