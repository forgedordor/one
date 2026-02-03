package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dofb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fekc(fcxy fcxyVar, dofb dofbVar) {
        super(2, fcxyVar);
        this.b = dofbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fekc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dofb dofbVar = this.b;
        fekd fekdVar = new fekd(null);
        int i2 = fdsn.a;
        fdsi fdsiVar = new fdsi(dofbVar.a, fekdVar);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Expected positive concurrency level, but had " + i2);
        }
        fdpl fdsjVar = i2 == 1 ? new fdsj(fdsiVar) : new fdvy(fdsiVar, i2, fcyi.a, -2, 1);
        feke fekeVar = new feke(null);
        this.a = 1;
        Object objD = fdtc.d(fdsjVar, fekeVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fekc fekcVar = new fekc(fcxyVar, this.b);
        fekcVar.c = obj;
        return fekcVar;
    }
}
