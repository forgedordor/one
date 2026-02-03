package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eorq {
    public static final /* synthetic */ int a = 0;
    private static final eknw b;
    private static final eknw c;

    static {
        ekoq ekoqVar = new ekoq(new ekds(new ekcc(new ejvr() { // from class: eorl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = eorq.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }, ekno.a), new ekcc(new ejvr() { // from class: eorm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = eorq.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        }, ekno.a)));
        b = ekoqVar;
        c = new ekcc(new ejvr() { // from class: eorn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = eorq.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        }, ekoqVar);
    }

    public static Exception a(Class cls, Throwable th) {
        Iterator it = c.e(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) b((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException(a.b(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
    }

    private static Object b(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
