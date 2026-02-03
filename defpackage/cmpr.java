package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpr extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cmpv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpr(cmpv cmpvVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cmpvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
