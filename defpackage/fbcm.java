package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcm implements fbcl {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.e("45627070", false, "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.e("45628136", false, "com.google.android.libraries.notifications.platform", eadcVar);
        c = eacj.c("45413095", 5000L, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbcl
    public final long a() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.fbcl
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.fbcl
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }
}
