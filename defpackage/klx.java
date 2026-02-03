package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klx extends fdbr implements fdat {
    final /* synthetic */ fdae a;
    final /* synthetic */ knl b;
    final /* synthetic */ fdat c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klx(fdae fdaeVar, knl knlVar, fdat fdatVar, int i, int i2) {
        super(2);
        this.a = fdaeVar;
        this.b = knlVar;
        this.c = fdatVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kme.a(this.a, this.b, this.c, (hml) obj, hpy.a(this.d | 1), this.e);
        return fctx.a;
    }
}
