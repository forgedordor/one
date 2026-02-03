package defpackage;

import android.view.inputmethod.HandwritingGesture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffp {
    public static final int a(HandwritingGesture handwritingGesture, fdap fdapVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        fdapVar.invoke(new kde(fallbackText, 1));
        return 5;
    }

    public static final void b(long j, juo juoVar, boolean z, fdap fdapVar) {
        if (z) {
            int iE = jyo.e(j);
            int iA = jyo.a(j);
            int iCodePointBefore = iE > 0 ? Character.codePointBefore(juoVar, iE) : 10;
            int iCodePointAt = iA < juoVar.a() ? Character.codePointAt(juoVar, iA) : 10;
            if (ffr.i(iCodePointBefore) && (ffr.h(iCodePointAt) || ffr.g(iCodePointAt))) {
                do {
                    iE -= Character.charCount(iCodePointBefore);
                    if (iE == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(juoVar, iE);
                    }
                } while (ffr.i(iCodePointBefore));
                j = jyp.a(iE, iA);
            } else if (ffr.i(iCodePointAt) && (ffr.h(iCodePointBefore) || ffr.g(iCodePointBefore))) {
                do {
                    iA += Character.charCount(iCodePointAt);
                    if (iA == juoVar.a()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(juoVar, iA);
                    }
                } while (ffr.i(iCodePointAt));
                j = jyp.a(iE, iA);
            }
        }
        fdapVar.invoke(new ffq(new kdm[]{new ket(jyo.a(j), jyo.a(j)), new kdk(jyo.b(j), 0)}));
    }

    public static final void c(int i, String str, fdap fdapVar) {
        fdapVar.invoke(new ffq(new kdm[]{new ket(i, i), new kde(str, 1)}));
    }

    public static final void d(long j, fmx fmxVar, fdap fdapVar) {
        fdapVar.invoke(new ket(jyo.e(j), jyo.a(j)));
        if (fmxVar != null) {
            fmxVar.j(true);
        }
    }

    public static final int e(int i) {
        return i != 1 ? 0 : 1;
    }
}
