package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejyb {
    public static void a(boolean z) {
        if (!z) {
            throw new ejyc();
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new ejyc(ejxq.a(str, obj));
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new ejyc(ejxq.a(str, objArr));
        }
    }

    public static void d(boolean z, int i, int i2) {
        if (!z) {
            throw new ejyc(ejxq.a("Require minMessagesToUpdatePerBatch <= maxMessagesToUpdatePerBatch, but found %s > %s.", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void e(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new ejyc(ejxq.a("expected a non-null reference", objArr));
        }
    }
}
