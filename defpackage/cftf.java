package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cftf extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cftg b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cftf(cftg cftgVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cftgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(this);
        return objB == fcyl.a ? objB : new fctk(objB);
    }
}
