package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xid extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xij c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xid(xij xijVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = xijVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
