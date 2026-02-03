package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblg implements fblf {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.e("8", true, "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("5", true, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fblf
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fblf
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
