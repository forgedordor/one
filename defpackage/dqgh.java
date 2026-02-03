package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgh {
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dqcs r11, boolean r12, defpackage.hml r13, final int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqgh.a(dqcs, boolean, hml, int):void");
    }

    public static final void b(final dqiu dqiuVar, final dqga dqgaVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        boolean z;
        final ics icsVar2;
        hml hmlVar2;
        dqiuVar.getClass();
        hml hmlVarC = hmlVar.c(-631607887);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dqiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dqgaVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new hph(0);
                hmwVar.af(objS);
            }
            final hri hriVar = (hri) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                z = true;
                objS2 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f);
                hmwVar.af(objS2);
            } else {
                z = true;
            }
            final boolean zBooleanValue = ((Boolean) objS2).booleanValue();
            hmwVar.ab();
            dqcr dqcrVar = (dqcr) dqcs.a.createBuilder();
            dqcrVar.getClass();
            dqcrVar.copyOnWrite();
            dqcs dqcsVar = (dqcs) dqcrVar.instance;
            dqcsVar.c = dqcv.a(3);
            dqcsVar.b |= 1;
            evsn evsnVarBuild = dqcrVar.build();
            evsnVarBuild.getClass();
            final List listAh = fcva.ah(fcva.b((dqcs) evsnVarBuild), dqgaVar.b);
            ics icsVarA = joj.a(egq.d(egq.e(icoVar, 64.0f), 1.0f), "mood_selector_tag");
            ecj ecjVarG = ecr.g(8.0f);
            hmlVarC.v(-1224400529);
            boolean zF = ((i3 & 14) == 4 ? z : false) | hmlVarC.F(listAh) | hmlVarC.F(dqgaVar);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == obj) {
                fdap fdapVar = new fdap() { // from class: dqgc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        eio eioVar = (eio) obj2;
                        eioVar.getClass();
                        List list = listAh;
                        eioVar.a(list.size(), null, new dqgf(list), new hxd(2039820996, true, new dqgg(list, dqiuVar, hriVar, zBooleanValue, dqgaVar)));
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS3 = fdapVar;
            }
            hmwVar.ab();
            icsVar2 = icoVar;
            hmlVar2 = hmlVarC;
            eig.b(icsVarA, ejyVarA, null, ecjVarG, null, null, false, null, (fdap) objS3, hmlVar2, 24576, 492);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqgd
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dqiu dqiuVar2 = dqiuVar;
                    dqga dqgaVar2 = dqgaVar;
                    int i4 = i;
                    dqgh.b(dqiuVar2, dqgaVar2, icsVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
