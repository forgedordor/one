package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsm {
    public static final void a(final float f, final ics icsVar, final gke gkeVar, final boolean z, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        fdapVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1419647807);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gkeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 >> 9;
            gjz.g(z, fdapVar, icsVar, false, evn.a, gkeVar, z ? null : dkz.a(2.0f, ije.d), hxe.d(352351253, new dmsl(f), hmlVarC), hmlVarC, (i4 & 112) | (i4 & 14) | 100663296 | ((i2 << 3) & 896) | ((i2 << 9) & 458752));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmsc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    ics icsVar2 = icsVar;
                    gke gkeVar2 = gkeVar;
                    boolean z2 = z;
                    dmsm.a(f2, icsVar2, gkeVar2, z2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dmsb dmsbVar, final boolean z, final boolean z2, final boolean z3, final float f, final ics icsVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        float f2;
        dmrz dmrzVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-892100127);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dmsbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= true != hmlVarC.E(z4) ? 128 : 256;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= true != hmlVarC.E(z5) ? 1024 : 2048;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i2 |= true != hmlVarC.A(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            dmrz dmrzVar2 = dmsbVar.b;
            gjk gjkVarD = null;
            dpxd dpxdVarA = dmrzVar2 != null ? dmrzVar2.a() : null;
            hmlVarC.v(1685247766);
            if (dpxdVarA != null) {
                long jC = ijg.c(dpxdVarA.a((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)));
                gjkVarD = new gjk(jC, jC, jC, jC);
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(1685246916);
            if (gjkVarD == null) {
                hmlVarC.v(1591384183);
                long j = ((ije) hmlVarC.e(gea.a)).i;
                gda gdaVarA = glz.a(hmlVarC);
                gjk gjkVar = gdaVarA.X;
                dmrzVar = dmrzVar2;
                if (gjkVar == null) {
                    long j2 = ije.g;
                    gjkVar = new gjk(j2, j, j2, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j)));
                    j = j;
                    gdaVarA.X = gjkVar;
                }
                gjkVarD = gjkVar;
                if (fcts.a(gjkVarD.b, j)) {
                    hmwVar.ab();
                } else {
                    gjkVarD = gjk.d(gjkVarD, 0L, j, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j)), 5);
                    hmwVar.ab();
                }
            } else {
                dmrzVar = dmrzVar2;
            }
            gjk gjkVar2 = gjkVarD;
            hmwVar.ab();
            hmlVarC.v(5004770);
            int i5 = i4 & 112;
            Object objS = hmwVar.S();
            if (i5 == 32 || objS == hmk.a) {
                objS = new fdap() { // from class: dmsf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.r(jtoVar, z);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            gjz.f(fdaeVar, jsh.c(icsVar, false, (fdap) objS), false, z ? evn.a : evn.b(16.0f), gjkVar2, dkz.a(z ? 4.0f : 2.0f, ije.d), hxe.d(-1214538558, new dmsh(z4, z, z5, f2, dmrzVar, dmsbVar), hmlVarC), hmlVar2, ((i4 >> 18) & 14) | 12582912);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmsg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmsb dmsbVar2 = dmsbVar;
                    boolean z6 = z;
                    boolean z7 = z2;
                    boolean z8 = z3;
                    float f3 = f;
                    ics icsVar2 = icsVar;
                    dmsm.b(dmsbVar2, z6, z7, z8, f3, icsVar2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final List list, final boolean z, final ics icsVar, final float f, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1126318634);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(list) | ((i2 & 112) == 32);
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & 57344) == 16384;
            Object objS = hmwVar.S();
            if ((zF | z2 | z3) || objS == hmk.a) {
                objS = new fdap() { // from class: dmsd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        List list2 = list;
                        eioVar.a(list2.size(), null, new dmsj(list2), new hxd(802480018, true, new dmsk(list2, z, f, fdapVar)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            eig.b(null, null, null, null, null, null, false, null, (fdap) objS, hmlVar2, 0, 511);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmse
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z4 = z;
                    ics icsVar2 = icsVar;
                    float f2 = f;
                    dmsm.c(list2, z4, icsVar2, f2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
