package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmue {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r14
      0x0015: PHI (r14v1 int) = (r14v0 int), (r14v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hml r13, final int r14) {
        /*
            r0 = 2096887977(0x7cfbf8a9, float:1.04664795E37)
            hml r10 = r13.c(r0)
            if (r14 != 0) goto L15
            boolean r13 = r10.I()
            r14 = 0
            if (r13 != 0) goto L11
            goto L15
        L11:
            r10.s()
            goto L89
        L15:
            hpt r13 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b
            java.lang.Object r13 = r10.e(r13)
            android.content.Context r13 = (android.content.Context) r13
            r0 = 2132087473(0x7f1512b1, float:1.9815202E38)
            java.lang.String r0 = defpackage.jqu.b(r0, r10)
            ico r1 = defpackage.ics.e
            gda r2 = defpackage.glz.a(r10)
            long r2 = r2.a
            evm r4 = defpackage.evn.a
            ics r1 = defpackage.dkl.a(r1, r2, r4)
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            r10.v(r2)
            boolean r3 = r10.D(r0)
            r4 = r10
            hmw r4 = (defpackage.hmw) r4
            java.lang.Object r5 = r4.S()
            if (r3 != 0) goto L49
            java.lang.Object r3 = defpackage.hmk.a
            if (r5 != r3) goto L51
        L49:
            dmub r5 = new dmub
            r5.<init>()
            r4.af(r5)
        L51:
            fdap r5 = (defpackage.fdap) r5
            r4.ab()
            ics r0 = defpackage.jsh.b(r1, r5)
            r10.v(r2)
            boolean r1 = r10.F(r13)
            java.lang.Object r2 = r4.S()
            if (r1 != 0) goto L6b
            java.lang.Object r1 = defpackage.hmk.a
            if (r2 != r1) goto L73
        L6b:
            dmuc r2 = new dmuc
            r2.<init>()
            r4.af(r2)
        L73:
            r1 = r2
            fdae r1 = (defpackage.fdae) r1
            r4.ab()
            fdau r9 = defpackage.dmtz.a
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r12 = 508(0x1fc, float:7.12E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r0
            defpackage.dtdi.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L89:
            hpx r13 = r10.L()
            if (r13 == 0) goto L96
            dmud r0 = new dmud
            r0.<init>()
            r13.d = r0
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmue.a(hml, int):void");
    }

    public static final boolean b(Context context, String str) {
        context.getClass();
        return kxj.c(context, str) == 0;
    }

    public static final void c(final ics icsVar, final int i, hml hmlVar, final int i2) {
        int i3;
        String strB;
        hml hmlVarC = hmlVar.c(-1758067918);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i - 1;
            ics icsVarD = egq.d(efy.i(icsVar, 50.0f, 0.0f, 2), 1.0f);
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
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
            if (i4 != 0) {
                hmlVarC.v(-1959000456);
                strB = jqu.b(R.string.enable_gallery_permission_rationale, hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(-1959003049);
                strB = jqu.b(R.string.enable_camera_permission_rationale, hmlVarC);
                hmwVar.ab();
            }
            gyj.c(strB, null, glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVarC, 0, 0, 130042);
            egt.a(egq.e(ics.e, 24.0f), hmlVarC);
            a(hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmua
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i6 = i2;
                    dmue.c(icsVar2, i, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
