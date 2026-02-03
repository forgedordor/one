package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbzy {
    public static final dbzy a = f(1, Double.valueOf(0.0d));
    public static final dbzy b = e(3);
    public static final dbzy c = e(4);
    public static final dbzy d = e(5);
    public static final dbzy e = f(2, Double.valueOf(1.0d));

    public static dbzy c(boolean z, double d2) {
        return f(true == z ? 2 : 1, Double.valueOf(d2));
    }

    static dbzy e(int i) {
        ejwl.a(true);
        ejwl.a(true);
        return f(i, null);
    }

    static dbzy f(int i, Double d2) {
        if (d2 == null) {
            d2 = Double.valueOf(0.0d);
        }
        return new dbyh(i, d2.doubleValue());
    }

    public abstract double a();

    public abstract int b();

    public final boolean d() {
        return b() != 1;
    }
}
