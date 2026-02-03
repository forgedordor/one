package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvcm extends fcyv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dvcp d;
    int e;
    aig f;
    aig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvcm(dvcp dvcpVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = dvcpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
