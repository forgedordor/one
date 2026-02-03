package defpackage;

import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.OffsetPxElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efs {
    public static final ics a(ics icsVar, fdap fdapVar) {
        return icsVar.a(new OffsetPxElement(fdapVar, true));
    }

    public static final ics b(ics icsVar, float f, float f2) {
        return icsVar.a(new OffsetElement(f, f2));
    }

    public static /* synthetic */ ics c(ics icsVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return b(icsVar, f, f2);
    }
}
