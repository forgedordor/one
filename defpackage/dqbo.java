package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbo extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqbt c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbo(dqbt dqbtVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = dqbtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
