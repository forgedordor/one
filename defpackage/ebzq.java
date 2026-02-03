package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebzq implements ebzr {
    private final Object a;
    private final Method b;

    public ebzq(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    private static ebzv b(String str, Exception exc) {
        return new ecaj(str, new ebzp(exc));
    }

    @Override // defpackage.ebzr
    public final Object a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = this.b;
            Object objInvoke = method.invoke(this.a, null);
            return objInvoke == null ? b(method.getName(), new NullPointerException()) : objInvoke;
        } catch (Exception e) {
            return b(this.b.getName(), e);
        }
    }
}
