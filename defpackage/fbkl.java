package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbkl implements fbkk {
    public static final eaci a;
    public static final eaci b;

    static {
        eadc eadcVar = fbjz.a;
        a = eacj.e("45367388", true, "com.google.android.libraries.surveys", eadcVar);
        b = eacj.e("45373269", true, "com.google.android.libraries.surveys", eadcVar);
    }

    @Override // defpackage.fbkk
    public final boolean a(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbkk
    public final boolean b(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }
}
