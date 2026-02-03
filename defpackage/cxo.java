package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxo extends fdbr implements fdat {
    final /* synthetic */ ego a;
    final /* synthetic */ dfw b;
    final /* synthetic */ ics c;
    final /* synthetic */ dap d;
    final /* synthetic */ dar e;
    final /* synthetic */ String f;
    final /* synthetic */ fdau g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxo(ego egoVar, dfw dfwVar, ics icsVar, dap dapVar, dar darVar, String str, fdau fdauVar, int i) {
        super(2);
        this.a = egoVar;
        this.b = dfwVar;
        this.c = icsVar;
        this.d = dapVar;
        this.e = darVar;
        this.f = str;
        this.g = fdauVar;
        this.h = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hml) obj, hpy.a(this.h | 1));
        return fctx.a;
    }
}
