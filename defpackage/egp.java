package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egp implements ego {
    public static final egp a = new egp();

    private egp() {
    }

    @Override // defpackage.ego
    public final ics a(ics icsVar, float f, boolean z) {
        if (f <= 0.0d) {
            eic.a("invalid weight; must be greater than zero");
        }
        return icsVar.a(new LayoutWeightElement(fddu.d(f, Float.MAX_VALUE), z));
    }

    @Override // defpackage.ego
    public final ics b(ics icsVar, icc iccVar) {
        return icsVar.a(new VerticalAlignElement(iccVar));
    }
}
