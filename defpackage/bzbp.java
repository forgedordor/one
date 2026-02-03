package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbp extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ bzbx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbp(bzbx bzbxVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = bzbxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objG = this.b.g(false, null, null, 0, this);
        return objG == fcyl.a ? objG : new fctk(objG);
    }
}
