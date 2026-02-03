package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class prk implements InvocationHandler {
    private final fddy a;
    private final fdap b;

    public prk(fddy fddyVar, fdap fdapVar) {
        this.a = fddyVar;
        this.b = fdapVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (fdbq.f(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            fddy fddyVar = this.a;
            Object obj2 = objArr[0];
            if (!fddyVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(fddyVar.b())));
            }
            obj2.getClass();
            this.b.invoke(obj2);
            return fctx.a;
        }
        if (fdbq.f(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (fdbq.f(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (fdbq.f(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException(a.t(objArr, method, obj, "Unexpected method call object:", ", method: ", ", args: "));
    }
}
