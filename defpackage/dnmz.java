package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnmz extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dnna c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnmz(dnna dnnaVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = dnnaVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0, this);
    }
}
