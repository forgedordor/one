package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffde implements InvocationHandler {
    public boolean a;
    public String b;
    private final List c;

    public ffde(List list) {
        this.c = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (fdbq.f(name, "supports") && fdbq.f(Boolean.TYPE, returnType)) {
            return true;
        }
        if (fdbq.f(name, "unsupported") && fdbq.f(Void.TYPE, returnType)) {
            this.a = true;
            return null;
        }
        if (fdbq.f(name, "protocols") && objArr.length == 0) {
            return this.c;
        }
        if ((fdbq.f(name, "selectProtocol") || fdbq.f(name, "select")) && fdbq.f(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                obj2.getClass();
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        obj3.getClass();
                        String str = (String) obj3;
                        if (!this.c.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) this.c.get(0);
                this.b = str2;
                return str2;
            }
        }
        if ((!fdbq.f(name, "protocolSelected") && !fdbq.f(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        this.b = (String) obj4;
        return null;
    }
}
