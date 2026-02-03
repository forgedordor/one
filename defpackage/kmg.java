package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmg extends fdbr implements fdat {
    final /* synthetic */ iby a;
    final /* synthetic */ long b;
    final /* synthetic */ fdae c;
    final /* synthetic */ koc d;
    final /* synthetic */ fdat e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg(iby ibyVar, long j, fdae fdaeVar, koc kocVar, fdat fdatVar, int i, int i2) {
        super(2);
        this.a = ibyVar;
        this.b = j;
        this.c = fdaeVar;
        this.d = kocVar;
        this.e = fdatVar;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kna.c(this.a, this.b, this.c, this.d, this.e, (hml) obj, hpy.a(this.f | 1), this.g);
        return fctx.a;
    }
}
