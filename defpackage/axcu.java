package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axcu extends fcyz implements fdat {
    int a;
    final /* synthetic */ axcv b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcu(axcv axcvVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axcvVar;
        this.c = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            axcv axcvVar = this.b;
            this.a = 1;
            Object objA = fdin.a(eicg.a(axcvVar.c), new axcq(null, axcvVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new axcu(this.b, this.c, fcxyVar);
    }
}
