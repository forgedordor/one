package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctun extends fcyz implements fdat {
    final /* synthetic */ igr a;
    final /* synthetic */ dpir b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctun(igr igrVar, dpir dpirVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = igrVar;
        this.b = dpirVar;
        this.c = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a(new igq());
        dpir dpirVar = this.b;
        if (dpirVar != null) {
            dpirVar.h(this.c, false);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctun(this.a, this.b, this.c, fcxyVar);
    }
}
