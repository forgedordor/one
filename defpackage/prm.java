package defpackage;

import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prm {
    private final ClassLoader a;

    public prm(ClassLoader classLoader) {
        classLoader.getClass();
        this.a = classLoader;
    }

    public final Class a() {
        try {
            return b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Object c(fddy fddyVar, fdap fdapVar) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{b()}, new prk(fddyVar, fdapVar));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }
}
