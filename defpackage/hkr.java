package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkr implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ jyq b;
    final /* synthetic */ fdat c;

    public hkr(long j, jyq jyqVar, fdat fdatVar) {
        this.a = j;
        this.b = jyqVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hlb.d(this.a, this.b, this.c, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
