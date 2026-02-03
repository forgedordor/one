package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbe {
    public static final void a(final cwba cwbaVar, final float f, final float f2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1631194912);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cwbaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            dkpf dkpfVar = cwbaVar.a;
            if (dkpfVar != null) {
                iby ibyVar = ibw.e;
                ico icoVar = ics.e;
                ixm ixmVarA = ecz.a(ibyVar, false);
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
                String strB = jqu.b(R.string.conversation_icon, hmlVarC);
                hmlVarC.v(5004770);
                int i5 = i2 & 14;
                Object objS = hmwVar.S();
                if (i5 == 4 || objS == hmk.a) {
                    objS = new fdae() { // from class: cwbb
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            cwbaVar.b.invoke();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                dkrk dkrkVar = new dkrk(dkpfVar, strB, 0, 0, 0.0f, (fdae) objS, 28);
                ics icsVarH = egq.h(icoVar, f2);
                hmlVarC.v(5004770);
                int i6 = i2 & 112;
                Object objS2 = hmwVar.S();
                if (i6 == 32 || objS2 == hmk.a) {
                    objS2 = new fdap() { // from class: cwbc
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ikl iklVar = (ikl) obj;
                            iklVar.getClass();
                            float f3 = f;
                            iklVar.x(f3);
                            iklVar.y(f3);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                dkqr.h(dkrkVar, efs.c(ijn.a(icsVarH, (fdap) objS2), 0.0f, (1.0f - f) * f2, 1), hmlVarC, 0);
                hmlVarC.n();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwbd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwba cwbaVar2 = cwbaVar;
                    float f3 = f;
                    int i7 = i;
                    cwbe.a(cwbaVar2, f3, f2, (hml) obj, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
