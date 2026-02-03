package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czc extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ ics b;
    final /* synthetic */ dew c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdau e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czc(dhk dhkVar, ics icsVar, dew dewVar, fdap fdapVar, fdau fdauVar, int i) {
        super(2);
        this.a = dhkVar;
        this.b = icsVar;
        this.c = dewVar;
        this.d = fdapVar;
        this.e = fdauVar;
        this.f = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        czd.b(this.a, this.b, this.c, this.d, this.e, (hml) obj, hpy.a(this.f | 1));
        return fctx.a;
    }
}
