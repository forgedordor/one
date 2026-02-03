package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyu extends fdbr implements fdat {
    final /* synthetic */ Object a;
    final /* synthetic */ ics b;
    final /* synthetic */ dew c;
    final /* synthetic */ String d;
    final /* synthetic */ fdau e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyu(Object obj, ics icsVar, dew dewVar, String str, fdau fdauVar, int i, int i2) {
        super(2);
        this.a = obj;
        this.b = icsVar;
        this.c = dewVar;
        this.d = str;
        this.e = fdauVar;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        czd.a(this.a, this.b, this.c, this.d, this.e, (hml) obj, hpy.a(this.f | 1), this.g);
        return fctx.a;
    }
}
