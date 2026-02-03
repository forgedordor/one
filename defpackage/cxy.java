package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxy extends fdbr implements fdat {
    final /* synthetic */ dfw a;
    final /* synthetic */ ics b;
    final /* synthetic */ dap c;
    final /* synthetic */ dar d;
    final /* synthetic */ String e;
    final /* synthetic */ fdau f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxy(dfw dfwVar, ics icsVar, dap dapVar, dar darVar, String str, fdau fdauVar, int i, int i2) {
        super(2);
        this.a = dfwVar;
        this.b = icsVar;
        this.c = dapVar;
        this.d = darVar;
        this.e = str;
        this.f = fdauVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.a(this.a, this.b, this.c, this.d, this.e, this.f, (hml) obj, hpy.a(this.g | 1), this.h);
        return fctx.a;
    }
}
