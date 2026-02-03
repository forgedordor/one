package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izd extends fdbr implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ fdat b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(ics icsVar, fdat fdatVar, int i, int i2) {
        super(2);
        this.a = icsVar;
        this.b = fdatVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.c | 1);
        int i = this.d;
        izg.a(this.a, this.b, (hml) obj, iA, i);
        return fctx.a;
    }
}
