package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgx extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ tgz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgx(tgz tgzVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = tgzVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == fcyl.a ? objA : new fctk(objA);
    }
}
