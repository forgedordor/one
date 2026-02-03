package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcp implements fbco {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.e("45665657", true, "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.e("45627084", false, "com.google.android.libraries.notifications.platform", eadcVar);
        c = eacj.e("45409170", false, "com.google.android.libraries.notifications.platform", eadcVar);
        d = eacj.c("45627251", 2592000000L, "com.google.android.libraries.notifications.platform", eadcVar);
        e = eacj.e("45690612", false, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbco
    public final long a() {
        return ((Long) d.get()).longValue();
    }

    @Override // defpackage.fbco
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.fbco
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.fbco
    public final boolean d() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.fbco
    public final boolean e() {
        return ((Boolean) e.get()).booleanValue();
    }
}
