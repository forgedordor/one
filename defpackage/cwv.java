package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwv extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdap c;
    final /* synthetic */ iby d;
    final /* synthetic */ fdap e;
    final /* synthetic */ fdav f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwv(dhk dhkVar, ics icsVar, fdap fdapVar, iby ibyVar, fdap fdapVar2, fdav fdavVar, int i) {
        super(2);
        this.a = dhkVar;
        this.b = icsVar;
        this.c = fdapVar;
        this.d = ibyVar;
        this.e = fdapVar2;
        this.f = fdavVar;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cwx.b(this.a, this.b, this.c, this.d, this.e, this.f, (hml) obj, hpy.a(this.g | 1));
        return fctx.a;
    }
}
