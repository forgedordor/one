package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chtb extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ chtk b;
    int c;
    aubq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chtb(chtk chtkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = chtkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objL = this.b.l(null, 0, this);
        return objL == fcyl.a ? objL : new fctk(objL);
    }
}
