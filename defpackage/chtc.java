package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chtc extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ chtk c;
    int d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chtc(chtk chtkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = chtkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objM = this.c.m(null, 0, this);
        return objM == fcyl.a ? objM : new fctk(objM);
    }
}
