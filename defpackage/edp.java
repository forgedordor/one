package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edp {
    public static final edp a = new edp();

    private edp() {
    }

    public static final ics a(ics icsVar, ibx ibxVar) {
        return icsVar.a(new HorizontalAlignElement(ibxVar));
    }

    public static final ics b(ics icsVar, float f, boolean z) {
        if (f <= 0.0d) {
            eic.a("invalid weight; must be greater than zero");
        }
        return icsVar.a(new LayoutWeightElement(fddu.d(f, Float.MAX_VALUE), z));
    }
}
