package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epu {
    public static final float a(int i, int i2, boolean z) {
        float fB = b(i, i2);
        return z ? fB + 100.0f : fB;
    }

    public static final float b(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final ics c(ics icsVar, fdae fdaeVar, ept eptVar, dwm dwmVar, boolean z, boolean z2) {
        return icsVar.a(new LazyLayoutSemanticsModifier(fdaeVar, eptVar, dwmVar, z, z2));
    }
}
