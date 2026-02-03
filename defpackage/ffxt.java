package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxt {
    public static SharedPreferences a;

    static {
        ffyj ffyjVarB = ffyj.b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ffxu.a);
            ffyjVarB.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                ffyjVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
