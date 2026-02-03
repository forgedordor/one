package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzq implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ float b;

    public fzq(fdau fdauVar, float f) {
        this.a = fdauVar;
        this.b = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.a(efy.h(0.0f, 0.0f, 0.0f, this.b, 7), hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
