package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diai {
    public static void a(RuntimeException runtimeException, diap diapVar, String str) {
        dbjq dbjqVar = diapVar.a;
        if (dbjqVar != dbjq.STARTUP && dbjqVar != dbjq.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", a.v(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }
}
