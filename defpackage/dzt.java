package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt {
    public static final float a(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat(i2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)))) * 180.0f) / 3.1415927f;
    }

    public static final float b(irs irsVar, boolean z) {
        long jD = d(irsVar, z);
        float fA = 0.0f;
        if (ihs.h(jD, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = irsVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ise iseVar = (ise) list.get(i2);
            if (iseVar.d && iseVar.h) {
                fA += ihs.a(ihs.d(z ? iseVar.c : iseVar.g, jD));
                i++;
            }
        }
        return fA / i;
    }

    public static final float c(irs irsVar) {
        float fB = b(irsVar, true);
        float fB2 = b(irsVar, false);
        if (fB == 0.0f || fB2 == 0.0f) {
            return 1.0f;
        }
        return fB / fB2;
    }

    public static final long d(irs irsVar, boolean z) {
        List list = irsVar.a;
        int size = list.size();
        long jE = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ise iseVar = (ise) list.get(i2);
            if (iseVar.d && iseVar.h) {
                jE = ihs.e(jE, z ? iseVar.c : iseVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return ihs.c(jE, i);
    }

    public static final long e(irs irsVar) {
        long jD = d(irsVar, true);
        if (ihs.h(jD, 9205357640488583168L)) {
            return 0L;
        }
        return ihs.d(jD, d(irsVar, false));
    }
}
