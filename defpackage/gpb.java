package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpb {
    public static final void a(final fdae fdaeVar, final long j, final got gotVar, final ddp ddpVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        hmw hmwVar;
        hmw hmwVar2;
        boolean z;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(766784632);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gotVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            final kji kjiVar = (kji) hmlVarC.e(jmh.j);
            hnb hnbVarC = hmg.c(hmlVarC);
            hsf hsfVarA = hsc.a(fdatVar, hmlVarC);
            Object[] objArr = new Object[0];
            hmw hmwVar3 = (hmw) hmlVarC;
            Object objS = hmwVar3.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdae() { // from class: gou
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return UUID.randomUUID();
                    }
                };
                hmwVar3.af(objS);
            }
            int i4 = i2;
            UUID uuid = (UUID) hxy.e(objArr, null, (fdae) objS, hmlVarC, 3072, 6);
            Object objS2 = hmwVar3.S();
            if (objS2 == obj) {
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar = hmwVar3;
                hmwVar.af(objS2);
            } else {
                hmwVar = hmwVar3;
            }
            fdjx fdjxVar = (fdjx) objS2;
            boolean zD = hmlVarC.D(view) | hmlVarC.D(kioVar);
            Object objS3 = hmwVar.S();
            if (zD || objS3 == obj) {
                hmwVar2 = hmwVar;
                hmlVar2 = hmlVarC;
                gnd gndVar = new gnd(fdaeVar, gotVar, j, view, kjiVar, kioVar, uuid, ddpVar, fdjxVar);
                z = true;
                gndVar.c.c(hnbVarC, new hxd(-1051373467, true, new goz(hsfVarA)));
                hmwVar2.af(gndVar);
                objS3 = gndVar;
            } else {
                hmlVar2 = hmlVarC;
                hmwVar2 = hmwVar;
                z = true;
            }
            final gnd gndVar2 = (gnd) objS3;
            boolean zF = hmlVar2.F(gndVar2);
            Object objS4 = hmwVar2.S();
            if (zF || objS4 == obj) {
                objS4 = new fdap() { // from class: gov
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        gnd gndVar3 = gndVar2;
                        gndVar3.show();
                        return new gpa(gndVar3);
                    }
                };
                hmwVar2.af(objS4);
            }
            hob.c(gndVar2, (fdap) objS4, hmlVar2);
            boolean zF2 = hmlVar2.F(gndVar2) | ((i4 & 14) == 4 ? z : false) | ((i4 & 896) == 256 ? z : false) | ((i4 & 112) == 32 ? z : false) | hmlVar2.B(kjiVar.ordinal());
            Object objS5 = hmwVar2.S();
            if (zF2 || objS5 == obj) {
                fdae fdaeVar2 = new fdae() { // from class: gow
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        gndVar2.a(fdaeVar, gotVar, j, kjiVar);
                        return fctx.a;
                    }
                };
                hmwVar2.af(fdaeVar2);
                objS5 = fdaeVar2;
            }
            hob.i((fdae) objS5, hmlVar2);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gox
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    long j2 = j;
                    got gotVar2 = gotVar;
                    ddp ddpVar2 = ddpVar;
                    gpb.a(fdaeVar3, j2, gotVar2, ddpVar2, fdatVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean b(long j) {
        return !fcts.a(j, ije.g) && ((double) ijg.a(j)) <= 0.5d;
    }
}
