package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezh {
    public static final void a(final ics icsVar, final fmx fmxVar, final fdat fdatVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2036174316);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fmxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            ixm ixmVarA = ecz.a(ibw.a, true);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
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
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            exx.c(fmxVar, fdatVar, hmlVarC, (i2 >> 3) & 126);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eyf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fmx fmxVar2 = fmxVar;
                    int i5 = i;
                    ezh.a(icsVar2, fmxVar2, fdatVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fmx fmxVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        fda fdaVarD;
        jyi jyiVar;
        faj fajVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(626339208);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fmxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if (!hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            hmlVarC.s();
        } else if (z) {
            hmlVarC.v(1529773779);
            faj fajVar2 = fmxVar.d;
            jyi jyiVar2 = null;
            if (fajVar2 != null && (fdaVarD = fajVar2.d()) != null && (jyiVar = fdaVarD.a) != null && (fajVar = fmxVar.d) != null && !fajVar.l) {
                jyiVar2 = jyiVar;
            }
            if (jyiVar2 == null) {
                hmlVarC.v(1530097325);
            } else {
                hmlVarC.v(1530097326);
                if (jyo.i(fmxVar.f().c)) {
                    hmlVarC.v(2110858574);
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(2109807240);
                    int iA = fmxVar.b.a(jyo.e(fmxVar.f().c));
                    int iA2 = fmxVar.b.a(jyo.a(fmxVar.f().c));
                    int iT = jyiVar2.t(iA);
                    int iT2 = jyiVar2.t(Math.max(iA2 - 1, 0));
                    faj fajVar3 = fmxVar.d;
                    if (fajVar3 == null || !((Boolean) fajVar3.i.a()).booleanValue()) {
                        hmlVarC.v(2110489550);
                        ((hmw) hmlVarC).ab();
                    } else {
                        hmlVarC.v(2110225275);
                        fnb.b(true, iT, fmxVar, hmlVarC, ((i2 << 6) & 896) | 6);
                        ((hmw) hmlVarC).ab();
                    }
                    faj fajVar4 = fmxVar.d;
                    if (fajVar4 == null || !((Boolean) fajVar4.j.a()).booleanValue()) {
                        hmlVarC.v(2110836750);
                        ((hmw) hmlVarC).ab();
                    } else {
                        hmlVarC.v(2110573436);
                        fnb.b(false, iT2, fmxVar, hmlVarC, ((i2 << 6) & 896) | 6);
                        ((hmw) hmlVarC).ab();
                    }
                    ((hmw) hmlVarC).ab();
                }
                faj fajVar5 = fmxVar.d;
                if (fajVar5 != null) {
                    if (!fdbq.f(fmxVar.p.a(), fmxVar.f().a())) {
                        fajVar5.m(false);
                    }
                    if (fajVar5.p()) {
                        if (fajVar5.r()) {
                            fmxVar.s();
                        } else {
                            fmxVar.l();
                        }
                    }
                }
            }
            ((hmw) hmlVarC).ab();
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.v(1989076714);
            ((hmw) hmlVarC).ab();
            fmxVar.l();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eye
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fmx fmxVar2 = fmxVar;
                    int i4 = i;
                    ezh.b(fmxVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fmx fmxVar, hml hmlVar, final int i) {
        int i2;
        juo juoVarE;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1436003720);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fmxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            faj fajVar = fmxVar.d;
            if (fajVar == null || !((Boolean) fajVar.k.a()).booleanValue() || (juoVarE = fmxVar.e()) == null || juoVarE.a() <= 0) {
                hmlVarC.v(-2111022710);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-2112330631);
                boolean zD = hmlVarC.D(fmxVar);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zD || objS == hmk.a) {
                    objS = new fmh(fmxVar);
                    hmwVar.af(objS);
                }
                fbh fbhVar = (fbh) objS;
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                int iA = fmxVar.b.a(jyo.e(fmxVar.f().c));
                faj fajVar2 = fmxVar.d;
                fda fdaVarD = fajVar2 != null ? fajVar2.d() : null;
                fdaVarD.getClass();
                jyi jyiVar = fdaVarD.a;
                ihu ihuVarN = jyiVar.n(fddu.i(iA, 0, jyiVar.a.a.a()));
                final long jFloatToRawIntBits = (Float.floatToRawIntBits(ihuVarN.b + (kioVar.en(2.0f) / 2.0f)) << 32) | (4294967295L & Float.floatToRawIntBits(ihuVarN.e));
                boolean zC = hmlVarC.C(jFloatToRawIntBits);
                Object objS2 = hmwVar.S();
                if (zC || objS2 == hmk.a) {
                    objS2 = new eza(jFloatToRawIntBits);
                    hmwVar.af(objS2);
                }
                fih fihVar = (fih) objS2;
                ico icoVar = ics.e;
                boolean zF = hmlVarC.F(fbhVar) | hmlVarC.F(fmxVar);
                Object objS3 = hmwVar.S();
                if (zF || objS3 == hmk.a) {
                    objS3 = new ezf(fbhVar, fmxVar);
                    hmwVar.af(objS3);
                }
                ics icsVarA = itf.a(icoVar, fbhVar, (PointerInputEventHandler) objS3);
                boolean zC2 = hmlVarC.C(jFloatToRawIntBits);
                Object objS4 = hmwVar.S();
                if (zC2 || objS4 == hmk.a) {
                    objS4 = new fdap() { // from class: eyc
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ((jto) obj).e(fjy.a, new fjx(ezl.a, jFloatToRawIntBits, 2, true));
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS4);
                }
                evv.c(fihVar, jsh.c(icsVarA, false, (fdap) objS4), 0L, hmlVarC, 0);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eyd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ezh.c(fmxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(faj fajVar) {
        kfl kflVar = fajVar.c;
        if (kflVar != null) {
            fajVar.p.invoke(kew.b(fajVar.b.a, null, 0L, 3));
            while (true) {
                key keyVar = kflVar.a;
                AtomicReference atomicReference = keyVar.b;
                if (atomicReference.compareAndSet(kflVar, null)) {
                    keyVar.a.f();
                    break;
                } else if (atomicReference.get() != kflVar) {
                    break;
                }
            }
        }
        fajVar.c = null;
    }

    public static final void e(faj fajVar, kew kewVar, kel kelVar) {
        kfl kflVar;
        ivy ivyVarE;
        hzg hzgVarA = hzf.a();
        fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
        hzg hzgVarB = hzf.b(hzgVarA);
        try {
            fda fdaVarD = fajVar.d();
            if (fdaVarD != null && (kflVar = fajVar.c) != null && (ivyVarE = fajVar.e()) != null) {
                final fbf fbfVar = fajVar.a;
                jyi jyiVar = fdaVarD.a;
                if (fajVar.p()) {
                    int iA = kelVar.a(jyo.c(kewVar.c));
                    fdae fdaeVar = new fdae() { // from class: fbm
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fbf fbfVar2 = fbfVar;
                            return new kjg(fbp.a(fbfVar2.b, fbfVar2.e, fbfVar2.f, fbp.a, 1));
                        }
                    };
                    String str = fbp.a;
                    ihu ihuVarM = iA < jyiVar.a.a.a() ? jyiVar.m(iA) : iA != 0 ? jyiVar.m(iA - 1) : new ihu(0.0f, 0.0f, 1.0f, (int) (((kjg) fdaeVar.invoke()).a & 4294967295L));
                    float f = ihuVarM.b;
                    float f2 = ihuVarM.c;
                    long j = ivyVarE.j((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                    ihu ihuVarA = ihv.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(ihuVarM.d - f) << 32) | (4294967295L & Float.floatToRawIntBits(ihuVarM.e - f2)));
                    if (kflVar.a()) {
                        kflVar.b.b(ihuVarA);
                    }
                }
            }
        } finally {
            hzf.e(hzgVarA, hzgVarB, fdapVarK);
        }
    }

    public static final void f(key keyVar, faj fajVar, kew kewVar, kdy kdyVar, kel kelVar) {
        fajVar.c = fbo.c(keyVar, kewVar, fajVar.b, kdyVar, fajVar.p, fajVar.q);
        e(fajVar, kewVar, kelVar);
    }

    public static final boolean g(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0581 A[PHI: r10 r20 r27
      0x0581: PHI (r10v13 kdy) = (r10v6 kdy), (r10v14 kdy) binds: [B:268:0x057f, B:265:0x0570] A[DONT_GENERATE, DONT_INLINE]
      0x0581: PHI (r20v9 boolean) = (r20v3 boolean), (r20v11 boolean) binds: [B:268:0x057f, B:265:0x0570] A[DONT_GENERATE, DONT_INLINE]
      0x0581: PHI (r27v8 key) = (r27v3 key), (r27v9 key) binds: [B:268:0x057f, B:265:0x0570] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0637 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08e0  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.kew r64, final defpackage.fdap r65, final defpackage.ics r66, final defpackage.jyq r67, final defpackage.kfp r68, final defpackage.fdap r69, final defpackage.ebk r70, final defpackage.iiy r71, final boolean r72, int r73, final int r74, final defpackage.kdy r75, final defpackage.fad r76, final boolean r77, final defpackage.fdau r78, defpackage.hml r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezh.h(kew, fdap, ics, jyq, kfp, fdap, ebk, iiy, boolean, int, int, kdy, fad, boolean, fdau, hml, int, int):void");
    }

    public static final void i(faj fajVar, igr igrVar) {
        if (!fajVar.p()) {
            igrVar.a(new igq());
            return;
        }
        jmj jmjVar = fajVar.u;
        if (jmjVar != null) {
            jmjVar.b();
        }
    }
}
