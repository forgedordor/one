package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baui {
    public static final ekgb a = ekgb.t(14, 15, 1);
    public static final ekgb b = ekgb.v(10, 4, 5, 6, 7);
    public final cqjy c;
    private final cogw d;

    public baui(cqjy cqjyVar, cogw cogwVar) {
        this.c = cqjyVar;
        this.d = cogwVar;
    }

    public static boolean c(int i) {
        return r(i) && i != 11;
    }

    public static boolean d(int i) {
        return i == 214 || i == 215 || i == 216 || i == 219 || i == 235 || i == 236 || i == 237 || i == 238;
    }

    public static boolean e(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean f(int i) {
        return i == 107 || i == 111;
    }

    public static boolean g(int i) {
        return i == 207 || i == 206 || i == 213 || i == 264;
    }

    public static boolean h(int i) {
        return i == 100 || i == 108 || i == 109;
    }

    public static boolean i(int i) {
        return i == 105 || i == 103 || i == 104 || i == 102;
    }

    public static boolean j(int i) {
        return i == 2;
    }

    public static boolean k(int i) {
        return i == 2 || i == 11;
    }

    public static boolean l(int i) {
        return i == 11;
    }

    public static boolean m(int i) {
        return f(i) || s(i);
    }

    public static boolean n(int i) {
        return b.contains(Integer.valueOf(i));
    }

    public static boolean o(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static boolean p(int i) {
        return i == 1 || i == 2 || i == 11 || i == 15 || i == 14;
    }

    public static boolean q(int i) {
        return i == 1 || i == 2;
    }

    public static boolean r(int i) {
        return i > 0 && i <= 25;
    }

    public static boolean s(int i) {
        return i == 9 || i == 13 || i == 18 || i == 24;
    }

    public static boolean t(int i) {
        return i == 3;
    }

    public static boolean u(int i) {
        return i == 0;
    }

    public static boolean v(int i) {
        return i >= 200 && i <= 270;
    }

    public final boolean a(int i, int i2, long j, boolean z) {
        return t(i) && o(i2) && j <= this.d.f().toEpochMilli() - ((Long) anpo.b.e()).longValue() && z;
    }

    public final boolean b(int i, int i2, long j) {
        return t(i) && n(i2) && j <= this.d.f().toEpochMilli() - ((Long) anpo.a.e()).longValue();
    }
}
