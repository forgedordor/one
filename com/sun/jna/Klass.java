package com.sun.jna;

import defpackage.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class Klass {
    private Klass() {
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            e = e;
            throw new IllegalArgumentException(a.p(cls, e, "Can't create an instance of ", ", requires a public no-arg constructor: "), e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new IllegalArgumentException(a.p(cls, e, "Can't create an instance of ", ", requires a public no-arg constructor: "), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new IllegalArgumentException(a.p(cls, e, "Can't create an instance of ", ", requires a public no-arg constructor: "), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new IllegalArgumentException(a.p(cls, e, "Can't create an instance of ", ", requires a public no-arg constructor: "), e);
        } catch (SecurityException e5) {
            e = e5;
            throw new IllegalArgumentException(a.p(cls, e, "Can't create an instance of ", ", requires a public no-arg constructor: "), e);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new IllegalArgumentException(a.p(cls, e6, "Can't create an instance of ", ", requires a public no-arg constructor: "), e6);
        }
    }
}
