package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fig {
    public static final int a(long j, jyi jyiVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i) >= jyiVar.b.e ? jyiVar.a.a.a() : jyiVar.k(j);
    }

    public static final int b(fik fikVar, Comparator comparator, long j, int i) {
        int iCompare = comparator.compare(Long.valueOf(fikVar.b), Long.valueOf(j));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare <= 0 ? fikVar.a : i;
    }

    public static final int c(int i, int i2, fka fkaVar, long j, fik fikVar) {
        if (fikVar == null) {
            return fkc.a(i, i2);
        }
        int iCompare = fkaVar.f.compare(Long.valueOf(fikVar.b), Long.valueOf(j));
        if (iCompare < 0) {
            return 1;
        }
        return iCompare > 0 ? 3 : 2;
    }
}
