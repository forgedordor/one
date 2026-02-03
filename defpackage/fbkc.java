package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbkc implements fbkb {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.d("7", "SURVEYS", "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("9", false, "com.google.android.libraries.surveys", eadcVar);
        c = eacj.e("6", true, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fbkb
    public final String a(Context context) {
        return (String) a.gX(context);
    }

    @Override // defpackage.fbkb
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbkb
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }
}
