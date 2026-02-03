package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgj implements fbgi {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgg.a;
        a = eacj.e("45477821", false, "com.google.android.libraries.onegoogle", eadcVar);
        b = eacj.e("45383896", true, "com.google.android.libraries.onegoogle", eadcVar);
        c = eacj.e("45386670", true, "com.google.android.libraries.onegoogle", eadcVar);
        d = eacj.e("45644389", false, "com.google.android.libraries.onegoogle", eadcVar);
    }

    @Override // defpackage.fbgi
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgi
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgi
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgi
    public final void d(Context context) {
        ((Boolean) d.gX(context)).booleanValue();
    }
}
