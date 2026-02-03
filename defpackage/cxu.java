package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxu extends fdbr implements fdat {
    final /* synthetic */ ego a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ics c;
    final /* synthetic */ dap d;
    final /* synthetic */ dar e;
    final /* synthetic */ String f;
    final /* synthetic */ fdau g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxu(ego egoVar, boolean z, ics icsVar, dap dapVar, dar darVar, String str, fdau fdauVar, int i, int i2) {
        super(2);
        this.a = egoVar;
        this.b = z;
        this.c = icsVar;
        this.d = dapVar;
        this.e = darVar;
        this.f = str;
        this.g = fdauVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hml) obj, hpy.a(this.h | 1), this.i);
        return fctx.a;
    }
}
