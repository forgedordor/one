package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzfd extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ bzfe b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfd(bzfe bzfeVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = bzfeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, null, this);
        return objE == fcyl.a ? objE : new fctk(objE);
    }
}
