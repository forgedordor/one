package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuc {
    public static final void a(final djrr djrrVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        eve eveVar;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-202170910);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) {
                hmlVarC.v(-1329258797);
                eveVar = glz.c(hmlVarC).c;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1329208236);
                eveVar = glz.c(hmlVarC).b;
                ((hmw) hmlVarC).ab();
            }
            eve eveVar2 = eveVar;
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() || z) {
                hmlVarC.v(-1329068085);
                j = glz.a(hmlVarC).f;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1329009402);
                j = glz.a(hmlVarC).r;
                ((hmw) hmlVarC).ab();
            }
            gvk.c(null, eveVar2, j, 0L, 0.0f, 0.0f, null, hxe.d(1074390183, new djub(djrrVar, z), hmlVarC), hmlVarC, 121);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djty
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    djuc.a(djrrVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(24047939);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.j(ics.e, 0.0f, 2.0f, 0.0f, 0.0f, 13), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).l, hmlVar2, (i2 & 14) | 48, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djtx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djuc.b(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, hml hmlVar, final int i) {
        int i2;
        jyq jyqVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1249554483);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) {
                hmlVarC.v(996206010);
                jyqVar = glz.d(hmlVarC).m;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(996264662);
                jyqVar = dljt.e(hmlVarC).g;
                ((hmw) hmlVarC).ab();
            }
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar2, i2 & 14, 0, 65530);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djtv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djuc.c(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djue djueVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(332490897);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djueVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            e(icsVar, djueVar.e, hxe.d(-2137986250, new djua(djueVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 3072);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djtw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djue djueVar2 = djueVar;
                    int i4 = i;
                    djuc.d(djueVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ics icsVar, final boolean z, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2130389435);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1395147047);
            if (z) {
                j = ije.g;
            } else {
                hmlVarC.v(-1395144706);
                boolean zBooleanValue = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue();
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                if (zBooleanValue) {
                    hmlVarC.v(-1395142389);
                    j = glz.a(hmlVarC).F;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-1395140574);
                    j = glz.a(hmlVarC).p;
                    hmwVar.ab();
                }
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            hmlVarC.v(-299646113);
            gvk.c(icsVar, null, j, 0L, 0.0f, 0.0f, null, fdatVar, hmlVarC, 122);
            hmwVar2.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djtu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    boolean z2 = z;
                    int i4 = i;
                    djuc.e(icsVar2, z2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
