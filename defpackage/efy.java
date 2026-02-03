package defpackage;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efy {
    public static final float a(egc egcVar, kji kjiVar) {
        return kjiVar == kji.a ? egcVar.c(kjiVar) : egcVar.b(kjiVar);
    }

    public static final float b(egc egcVar, kji kjiVar) {
        return kjiVar == kji.a ? egcVar.b(kjiVar) : egcVar.c(kjiVar);
    }

    public static final ics c(ics icsVar, egc egcVar) {
        return icsVar.a(new PaddingValuesElement(egcVar));
    }

    public static final ics d(ics icsVar, float f) {
        return icsVar.a(new PaddingElement(f, f, f, f));
    }

    public static final ics e(ics icsVar, float f, float f2) {
        return icsVar.a(new PaddingElement(f, f2, f, f2));
    }

    public static final ics f(ics icsVar, float f, float f2, float f3, float f4) {
        return icsVar.a(new PaddingElement(f, f2, f3, f4));
    }

    public static /* synthetic */ egc g(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new egd(f, f2, f, f2);
    }

    public static /* synthetic */ egc h(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new egd(f, f2, f3, f4);
    }

    public static /* synthetic */ ics i(ics icsVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return e(icsVar, f, f2);
    }

    public static /* synthetic */ ics j(ics icsVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return f(icsVar, f, f2, f3, f4);
    }
}
