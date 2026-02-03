package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdaj {
    public static cdai a(Context context) {
        eieu eieuVarK = eiiy.k("PreferenceFileInitModule#providePreferenceFileInit");
        try {
            dbhq.a = context;
            cdai cdaiVar = new cdai();
            eieuVarK.close();
            return cdaiVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
