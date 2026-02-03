package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqz {
    private fgqz() {
    }

    public static void a(String str) {
        throw new fgra(str);
    }

    public static void b(boolean z) {
        if (z) {
            throw new fgra("Must be false");
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new fgra("Must be true");
        }
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new fgra(str);
        }
    }

    public static void e(String str) {
        if (str == null || str.length() == 0) {
            throw new fgra("String must not be empty");
        }
    }

    public static void f(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new fgra(str2);
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new fgra("Object must not be null");
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new fgra(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new fgra(String.format("The parameter '%s' must not be null.", str));
        }
    }
}
