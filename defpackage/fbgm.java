package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgm implements fbgl {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbgg.a;
        a = eacj.e("45401462", true, "com.google.android.libraries.onegoogle", eadcVar);
        b = eacj.e("45414966", true, "com.google.android.libraries.onegoogle", eadcVar);
    }

    @Override // defpackage.fbgl
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbgl
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
