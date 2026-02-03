package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbil implements fbik {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.e("45359255", false, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.e("36", true, "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbik
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbik
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
