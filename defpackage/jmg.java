package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmg extends fdbr implements fdat {
    final /* synthetic */ jfh a;
    final /* synthetic */ fdat b;
    final /* synthetic */ int c;
    final /* synthetic */ jkp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmg(jfh jfhVar, jkp jkpVar, fdat fdatVar, int i) {
        super(2);
        this.a = jfhVar;
        this.d = jkpVar;
        this.b = fdatVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.c | 1);
        jmh.a(this.a, this.d, this.b, (hml) obj, iA);
        return fctx.a;
    }
}
