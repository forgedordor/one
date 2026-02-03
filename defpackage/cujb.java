package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cujb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cujc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujb(cujc cujcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cujcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            cujc cujcVar = this.b;
            cuja cujaVar = new cuja(cujcVar, fdjxVar);
            this.a = 1;
            if (fdum.g((fdum) cujcVar.d.a, cujaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cujb cujbVar = new cujb(this.b, fcxyVar);
        cujbVar.c = obj;
        return cujbVar;
    }
}
