package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcv implements fbcu {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.c("45627483", 2592000000L, "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.c("45627482", 86400000L, "com.google.android.libraries.notifications.platform", eadcVar);
        c = eacj.e("45654308", true, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbcu
    public final long a() {
        return ((Long) a.get()).longValue();
    }

    @Override // defpackage.fbcu
    public final long b() {
        return ((Long) b.get()).longValue();
    }

    @Override // defpackage.fbcu
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }
}
