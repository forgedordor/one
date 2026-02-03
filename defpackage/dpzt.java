package defpackage;

import android.text.format.DateUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dpzo r19, defpackage.ics r20, defpackage.hml r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpzt.a(dpzo, ics, hml, int, int):void");
    }

    public static final void b(final float f, final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-874970497);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecz.b(joj.a(dkl.a(iex.a(egq.k(ics.e, f), evn.a), j, ikj.a), "timer_dot"), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpzr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i4 = i;
                    dpzt.b(f2, j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final float c(hml hmlVar) {
        hmlVar.v(893917588);
        float f = ((kir) dfq.c(dfq.b(hmlVar), new kir(6.0f), new kir(12.0f), diu.c, dea.d(dea.c(1000, 0, dev.c, 2), 0, 0L, 6), hmlVar, 33160).a()).a;
        hmlVar.o();
        return f;
    }

    public static final void d(Duration duration, final jyq jyqVar, ics icsVar, final long j, hml hmlVar, final int i) {
        final Duration duration2;
        int i2;
        long j2;
        ics icsVar2;
        hml hmlVar2;
        final ics icsVar3;
        hml hmlVarC = hmlVar.c(1483279988);
        if ((i & 6) == 0) {
            duration2 = duration;
            i2 = (true != hmlVarC.F(duration2) ? 2 : 4) | i;
        } else {
            duration2 = duration;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
            }
            hmlVarC.l();
            String elapsedTime = DateUtils.formatElapsedTime(duration2.getSeconds());
            elapsedTime.getClass();
            hmlVar2 = hmlVarC;
            ics icsVar4 = icsVar2;
            gyj.c(elapsedTime, icsVar4, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(jyqVar, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hmlVar2, (i3 >> 3) & 1008, 0, 131064);
            icsVar3 = icsVar4;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpzq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Duration duration3 = duration2;
                    jyq jyqVar2 = jyqVar;
                    ics icsVar5 = icsVar3;
                    dpzt.d(duration3, jyqVar2, icsVar5, j, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
