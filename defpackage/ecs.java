package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecs {
    public static final ics a(ics icsVar, float f, boolean z) {
        return icsVar.a(new AspectRatioElement(f, z));
    }

    public static final boolean b(long j, int i, int i2) {
        if (i > kil.b(j) || kil.d(j) > i) {
            return false;
        }
        return i2 <= kil.a(j) && kil.c(j) <= i2;
    }
}
