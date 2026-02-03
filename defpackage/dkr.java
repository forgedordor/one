package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkr {
    public static final long a(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public static final ics b(ics icsVar, dky dkyVar, ikp ikpVar) {
        return d(icsVar, dkyVar.a, dkyVar.b, ikpVar);
    }

    public static final ics c(ics icsVar, float f, long j, ikp ikpVar) {
        return d(icsVar, f, new ikt(j), ikpVar);
    }

    public static final ics d(ics icsVar, float f, iiy iiyVar, ikp ikpVar) {
        return icsVar.a(new BorderModifierNodeElement(f, iiyVar, ikpVar));
    }
}
