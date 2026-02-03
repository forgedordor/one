package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsc {
    public static final qsa a(qse[] qseVarArr, hml hmlVar) {
        hmlVar.v(-395574495);
        int iHashCode = Arrays.hashCode(qseVarArr);
        hmlVar.v(5004770);
        boolean zB = hmlVar.B(iHashCode);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zB || objS == hmk.a) {
            objS = new qsa(fcur.M(qseVarArr));
            hmwVar.af(objS);
        }
        qsa qsaVar = (qsa) objS;
        hmwVar.ab();
        hmwVar.ab();
        return qsaVar;
    }

    public static final qse b(Object obj, Object obj2, String[] strArr, hml hmlVar) {
        hmlVar.v(-1788530187);
        hmlVar.v(5004770);
        boolean zD = hmlVar.D(strArr);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new qst((String[]) Arrays.copyOf(strArr, 1));
            hmwVar.af(objS);
        }
        qst qstVar = (qst) objS;
        hmwVar.ab();
        hmlVar.v(-1746271574);
        boolean zD2 = hmlVar.D(qstVar) | hmlVar.D(obj2);
        Object objS2 = hmwVar.S();
        if (zD2 || objS2 == hmk.a) {
            objS2 = new qse(obj, qstVar, obj2);
            hmwVar.af(objS2);
        }
        qse qseVar = (qse) objS2;
        hmwVar.ab();
        hmwVar.ab();
        return qseVar;
    }
}
