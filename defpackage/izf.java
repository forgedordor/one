package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izf extends fdbr implements fdat {
    final /* synthetic */ izl a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdat c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izf(izl izlVar, ics icsVar, fdat fdatVar, int i) {
        super(2);
        this.a = izlVar;
        this.b = icsVar;
        this.c = fdatVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.d | 1);
        izg.b(this.a, this.b, this.c, (hml) obj, iA);
        return fctx.a;
    }
}
