package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxr extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ fdap b;
    final /* synthetic */ ics c;
    final /* synthetic */ dap d;
    final /* synthetic */ dar e;
    final /* synthetic */ fdau f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxr(dhk dhkVar, fdap fdapVar, ics icsVar, dap dapVar, dar darVar, fdau fdauVar, int i) {
        super(2);
        this.a = dhkVar;
        this.b = fdapVar;
        this.c = icsVar;
        this.d = dapVar;
        this.e = darVar;
        this.f = fdauVar;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.h(this.a, this.b, this.c, this.d, this.e, this.f, (hml) obj, hpy.a(this.g | 1));
        return fctx.a;
    }
}
