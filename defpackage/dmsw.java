package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsw {
    public static final void a(final dmsy dmsyVar, final float f, hml hmlVar, final int i) {
        int i2;
        egd egdVar;
        String str;
        int i3;
        hmw hmwVar;
        gal galVarC;
        hmw hmwVar2;
        dmsyVar.getClass();
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(1937417998);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(dmsyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float f2 = dmsyVar.a;
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
            str2.getClass();
            String strC = jqu.c(R.string.camera_zoom_button_content_description, new Object[]{str2}, hmlVarC);
            final boolean z = dmsyVar.b == f2;
            ics icsVarA = ifi.a(egq.k(ics.e, 32.0f), f);
            hmlVarC.v(5004770);
            boolean zE = hmlVarC.E(z);
            hmw hmwVar3 = (hmw) hmlVarC;
            Object objS = hmwVar3.S();
            if (zE || objS == hmk.a) {
                objS = new fdap() { // from class: dmsr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.r(jtoVar, z);
                        return fctx.a;
                    }
                };
                hmwVar3.af(objS);
            }
            hmwVar3.ab();
            ics icsVarC = jsh.c(icsVarA, false, (fdap) objS);
            evm evmVar = evn.a;
            egd egdVar2 = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            if (z) {
                hmlVarC.v(1849621948);
                egc egcVar = gam.a;
                hmwVar = hmwVar3;
                str = strC;
                i3 = 5004770;
                egdVar = egdVar2;
                galVarC = gam.c(glz.a(hmlVarC).f, glz.a(hmlVarC).g, 0L, 0L, hmlVarC, 12);
                hmwVar.ab();
            } else {
                egdVar = egdVar2;
                str = strC;
                i3 = 5004770;
                hmwVar = hmwVar3;
                hmlVarC.v(1849810397);
                egc egcVar2 = gam.a;
                long j = glz.a(hmlVarC).q;
                long jD = ijg.d(4288322202L);
                galVarC = gam.c(ijg.f(ije.d(jD), ije.c(jD), ije.b(jD), 0.2f, ije.f(jD)), j, 0L, 0L, hmlVarC, 12);
                hmwVar.ab();
            }
            gal galVar = galVarC;
            hmlVarC.v(i3);
            int i5 = i2 & 14;
            Object objS2 = hmwVar.S();
            if (i5 == 4 || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: dmss
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dmsy dmsyVar2 = dmsyVar;
                        dmsyVar2.c.invoke(Float.valueOf(dmsyVar2.a));
                        return fctx.a;
                    }
                };
                hmwVar2 = hmwVar;
                hmwVar2.af(objS2);
            } else {
                hmwVar2 = hmwVar;
            }
            hmwVar2.ab();
            gax.a((fdae) objS2, icsVarC, false, evmVar, galVar, null, null, egdVar, hxe.d(1576898302, new dmsv(str, str2), hmlVarC), hmlVarC, 817889280, 356);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmst
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmsy dmsyVar2 = dmsyVar;
                    int i6 = i;
                    dmsw.a(dmsyVar2, f, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
