package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlt extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlt(dlu dluVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long jF = ((jou) jbe.a(this.b, jmh.n)).f();
            this.a = 1;
            if (fdkj.c(jF, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdae fdaeVar = this.b.j;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlt(this.b, fcxyVar);
    }
}
