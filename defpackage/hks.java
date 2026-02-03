package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hks implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdat b;

    public hks(long j, fdat fdatVar) {
        this.a = j;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hlb.e(this.a, this.b, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
