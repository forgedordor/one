package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzv {
    public static final void a(final djzw djzwVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-247114737);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djzwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            ics icsVar2 = icsVar;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = dli.c(icsVar2, (ebk) objS, grb.a(false, 0.0f, 0L, 7), false, null, null, djzwVar.e, 28);
            String str = djzwVar.b;
            hmlVarC.v(-1254041142);
            hwv hwvVarD = str == null ? null : hxe.d(815070216, new djzr(str), hmlVarC);
            hmwVar.ab();
            hmlVarC.v(-1254039209);
            hwv hwvVarD2 = djzwVar.c != null ? hxe.d(-1165940234, new djzs(djzwVar), hmlVarC) : null;
            hmwVar.ab();
            dtfr.a(hxe.d(1494157297, new djzt(djzwVar), hmlVarC), icsVarC, null, hwvVarD, hxe.d(547685997, new djzu(djzwVar), hmlVarC), hwvVarD2, dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 24582, 388);
            icsVar = icsVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djzw djzwVar2 = djzwVar;
                    int i6 = i;
                    djzv.a(djzwVar2, icsVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
