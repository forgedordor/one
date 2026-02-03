package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjx implements fbjw {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbjr.a;
        a = eacj.e("45662278", true, "profile_primitives_android", eadcVar);
        b = eacj.a("45667762", false, "profile_primitives_android", eadcVar);
        c = eacj.e("45679787", true, "profile_primitives_android", eadcVar);
    }

    @Override // defpackage.fbjw
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbjw
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbjw
    public final boolean c(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }
}
