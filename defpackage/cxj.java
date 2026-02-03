package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxj extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ fdap b;
    final /* synthetic */ ics c;
    final /* synthetic */ dap d;
    final /* synthetic */ dar e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdau g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxj(dhk dhkVar, fdap fdapVar, ics icsVar, dap dapVar, dar darVar, fdat fdatVar, fdau fdauVar, int i) {
        super(2);
        this.a = dhkVar;
        this.b = fdapVar;
        this.c = icsVar;
        this.d = dapVar;
        this.e = darVar;
        this.f = fdatVar;
        this.g = fdauVar;
        this.h = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cye.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hml) obj, hpy.a(this.h | 1));
        return fctx.a;
    }
}
