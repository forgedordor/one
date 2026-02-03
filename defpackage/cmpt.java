package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpt extends fcyv {
    Object a;
    int b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ cmpv e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpt(cmpv cmpvVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = cmpvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, 0, 0, this);
    }
}
