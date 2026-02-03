package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clke extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ clkk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clke(clkk clkkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = clkkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == fcyl.a ? objB : new fctk(objB);
    }
}
