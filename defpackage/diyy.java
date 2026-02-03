package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyy {
    public static final void a(final diys diysVar, final long j, final long j2, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2128209296);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            gvk.e(diysVar.b, null, false, glz.c(hmlVarC).f, j, 0L, 0.0f, null, null, hxe.d(-1923936059, new diyx(diysVar, j2), hmlVarC), hmlVar2, 998);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diyu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diys diysVar2 = diysVar;
                    long j3 = j;
                    diyy.a(diysVar2, j3, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final long b(hml hmlVar) {
        hmlVar.v(812498753);
        hmlVar.v(-1285247946);
        long j = glz.a(hmlVar).p;
        hmlVar.o();
        hmlVar.o();
        return j;
    }

    public static final void c(final dizb dizbVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1026500061);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dizbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            ics icsVarD = efy.d(icsVar, 8.0f);
            eve eveVar = glz.c(hmlVarC).f;
            long jB = b(hmlVarC);
            hmlVarC.v(1375929042);
            dky dkyVarA = dkz.a(1.0f, glz.a(hmlVarC).B);
            ((hmw) hmlVarC).ab();
            gvk.c(icsVarD, eveVar, jB, 0L, 0.0f, 0.0f, dkyVarA, hxe.d(-15489346, new diyw(dizbVar), hmlVarC), hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diyt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dizb dizbVar2 = dizbVar;
                    int i3 = i;
                    diyy.c(dizbVar2, icsVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
