package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctvi extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ ctvo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctvi(ctvo ctvoVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = ctvoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
