package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kas {
    public static final int a(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        return !z2 ? 0 : 2;
    }

    public static final int b(kcc kccVar, int i) {
        return a(kccVar.compareTo(kcc.c) >= 0, kbw.b(i, 1));
    }
}
