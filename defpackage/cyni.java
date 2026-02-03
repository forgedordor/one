package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyni {
    public static final String a(Duration duration) {
        if (duration.toHours() > 0) {
            String str = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(duration.toHours()), Integer.valueOf(duration.toMinutesPart()), Integer.valueOf(duration.toSecondsPart())}, 3));
            str.getClass();
            return str;
        }
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(duration.toMinutesPart()), Integer.valueOf(duration.toSecondsPart())}, 2));
        str2.getClass();
        return str2;
    }

    public static final void b(final String str, final int i, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(750770564);
        if (i4 == 0) {
            i3 = i2 | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dthx.b(String.valueOf(i), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVarC, 0, 0, 65534);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).n, hmlVar2, i3 & 14, 0, 65534);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cync
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i2;
                    cyni.b(str2, i, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hml r24, int r25) {
        /*
            r0 = -609718747(0xffffffffdba86e25, float:-9.4817803E16)
            r1 = r24
            hml r20 = r1.c(r0)
            if (r25 != 0) goto L18
            boolean r0 = r20.I()
            r1 = 0
            if (r0 != 0) goto L14
            r0 = r1
            goto L1a
        L14:
            r20.s()
            goto L4b
        L18:
            r0 = r25
        L1a:
            hcr r1 = defpackage.glz.d(r20)
            jyq r1 = r1.i
            ico r2 = defpackage.ics.e
            r3 = 1094713344(0x41400000, float:12.0)
            r4 = 0
            ics r2 = defpackage.efy.e(r2, r3, r4)
            r22 = 0
            r23 = 65532(0xfffc, float:9.183E-41)
            r19 = r1
            java.lang.String r1 = "➔"
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 54
            defpackage.dthx.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r0
        L4b:
            hpx r0 = r20.L()
            if (r0 == 0) goto L58
            cymz r2 = new cymz
            r2.<init>()
            r0.d = r2
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyni.c(hml, int):void");
    }

    public static final void d(final String str, final Object obj, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1517136412);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(obj) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            jul julVar = new jul((byte[]) null);
            julVar.f(String.valueOf(str).concat(": "));
            int iA = julVar.a(new jxx(0L, 0L, kcc.h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                julVar.f(obj.toString());
                julVar.h(iA);
                hmlVar2 = hmlVarC;
                dthx.a(julVar.b(), joj.a(ics.e, a.a(str, "Value for '", "'")), glz.a(hmlVarC).s, 0L, 0L, null, 0L, 2, false, 1, null, null, glz.d(hmlVarC).j, hmlVar2, 0, 3120, 55288);
            } catch (Throwable th) {
                julVar.h(iA);
                throw th;
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cynd
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    int i4 = i;
                    cyni.d(str2, obj, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final Instant instant, final cynm cynmVar, hml hmlVar, final int i) {
        int i2;
        long j;
        instant.getClass();
        cynmVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1524900924);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(instant) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(cynmVar) : hmlVarC.F(cynmVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (cynmVar instanceof cynl) {
            hmlVarC.v(-454125670);
            cynl cynlVar = (cynl) cynmVar;
            Duration durationBetween = Duration.between(cynlVar.b, instant);
            Instant instant2 = cynlVar.c;
            Duration durationBetween2 = instant2 != null ? Duration.between(instant, instant2) : null;
            ArrayList arrayList = new ArrayList();
            if (durationBetween2 != null && !durationBetween2.isNegative()) {
                arrayList.add(new fcti("Min Start Time", a(durationBetween2)));
            }
            String str = cynlVar.a;
            long j2 = dtey.a;
            long j3 = dtey.g;
            durationBetween.getClass();
            f(str, arrayList, j3, durationBetween, hxe.d(44915627, new cyne(cynmVar), hmlVarC), hmlVarC, 24576, 0);
            ((hmw) hmlVarC).ab();
        } else if (cynmVar instanceof cynk) {
            hmlVarC.v(-452547925);
            cynk cynkVar = (cynk) cynmVar;
            Duration durationBetween3 = Duration.between(cynkVar.b, instant);
            String str2 = cynkVar.a;
            fcvo fcvoVar = fcvo.a;
            long j4 = dtey.a;
            long j5 = dtey.a;
            durationBetween3.getClass();
            f(str2, fcvoVar, j5, durationBetween3, hxe.d(-1020083244, new cynf(cynmVar), hmlVarC), hmlVarC, 24624, 0);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(cynmVar instanceof cynj)) {
                hmlVarC.v(-845934447);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(-452036549);
            cynj cynjVar = (cynj) cynmVar;
            Instant instant3 = cynjVar.b;
            Instant instant4 = cynjVar.c;
            String str3 = cynjVar.a;
            Duration durationBetween4 = Duration.between(instant3, instant4);
            fcti[] fctiVarArr = new fcti[2];
            fctiVarArr[0] = new fcti("Completed Work Items", Integer.valueOf(cynjVar.d));
            int i4 = cynjVar.e - 1;
            fctiVarArr[1] = new fcti("Outcome", i4 != 0 ? i4 != 1 ? i4 != 2 ? "Abandoned" : "Interrupted" : "Scheduled Future Work" : "All Work Complete");
            List listG = fcva.g(fctiVarArr);
            if (i4 == 0) {
                long j6 = dtey.a;
                j = dtey.d;
            } else if (i4 == 1) {
                long j7 = dtey.a;
                j = dtey.e;
            } else if (i4 != 2) {
                long j8 = dtey.a;
                j = dtey.c;
            } else {
                long j9 = dtey.a;
                j = dtey.f;
            }
            durationBetween4.getClass();
            f(str3, listG, j, durationBetween4, null, hmlVarC, 0, 16);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyna
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Instant instant5 = instant;
                    int i5 = i;
                    cyni.e(instant5, cynmVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r22, final java.util.List r23, final long r24, final j$.time.Duration r26, defpackage.fdat r27, defpackage.hml r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyni.f(java.lang.String, java.util.List, long, j$.time.Duration, fdat, hml, int, int):void");
    }
}
