package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqi implements fdau {
    final /* synthetic */ fdat a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdae c;

    public dqi(fdat fdatVar, ics icsVar, fdae fdaeVar) {
        this.a = fdatVar;
        this.b = icsVar;
        this.c = fdaeVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqb dqbVar = (dqb) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(dqbVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            ?? A = this.a.a(hmlVar, 0);
            if (fdgn.H(A)) {
                ebs.d("Label must not be blank");
            }
            dqz.e((String) A, dqbVar, this.b, this.c, hmlVar, (iIntValue << 6) & 896);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
