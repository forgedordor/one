package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ alff c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztj(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = alffVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ztj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarA = ((ajmh) this.b.l.b()).A(((alfb) this.c).c());
            eijuVarA.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ztj(this.b, this.c, fcxyVar);
    }
}
