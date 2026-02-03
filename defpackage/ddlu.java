package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlu {
    private static final ThreadLocal a = new ddlt();

    public static SharedPreferences a(Context context, String str) {
        ddlm ddlmVar = ddlk.a;
        ddls ddlsVar = str.equals("") ? new ddls() : null;
        if (ddlsVar != null) {
            return ddlsVar;
        }
        ThreadLocal threadLocal = a;
        ejwl.a(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            a.set(Boolean.TRUE);
            throw th;
        }
    }
}
