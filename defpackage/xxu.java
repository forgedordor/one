package defpackage;

import android.net.Uri;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxu implements dpmh {
    public final xxe a;
    private final fctc b;
    private final fctc c;

    public xxu(final fcsu fcsuVar, xxe xxeVar) {
        fcsuVar.getClass();
        this.a = xxeVar;
        this.b = fctd.a(new fdae() { // from class: xxh
            @Override // defpackage.fdae
            public final Object invoke() {
                return (xye) fcsuVar.b();
            }
        });
        this.c = fctd.a(new fdae() { // from class: xxi
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        });
    }

    public static final boolean h(xvx xvxVar) {
        Object obj = ((dpqk) xvxVar.d.a()).a;
        dpsb dpsbVar = obj instanceof dpsb ? (dpsb) obj : null;
        return dpsbVar != null && ((Boolean) dpsbVar.f.a()).booleanValue();
    }

    @Override // defpackage.dpmh
    public final dpos a() {
        return new dpos(new hxd(1455621114, true, new xxo()), new hxd(1845896346, true, new xxq(this)), new hxd(-1191112407, true, new xxs(this)), new hxd(778024428, true, new xxt(this)), xvh.a, null, null, 193);
    }

    @Override // defpackage.dpmh
    public final /* synthetic */ Object b(fdjx fdjxVar, fdae fdaeVar) {
        Object dojuVar;
        Object objA;
        xye xyeVar = (xye) this.b.a();
        iaf iafVar = new iaf();
        final xxe xxeVar = this.a;
        List<ajlt> list = xxeVar.a;
        fduf fdufVar = xxeVar.c;
        auvw.m(fdjxVar, null, new xyd(fdufVar, iafVar, list, xyeVar, fdjxVar, fdaeVar, null), 3);
        hpl hplVar = new hpl(new dpqk(null, 0.0f, null), hsi.a);
        fdvc fdvcVarC = auyf.c(fdufVar, fdjxVar, new fdap() { // from class: xxx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((ajlt) xxeVar.a.get(((Integer) obj).intValue())).b().a();
            }
        });
        ArrayList arrayList = new ArrayList();
        for (ajlt ajltVar : list) {
            amvr amvrVarG = ajltVar.g();
            if (le.m(amvrVarG.b()) && (amvrVarG instanceof amwm)) {
                amwm amwmVar = (amwm) amvrVarG;
                String strB = amwmVar.b();
                strB.getClass();
                dohm dohmVar = (dohm) dogi.c(strB);
                String string = amwmVar.e().toString();
                string.getClass();
                String strL = amwmVar.l();
                int width = amwmVar.f().getWidth();
                int height = amwmVar.f().getHeight();
                Instant instantOfEpochMilli = amwmVar instanceof amvy ? Instant.ofEpochMilli(((amvy) amwmVar).a()) : Instant.now();
                instantOfEpochMilli.getClass();
                dojuVar = new dojr(dohmVar, string, null, strL, width, height, 0L, instantOfEpochMilli, dltb.a, 4);
            } else {
                if (!le.z(amvrVarG.b()) || !(amvrVarG instanceof amvy)) {
                    throw new IllegalStateException("Unhandled message content-type: ".concat(String.valueOf(amvrVarG.b())));
                }
                amvy amvyVar = (amvy) amvrVarG;
                dojm dojmVar = (dojm) dogi.c(amvyVar.b());
                Uri uriE = amvyVar.e();
                if (true == fdbq.f(uriE, Uri.EMPTY)) {
                    uriE = null;
                }
                if (uriE == null) {
                    uriE = amvyVar.d();
                }
                if (uriE == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string2 = uriE.toString();
                string2.getClass();
                int width2 = amvyVar.f().getWidth();
                int height2 = amvyVar.f().getHeight();
                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(amvyVar.a());
                instantOfEpochMilli2.getClass();
                dltb dltbVar = dltb.a;
                Object objOrElse = amvyVar.k().orElse(0L);
                objOrElse.getClass();
                Duration durationOfMillis = Duration.ofMillis(((Number) objOrElse).longValue());
                durationOfMillis.getClass();
                dojuVar = new doju(dojmVar, string2, null, null, width2, height2, 0L, instantOfEpochMilli2, dltbVar, durationOfMillis, 12);
            }
            if (dojuVar instanceof dojr) {
                dprx dprxVar = xyeVar.a;
                String strA = ajltVar.b().a();
                strA.getClass();
                objA = dprx.a(new dprz(strA, (dojr) dojuVar, null, null, true, true, null, 68));
            } else {
                if (!(dojuVar instanceof doju)) {
                    dojuVar.toString();
                    throw new IllegalStateException("Unhandled media attachment ".concat(dojuVar.toString()));
                }
                dptk dptkVar = xyeVar.b;
                String strA2 = ajltVar.b().a();
                strA2.getClass();
                objA = dptkVar.a(fdjxVar, new dptm(strA2, (doju) dojuVar, null, null, true, false, null, 228));
            }
            arrayList.add(objA);
        }
        xxy xxyVar = new xxy(null, xyeVar, fdjxVar, xxeVar, iafVar);
        int i = fdsn.a;
        return new xvx(fdjxVar, fdvcVarC, iafVar, fdtg.b(new fdwg(xxyVar, fdufVar), fdjxVar, fdur.b, null), hplVar, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.dplv r22, final defpackage.ics r23, final defpackage.xvx r24, final defpackage.xxe r25, defpackage.hml r26, final int r27) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxu.c(dplv, ics, xvx, xxe, hml, int):void");
    }

    public final void d(final iiy iiyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(862909281);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(iiyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = ijn.c(egq.e(egq.d(ics.e, 1.0f), 186.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, 458751);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: xxf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imw imwVar = (imw) obj;
                        imwVar.getClass();
                        imwVar.p();
                        imy.i(imwVar, iiyVar, 0L, 0L, 0.0f, null, 0, 126);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ecz.b(ifb.c(icsVarC, (fdap) objS), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xxg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xxu xxuVar = this.a;
                    int i5 = i;
                    xxuVar.d(iiyVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.dpmi
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.dpmi
    public final /* synthetic */ void f() {
    }
}
