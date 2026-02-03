package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dman extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ dmao b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dman(dmao dmaoVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dmaoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
