package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eiq implements fdat {
    final /* synthetic */ eir a;
    final /* synthetic */ int b;

    public eiq(eir eirVar, int i) {
        this.a = eirVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            eir eirVar = this.a;
            int i2 = this.b;
            emx emxVarA = eirVar.a.a.a(i2);
            ((eik) emxVarA.c).a.a(eirVar.b, Integer.valueOf(i2 - emxVarA.a), hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
