package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class est implements fdat {
    final /* synthetic */ esu a;
    final /* synthetic */ int b;

    public est(esu esuVar, int i) {
        this.a = esuVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            esu esuVar = this.a;
            int i2 = this.b;
            emx emxVarA = ((esr) esuVar.a).a.a(i2);
            ((esf) emxVarA.c).a.a(esuVar.b, Integer.valueOf(i2 - emxVarA.a), hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
