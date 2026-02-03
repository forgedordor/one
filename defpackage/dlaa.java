package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlaa {
    public static final void a(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-43139658);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, z ? egq.y(ics.e) : egq.d(ics.e, 1.0f), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 2, false, true != z ? 1 : 4, 0, null, glz.d(hmlVarC).k, hmlVar2, i2 & 14, 48, 55288);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkzx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dlaa.a(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        str2.getClass();
        hml hmlVarC = hmlVar.c(-2119024079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        int i4 = i2 & 4;
        boolean z2 = i4 == 0;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i5 = i3 >> 3;
            z &= z2;
            ics icsVarU = z ? egq.u(ics.e, 40.0f, 0.0f, 2) : egq.e(ics.e, 40.0f);
            ixm ixmVarA = edl.a(ecr.e, ibw.j, hmlVarC, 6);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarU);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i6 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i6))) {
                Integer numValueOf = Integer.valueOf(i6);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            int i7 = i5 & 112;
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-1970186943);
            if (str != null) {
                c(str, z, hmlVarC, (i3 & 14) | i7);
            }
            hmwVar.ab();
            a(str2, z, hmlVarC, i5 & 126);
            hmlVarC.n();
        }
        final boolean z3 = z;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkzz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    String str4 = str2;
                    dlaa.b(str3, str4, z3, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        jyq jyqVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-849233072);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarD = z ? ics.e : egq.d(ics.e, 1.0f);
            long j = glz.a(hmlVarC).q;
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) {
                hmlVarC.v(-2144727651);
                jyqVar = glz.d(hmlVarC).k;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-2144669092);
                jyqVar = glz.d(hmlVarC).n;
                ((hmw) hmlVarC).ab();
            }
            hmlVar2 = hmlVarC;
            dthx.b(str, icsVarD, j, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar, hmlVar2, i2 & 14, 3120, 55288);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkzy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dlaa.c(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
