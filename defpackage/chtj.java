package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chtj extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ chtk b;
    int c;
    aubq d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chtj(chtk chtkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = chtkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objN = this.b.n(null, 0, this);
        return objN == fcyl.a ? objN : new fctk(objN);
    }
}
