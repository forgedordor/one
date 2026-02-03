package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbeq extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ dber b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbeq(dber dberVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dberVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
