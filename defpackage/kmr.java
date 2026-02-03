package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmr extends fdbr implements fdat {
    final /* synthetic */ koa a;
    final /* synthetic */ fdae b;
    final /* synthetic */ koc c;
    final /* synthetic */ fdat d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmr(koa koaVar, fdae fdaeVar, koc kocVar, fdat fdatVar, int i, int i2) {
        super(2);
        this.a = koaVar;
        this.b = fdaeVar;
        this.c = kocVar;
        this.d = fdatVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kna.b(this.a, this.b, this.c, this.d, (hml) obj, hpy.a(this.e | 1), this.f);
        return fctx.a;
    }
}
