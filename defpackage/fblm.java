package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblm implements fbll {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.e("13", false, "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("10", true, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fbll
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbll
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
