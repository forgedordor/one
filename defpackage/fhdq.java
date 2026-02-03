package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fhdq {
    public static final fhdq a;
    public final Constructor b;

    static {
        a = "Dalvik".equals(System.getProperty("java.vm.name")) ? new fhdp() : new fhdq();
    }

    public fhdq() throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = iy$$ExternalSyntheticApiModelOutline1.m523m$1().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.b = declaredConstructor;
    }

    public Executor a() {
        return null;
    }
}
