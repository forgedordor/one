package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prg {
    public final ClassLoader a;

    public prg(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Class a() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean b() {
        return pyz.b(new fdae() { // from class: pre
            @Override // defpackage.fdae
            public final Object invoke() throws ClassNotFoundException {
                Class<?> clsLoadClass = this.a.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                return clsLoadClass;
            }
        }) && pyz.a("WindowExtensionsProvider#getWindowExtensions is not valid", new fdae() { // from class: prf
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                prg prgVar = this.a;
                Class<?> clsLoadClass = prgVar.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class clsA = prgVar.a();
                declaredMethod.getClass();
                boolean z = false;
                if (pyz.c(declaredMethod, clsA) && pyz.f(declaredMethod)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
