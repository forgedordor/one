package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcj implements fbci {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbbx.a;
        a = eacj.e("45642596", false, "com.google.android.libraries.notifications.platform", eadcVar);
        b = eacj.e("45642594", true, "com.google.android.libraries.notifications.platform", eadcVar);
    }

    @Override // defpackage.fbci
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.fbci
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }
}
