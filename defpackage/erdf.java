package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdf {
    public static final Object a = new Object();
    public static final String b = "erdf";
    private final eqsp c;

    public erdf(erde erdeVar) {
        Context context = erdeVar.a;
        String str = erdeVar.b;
        String str2 = erdeVar.c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.c = erdeVar.f;
    }

    public final synchronized eqso a() {
        return this.c.a();
    }
}
