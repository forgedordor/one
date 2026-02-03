package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfy implements fbfx {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;

    static {
        eadc eadcVar = fbfv.a;
        a = eacj.e("3", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
        b = eacj.d("1", "mobileconfiguration-pa.googleapis.com", "com.google.android.libraries.mobileconfiguration", eadcVar);
        c = eacj.e("45669836", false, "com.google.android.libraries.mobileconfiguration", eadcVar);
        d = eacj.d("4", "oauth2:https://www.googleapis.com/auth/mobileconfiguration", "com.google.android.libraries.mobileconfiguration", eadcVar);
        e = eacj.d("2", "AIzaSyAjKazdIYitdprpqlEAYHkgTae00yoo8rQ", "com.google.android.libraries.mobileconfiguration", eadcVar);
    }

    @Override // defpackage.fbfx
    public final String a(Context context) {
        return (String) b.gX(context);
    }

    @Override // defpackage.fbfx
    public final String b(Context context) {
        return (String) d.gX(context);
    }

    @Override // defpackage.fbfx
    public final String c(Context context) {
        return (String) e.gX(context);
    }

    @Override // defpackage.fbfx
    public final boolean d(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }

    @Override // defpackage.fbfx
    public final boolean e(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }
}
