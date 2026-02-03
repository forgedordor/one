package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eks implements fdat {
    final /* synthetic */ ekt a;
    final /* synthetic */ int b;

    public eks(ekt ektVar, int i) {
        this.a = ektVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ekt ektVar = this.a;
            int i2 = this.b;
            emx emxVarA = ektVar.a.c.a(i2);
            ((eko) emxVarA.c).b.a(ekx.a, Integer.valueOf(i2 - emxVarA.a), hmlVar, 6);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
