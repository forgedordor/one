package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fcsx {
    public static final void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (fczi.a()) {
                th.addSuppressed(th2);
                return;
            }
            Method method = fcze.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
