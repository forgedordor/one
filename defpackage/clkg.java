package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clkg extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ clkk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkg(clkk clkkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = clkkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, this);
        return objC == fcyl.a ? objC : new fctk(objC);
    }
}
