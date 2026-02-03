package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejdo extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ ejdp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejdo(ejdp ejdpVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = ejdpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0L, this);
    }
}
