package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgb implements fbga {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbfv.a;
        a = eacj.c("11", 2592000L, "com.google.android.libraries.mobileconfiguration", eadcVar);
        b = eacj.e("45681954", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
    }

    @Override // defpackage.fbga
    public final long a(Context context) {
        return ((Long) a.gX(context)).longValue();
    }

    @Override // defpackage.fbga
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
