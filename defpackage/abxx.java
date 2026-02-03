package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abxx extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ abxy c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abxx(abxy abxyVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = abxyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
