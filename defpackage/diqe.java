package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqe {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hml r8, int r9) {
        /*
            r0 = 1391191287(0x52ebe4f7, float:5.06579354E11)
            hml r8 = r8.c(r0)
            r0 = 0
            if (r9 != 0) goto L17
            boolean r9 = r8.I()
            if (r9 != 0) goto L12
            r9 = r0
            goto L17
        L12:
            r8.s()
            goto L8b
        L17:
            hpt r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a
            java.lang.Object r1 = r8.e(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r1 = r1.orientation
            r2 = 2
            if (r1 != r2) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = r0
        L27:
            dlim r2 = defpackage.dljt.a(r8)
            ico r3 = defpackage.ics.e
            ics r3 = defpackage.egq.s(r3)
            dlim r4 = defpackage.dljt.a(r8)
            dlih r4 = r4.d
            long r4 = r4.a
            ics r3 = defpackage.dkl.c(r3, r4)
            r4 = 1849434622(0x6e3c21fe, float:1.4556069E28)
            r8.v(r4)
            r4 = r8
            hmw r4 = (defpackage.hmw) r4
            java.lang.Object r5 = r4.S()
            java.lang.Object r6 = defpackage.hmk.a
            if (r5 != r6) goto L56
            dipy r5 = new dipy
            r5.<init>()
            r4.af(r5)
        L56:
            fdap r5 = (defpackage.fdap) r5
            r4.ab()
            ics r3 = defpackage.ijn.a(r3, r5)
            r5 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r8.v(r5)
            boolean r5 = r8.E(r1)
            boolean r7 = r8.D(r2)
            r5 = r5 | r7
            java.lang.Object r7 = r4.S()
            if (r5 != 0) goto L76
            if (r7 != r6) goto L7e
        L76:
            dipz r7 = new dipz
            r7.<init>()
            r4.af(r7)
        L7e:
            fdap r7 = (defpackage.fdap) r7
            r4.ab()
            ics r1 = defpackage.ifb.b(r3, r7)
            defpackage.ecz.b(r1, r8, r0)
            r0 = r9
        L8b:
            hpx r8 = r8.L()
            if (r8 == 0) goto L98
            diqa r9 = new diqa
            r9.<init>()
            r8.d = r9
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diqe.a(hml, int):void");
    }

    public static final void b(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-874121470);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean zH = dljt.h(hmlVarC);
            cye.b(zH, null, dae.l(dljt.d(hmlVarC).k, 2), dae.m(dljt.d(hmlVarC).l, 2), null, hxe.d(-252810278, new diqd(zH, fdaeVar), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diqe.b(fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
