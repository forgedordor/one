package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblj implements fbli {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.e("12", true, "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("11", true, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fbli
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbli
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
