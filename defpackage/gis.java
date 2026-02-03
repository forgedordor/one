package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gis implements gsr {
    public static final gis a = new gis();

    private gis() {
    }

    @Override // defpackage.gsr
    public final void a(final gss gssVar, hml hmlVar, final int i) {
        int i2;
        ics icsVarA;
        final hcq hcqVarB;
        ics icsVarA2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2137486921);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gssVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            float f = gssVar.h;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            int i4 = i2 & 14;
            hck hckVar = gssVar.j;
            hcn hcnVar = gssVar.k;
            boolean zD = hmlVarC.D(hckVar) | hmlVarC.D(hcnVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                gir girVar = new gir(gssVar);
                hxn hxnVar = hrp.a;
                objS = new hnt(girVar, null);
                hmwVar.af(objS);
            }
            final hsf hsfVarB = dcs.b(((ije) ((hsf) objS).a()).i, gpg.b(4, hmlVarC), hmlVarC, 0, 12);
            hwv hwvVarD = hxe.d(-1658896622, new gip(gssVar), hmlVarC);
            if (hcnVar == null || hcnVar.c()) {
                hmlVarC.v(690108113);
                hmwVar.ab();
                icsVarA = ics.e;
            } else {
                hmlVarC.v(689467622);
                ico icoVar = ics.e;
                dwm dwmVar = dwm.a;
                Object objS2 = hmwVar.S();
                if (i4 == 4 || objS2 == hmk.a) {
                    objS2 = new fdap() { // from class: gii
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            float fFloatValue = ((Float) obj).floatValue();
                            hcq hcqVarB2 = gssVar.k.b();
                            hcqVarB2.e(hcqVarB2.c() + fFloatValue);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                fdau fdauVar = dvc.a;
                final hsf hsfVarA = hsc.a((fdap) objS2, hmlVarC);
                Object objS3 = hmwVar.S();
                Object obj = hmk.a;
                if (objS3 == obj) {
                    dsw dswVar = new dsw(new fdap() { // from class: duz
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            Float f2 = (Float) obj2;
                            f2.floatValue();
                            fdau fdauVar2 = dvc.a;
                            ((fdap) hsfVarA.a()).invoke(f2);
                            return fctx.a;
                        }
                    });
                    hmwVar.af(dswVar);
                    objS3 = dswVar;
                }
                dvi dviVar = (dvi) objS3;
                Object objS4 = hmwVar.S();
                if (i4 == 4 || objS4 == obj) {
                    objS4 = new giq(gssVar, null);
                    hmwVar.af(objS4);
                }
                icsVarA = dvc.a(icoVar, dviVar, dwmVar, false, null, false, (fdau) objS4, false, 188);
                hmwVar.ab();
            }
            ics icsVarA3 = gssVar.a.a(icsVarA);
            boolean zD2 = hmlVarC.D(hsfVarB);
            Object objS5 = hmwVar.S();
            if (zD2 || objS5 == hmk.a) {
                objS5 = new fdap() { // from class: gij
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        imz imzVar = (imz) obj2;
                        long j = ((ije) hsfVarB.a()).i;
                        if (!fcts.a(j, ije.h)) {
                            imzVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            ics icsVarA4 = ifb.a(icsVarA3, (fdap) objS5);
            Object objS6 = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS6 == obj2) {
                objS6 = new fdap() { // from class: gik
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.L((jto) obj3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS6);
            }
            ics icsVarC = jsh.c(icsVarA4, false, (fdap) objS6);
            fctx fctxVar = fctx.a;
            Object objS7 = hmwVar.S();
            if (objS7 == obj2) {
                objS7 = gio.a;
                hmwVar.af(objS7);
            }
            ics icsVarA5 = itf.a(icsVarC, fctxVar, (PointerInputEventHandler) objS7);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA5);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            ics icsVarB2 = iex.b(ehm.b(ics.e, gssVar.i));
            float f2 = fyx.a;
            if (hcnVar != null && (hcqVarB = hcnVar.b()) != null && (icsVarA2 = iye.a(icsVarB2, new fdap() { // from class: fyo
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    long j = ((kjg) obj3).a & 4294967295L;
                    float f3 = fyx.a;
                    hcq hcqVar = hcqVarB;
                    hcqVar.b = -(((int) j) - hcqVar.c());
                    return fctx.a;
                }
            })) != null) {
                icsVarB2 = icsVarA2;
            }
            Object objS8 = hmwVar.S();
            if (i4 == 4 || objS8 == obj2) {
                objS8 = new hil() { // from class: gil
                    @Override // defpackage.hil
                    public final float a() {
                        hcq hcqVarB2;
                        hcn hcnVar2 = gssVar.k;
                        if (hcnVar2 == null || (hcqVarB2 = hcnVar2.b()) == null) {
                            return 0.0f;
                        }
                        return hcqVarB2.c();
                    }
                };
                hmwVar.af(objS8);
            }
            long j = hckVar.c;
            long j2 = hckVar.d;
            long j3 = hckVar.e;
            long j4 = hckVar.f;
            fdat fdatVar2 = gssVar.b;
            jyq jyqVar = gssVar.c;
            jyq jyqVar2 = gssVar.d;
            ibx ibxVar = gssVar.e;
            fdat fdatVar3 = gssVar.f;
            hil hilVar = (hil) objS8;
            ecj ecjVar = ecr.e;
            Object objS9 = hmwVar.S();
            if (objS9 == obj2) {
                objS9 = new fdae() { // from class: gim
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Float.valueOf(1.0f);
                    }
                };
                hmwVar.af(objS9);
            }
            fyx.d(icsVarB2, hilVar, j, j2, j4, j3, fdatVar2, jyqVar, jyqVar2, (fdae) objS9, ecjVar, ibxVar, fdatVar3, hwvVarD, f, hmlVarC, 0, 1600566);
            hmlVarC = hmlVarC;
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gin
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    gis gisVar = this.a;
                    int i5 = i;
                    gisVar.a(gssVar, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
