package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afoe extends fcyz implements fdat {
    final /* synthetic */ dpir a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoe(dpir dpirVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dpirVar;
        this.b = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afoe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dpir dpirVar = this.a;
        if (dpirVar != null) {
            dpirVar.h(this.b, false);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afoe(this.a, this.b, fcxyVar);
    }
}
