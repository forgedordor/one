package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwl {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, Character.valueOf(c)));
        }
    }

    public static void d(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, Integer.valueOf(i)));
        }
    }

    public static void e(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, Long.valueOf(j)));
        }
    }

    public static void f(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, obj));
        }
    }

    public static void g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void h(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, obj, Integer.valueOf(i)));
        }
    }

    public static void i(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, obj, obj2));
        }
    }

    public static void j(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, obj, obj2, obj3));
        }
    }

    public static void k(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? y(i, i3, "start index") : (i2 < 0 || i2 > i3) ? y(i2, i3, "end index") : ejxq.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void l(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void n(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, Integer.valueOf(i)));
        }
    }

    public static void o(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, Long.valueOf(j)));
        }
    }

    public static void p(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, obj));
        }
    }

    public static void q(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void r(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, obj, obj2));
        }
    }

    public static void s(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(ejxq.a(str, obj, obj2, obj3));
        }
    }

    public static void t(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a(str, 4800, obj));
        }
    }

    public static void u(boolean z, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(ejxq.a("duration cannot be negative: %s %s", Long.valueOf(j), obj));
        }
    }

    public static void v(int i, int i2) {
        w(i, i2, "index");
    }

    public static void w(int i, int i2, String str) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = ejxq.a("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.g(i2, "negative size: "));
                }
                strA = ejxq.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void x(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(y(i, i2, "index"));
        }
    }

    private static String y(int i, int i2, String str) {
        if (i < 0) {
            return ejxq.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ejxq.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.g(i2, "negative size: "));
    }
}
