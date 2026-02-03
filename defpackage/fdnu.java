package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdnu extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ fdnw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdnu(fdnw fdnwVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdnwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = fdnw.k(this.b, this);
        return objK == fcyl.a ? objK : new fdog(objK);
    }
}
