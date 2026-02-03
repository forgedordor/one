package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbde implements fbdd {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.e("45408342", false, "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.c("45619115", 20000L, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbdd
    public final long a() {
        return ((Long) b.get()).longValue();
    }

    @Override // defpackage.fbdd
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }
}
