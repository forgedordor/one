package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afys extends fcyz implements fdat {
    final /* synthetic */ lva a;
    final /* synthetic */ igr b;
    final /* synthetic */ dpir c;
    final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afys(lva lvaVar, igr igrVar, dpir dpirVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = lvaVar;
        this.b = igrVar;
        this.c = dpirVar;
        this.d = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afys) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a == lva.ON_RESUME) {
            this.b.a(new igq());
            dpir dpirVar = this.c;
            if (dpirVar != null) {
                dpirVar.h(this.d, false);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afys(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
