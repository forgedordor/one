package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzct extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ bzda b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzct(bzda bzdaVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = bzdaVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == fcyl.a ? objB : new fctk(objB);
    }
}
