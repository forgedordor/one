package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnp {
    public static String a(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    public static void b(int i) {
        boolean z;
        if (i == 0 || i == 1) {
            z = true;
        } else if (i == 2) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        dclh.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
    }
}
