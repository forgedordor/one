package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdr implements fbdq {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;
    public static final eaci f;
    public static final eaci g;
    public static final eaci h;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.d("45627487", "", "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.e("45628914", false, "com.google.android.libraries.notifications.platform", eadcVar);
        c = eacj.e("45627819", false, "com.google.android.libraries.notifications.platform", eadcVar);
        d = eacj.c("45627820", 14400000L, "com.google.android.libraries.notifications.platform", eadcVar);
        e = eacj.c("45427102", 604800000L, "com.google.android.libraries.notifications.platform", eadcVar);
        f = eacj.c("45627823", 14400000L, "com.google.android.libraries.notifications.platform", eadcVar);
        g = eacj.c("45427103", 3600000L, "com.google.android.libraries.notifications.platform", eadcVar);
        h = eacj.e("45628913", false, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbdq
    public final long a() {
        return ((Long) d.get()).longValue();
    }

    @Override // defpackage.fbdq
    public final long b() {
        return ((Long) e.get()).longValue();
    }

    @Override // defpackage.fbdq
    public final long c() {
        return ((Long) f.get()).longValue();
    }

    @Override // defpackage.fbdq
    public final long d() {
        return ((Long) g.get()).longValue();
    }

    @Override // defpackage.fbdq
    public final String e() {
        return (String) a.get();
    }

    @Override // defpackage.fbdq
    public final boolean f() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.fbdq
    public final boolean g() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.fbdq
    public final boolean h() {
        return ((Boolean) h.get()).booleanValue();
    }
}
