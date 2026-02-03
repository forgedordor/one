package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eog implements fdat {
    final /* synthetic */ eoi a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;

    public eog(eoi eoiVar, int i, Object obj) {
        this.a = eoiVar;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.e(this.b, this.c, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
