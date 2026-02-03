package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxq extends fdbr implements fdat {
    final /* synthetic */ dfw a;
    final /* synthetic */ ics b;
    final /* synthetic */ dap c;
    final /* synthetic */ dar d;
    final /* synthetic */ String e;
    final /* synthetic */ fdau f;
    final /* synthetic */ int g;
    final /* synthetic */ edp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxq(edp edpVar, dfw dfwVar, ics icsVar, dap dapVar, dar darVar, String str, fdau fdauVar, int i) {
        super(2);
        this.h = edpVar;
        this.a = dfwVar;
        this.b = icsVar;
        this.c = dapVar;
        this.d = darVar;
        this.e = str;
        this.f = fdauVar;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.j(this.h, this.a, this.b, this.c, this.d, this.e, this.f, (hml) obj, hpy.a(this.g | 1));
        return fctx.a;
    }
}
