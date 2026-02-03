package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlod {
    public static final void a(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1779493464);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            jyq jyqVar = dljt.e(hmlVarC).f;
            hmlVarC.v(108707403);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar, hmlVar2, i2 & 14, 3120, 55294);
            ((hmw) hmlVar2).ab();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dloc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlod.a(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
