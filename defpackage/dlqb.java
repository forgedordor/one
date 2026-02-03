package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqb {
    public static final void a(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1861542867);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hnj.a(jmh.j.c(kji.a), hxe.d(88819859, new dlqa(fdatVar), hmlVarC), hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlpz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlqb.a(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
