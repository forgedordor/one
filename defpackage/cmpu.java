package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpu extends fcyv {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ cmpv d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpu(cmpv cmpvVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = cmpvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, false, 0, this);
    }
}
