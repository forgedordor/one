package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblv implements fblu {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.d("20", "com.google.android.surveys.testapp,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx", "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("18", false, "com.google.android.libraries.surveys", eadcVar);
        c = eacj.e("22", true, "com.google.android.libraries.surveys", eadcVar);
        d = eacj.e("21", false, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fblu
    public final String a(Context context) {
        return (String) a.gX(context);
    }

    @Override // defpackage.fblu
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fblu
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fblu
    public final boolean d(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }
}
