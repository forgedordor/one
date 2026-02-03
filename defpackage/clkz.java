package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clkz extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ clli b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkz(clli clliVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = clliVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objI = this.b.i(null, this);
        return objI == fcyl.a ? objI : new fctk(objI);
    }
}
