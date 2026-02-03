package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwk implements fdat {
    final /* synthetic */ fdat a;

    public gwk(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            float f = hlo.a;
            gyj.a(jyq.y(hct.a(hlo.b, hmlVar), 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744447), this.a, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
