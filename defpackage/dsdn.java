package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsdp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdn(dsdp dsdpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsdpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsdp dsdpVar = this.b;
            this.a = 1;
            if (dsdpVar.a.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsdn(this.b, fcxyVar);
    }
}
