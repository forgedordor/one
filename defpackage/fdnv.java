package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdnv extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ fdnw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdnv(fdnw fdnwVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdnwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objL = this.b.l(null, 0, 0L, this);
        return objL == fcyl.a ? objL : new fdog(objL);
    }
}
