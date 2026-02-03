package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbs extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ bzbx c;
    int d;
    bzbz e;
    bzbx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbs(bzbx bzbxVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = bzbxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objI = this.c.i(null, null, this);
        return objI == fcyl.a ? objI : new fctk(objI);
    }
}
