package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsa extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdau c;
    final /* synthetic */ dsd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsa(fdau fdauVar, dsd dsdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdauVar;
        this.d = dsdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsa) c((dst) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dst dstVar = (dst) this.b;
            fdau fdauVar = this.c;
            dsd dsdVar = this.d;
            this.a = 1;
            if (fdauVar.a(dsdVar.d, dstVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dsa dsaVar = new dsa(this.c, this.d, fcxyVar);
        dsaVar.b = obj;
        return dsaVar;
    }
}
