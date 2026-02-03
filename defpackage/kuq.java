package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kuq implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public kuq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = kus.d;
            if (method != null) {
                method.invoke(this.a, this.b, false, "AppCompat recreation");
            } else {
                kus.e.invoke(this.a, this.b, false);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
