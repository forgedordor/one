package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dor {
    public static final hpt a = new hno(new fdap() { // from class: doq
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            hxi hxiVar = (hxi) obj;
            hpt hptVar = dor.a;
            int i = dkk.a;
            Context context = (Context) hnl.b(hxiVar, AndroidCompositionLocals_androidKt.b);
            kio kioVar = (kio) hnl.b(hxiVar, jmh.e);
            dom domVar = (dom) hnl.b(hxiVar, doo.a);
            if (domVar == null) {
                return null;
            }
            return new dki(context, kioVar, domVar.a, domVar.b);
        }
    });

    public static final dop a(hml hmlVar) {
        hmlVar.v(282942128);
        dki dkiVar = (dki) hmlVar.e(a);
        if (dkiVar == null) {
            ((hmw) hmlVar).ab();
            return null;
        }
        boolean zD = hmlVar.D(dkiVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = dkiVar.a();
            hmwVar.af(objS);
        }
        dop dopVar = (dop) objS;
        hmwVar.ab();
        return dopVar;
    }
}
