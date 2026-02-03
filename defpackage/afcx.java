package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcx {
    public static dqxe a(boolean z) {
        return new dqxl("CAST(IFNULL($V, 0) AS INT) = $V", new Object[]{adty.c.d, Integer.valueOf(d(z))});
    }

    static dqxe b(boolean z) {
        return new dqxl("CAST(IFNULL($V, 0) AS INT) > $V", new Object[]{adty.c.d, Integer.valueOf(d(z))});
    }

    public static dqxe c(boolean z) {
        return new dqxl("CAST(IFNULL($V, 0) AS INT) < $V", new Object[]{adty.c.d, Integer.valueOf(d(z))});
    }

    private static int d(boolean z) {
        return z ? 1 : 0;
    }
}
