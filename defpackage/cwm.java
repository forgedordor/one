package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwm extends fdbr implements fdat {
    final /* synthetic */ Object a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdap c;
    final /* synthetic */ iby d;
    final /* synthetic */ String e;
    final /* synthetic */ fdap f;
    final /* synthetic */ fdav g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwm(Object obj, ics icsVar, fdap fdapVar, iby ibyVar, String str, fdap fdapVar2, fdav fdavVar, int i, int i2) {
        super(2);
        this.a = obj;
        this.b = icsVar;
        this.c = fdapVar;
        this.d = ibyVar;
        this.e = str;
        this.f = fdapVar2;
        this.g = fdavVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cwx.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hml) obj, hpy.a(this.h | 1), this.i);
        return fctx.a;
    }
}
