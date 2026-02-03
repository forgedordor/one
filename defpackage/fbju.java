package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbju implements fbjt {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbjr.a;
        a = eacj.c("45430882", 20000L, "profile_primitives_android", eadcVar);
        b = eacj.d("45422346", "", "profile_primitives_android", eadcVar);
    }

    @Override // defpackage.fbjt
    public final long a(Context context) {
        return ((Long) a.gX(context)).longValue();
    }

    @Override // defpackage.fbjt
    public final String b(Context context) {
        return (String) b.gX(context);
    }
}
