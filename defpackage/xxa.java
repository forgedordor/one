package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxa {
    private static final djcq a = new djcq(fcvo.a, new fdap() { // from class: xws
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return fctx.a;
        }
    }, new fdap() { // from class: xwt
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return fctx.a;
        }
    });

    public static final void a(final dijt dijtVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-704691465);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dijtVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarE = efy.e(egq.d(ics.e, 1.0f), 30.0f, 20.0f);
            ixm ixmVarA = ecz.a(ibw.d, false);
            int iA = xwr.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
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
            dijr.f(dijtVar, null, null, 0L, null, null, 0L, null, false, null, null, null, null, hmlVarC, i2 & 14, 0, 8190);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xwu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    xxa.a(dijtVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @fcsv
    public static final void b(final xxd xxdVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1476726928);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(xxdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final fdci fdciVar = new fdci();
            fdciVar.a = "";
            final dpfy dpfyVar = new dpfy(new dnjk() { // from class: xww
                @Override // defpackage.dnjk
                public final void a(String str) {
                    str.getClass();
                    fdciVar.a = str;
                }
            }, xxdVar.f, 2);
            djcv djcvVar = new djcv(dpfyVar, "", jqu.b(R.string.full_screen_message_compose_row_text_hint, hmlVarC), null, 0, false, null, null, 248);
            djcq djcqVar = a;
            djew djewVar = new djew(djrr.dA, new fdae() { // from class: xwx
                @Override // defpackage.fdae
                public final Object invoke() {
                    xxd xxdVar2 = xxdVar;
                    auvw.k(xxdVar2.a, null, null, new xwz(xxdVar2, fdciVar, dpfyVar, null), 3);
                    return fctx.a;
                }
            }, (fdae) null, (String) null, false, (djev) null, 124);
            xxc xxcVar = xxdVar.h;
            ybw.c(new yby(new djcy(djcvVar, djcqVar, null, djewVar, new djcx(xxcVar.c), 52), new ybm(xxcVar.b)), null, null, hmlVarC, 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xwy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    xxa.b(xxdVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dpmc r29, final defpackage.ics r30, defpackage.xxd r31, defpackage.hml r32, final int r33) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxa.c(dpmc, ics, xxd, hml, int):void");
    }

    private static final wgl d(hsf hsfVar) {
        return (wgl) hsfVar.a();
    }
}
