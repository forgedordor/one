package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwt {
    public final ClassLoader a;
    public final prm b;
    public final prg c;

    public pwt(ClassLoader classLoader, prm prmVar) {
        this.a = classLoader;
        this.b = prmVar;
        this.c = new prg(classLoader);
    }

    private final boolean f() {
        return pyz.a("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new fdae() { // from class: pwr
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                pwt pwtVar = this.a;
                Class clsA = pwtVar.b.a();
                boolean z = false;
                if (clsA != null) {
                    Class clsD = pwtVar.d();
                    Method method = clsD.getMethod("addWindowLayoutInfoListener", Activity.class, clsA);
                    Method method2 = clsD.getMethod("removeWindowLayoutInfoListener", clsA);
                    method.getClass();
                    if (pyz.f(method)) {
                        method2.getClass();
                        if (pyz.f(method2)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final WindowLayoutComponent a() {
        if (this.c.b() && pyz.a("WindowExtensions#getWindowLayoutComponent is not valid", new fdae() { // from class: pwm
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
                pwt pwtVar = this.a;
                Method method = pwtVar.c.a().getMethod("getWindowLayoutComponent", null);
                Class clsD = pwtVar.d();
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, clsD)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("FoldingFeature class is not valid", new fdae() { // from class: pwn
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                Class<?> clsLoadClass = this.a.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                method.getClass();
                int i = fdcj.a;
                boolean z = false;
                if (pyz.g(method, new fdbi(Rect.class)) && pyz.f(method)) {
                    method2.getClass();
                    if (pyz.g(method2, new fdbi(Integer.TYPE)) && pyz.f(method2)) {
                        method3.getClass();
                        if (pyz.g(method3, new fdbi(Integer.TYPE)) && pyz.f(method3)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        })) {
            int i = prn.a;
            int iA = prn.a();
            if (iA <= 0) {
                return null;
            }
            boolean zE = true;
            if (iA == 1) {
                zE = f();
            } else if (iA < 5) {
                zE = e();
            } else if (!e() || !pyz.a("DisplayFoldFeature is not valid", new fdae() { // from class: pwp
                /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
                @Override // defpackage.fdae
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
                    /*
                        r7 = this;
                        pwt r0 = r7.a
                        java.lang.Class r0 = r0.b()
                        java.lang.String r1 = "getType"
                        r2 = 0
                        java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                        r2 = 1
                        java.lang.Class[] r3 = new java.lang.Class[r2]
                        java.lang.Class r4 = java.lang.Integer.TYPE
                        r5 = 0
                        r3[r5] = r4
                        java.lang.String r4 = "hasProperty"
                        java.lang.reflect.Method r3 = r0.getMethod(r4, r3)
                        java.lang.Class[] r4 = new java.lang.Class[r2]
                        java.lang.Class<int[]> r6 = int[].class
                        r4[r5] = r6
                        java.lang.String r6 = "hasProperties"
                        java.lang.reflect.Method r0 = r0.getMethod(r6, r4)
                        r1.getClass()
                        boolean r4 = defpackage.pyz.f(r1)
                        if (r4 == 0) goto L5b
                        java.lang.Class r4 = java.lang.Integer.TYPE
                        boolean r1 = defpackage.pyz.c(r1, r4)
                        if (r1 == 0) goto L5b
                        r3.getClass()
                        boolean r1 = defpackage.pyz.f(r3)
                        if (r1 == 0) goto L5b
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        boolean r1 = defpackage.pyz.c(r3, r1)
                        if (r1 == 0) goto L5b
                        r0.getClass()
                        boolean r1 = defpackage.pyz.f(r0)
                        if (r1 == 0) goto L5b
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        boolean r0 = defpackage.pyz.c(r0, r1)
                        if (r0 == 0) goto L5b
                        goto L5c
                    L5b:
                        r2 = r5
                    L5c:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pwp.invoke():java.lang.Object");
                }
            }) || !pyz.a("SupportedWindowFeatures is not valid", new fdae() { // from class: pwo
                @Override // defpackage.fdae
                public final Object invoke() throws NoSuchMethodException, SecurityException {
                    pwt pwtVar = this.a;
                    Method method = pwtVar.c().getMethod("getDisplayFoldFeatures", null);
                    Type genericReturnType = method.getGenericReturnType();
                    genericReturnType.getClass();
                    boolean z = false;
                    Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                    type.getClass();
                    Class cls = (Class) type;
                    method.getClass();
                    if (pyz.f(method) && pyz.c(method, List.class) && fdbq.f(cls, pwtVar.b())) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }) || !pyz.a("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new fdae() { // from class: pwq
                @Override // defpackage.fdae
                public final Object invoke() throws NoSuchMethodException, SecurityException {
                    pwt pwtVar = this.a;
                    Method method = pwtVar.d().getMethod("getSupportedWindowFeatures", null);
                    method.getClass();
                    boolean z = false;
                    if (pyz.f(method) && pyz.c(method, pwtVar.c())) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) {
                zE = false;
            }
            if (zE) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return pyz.a(sb.toString(), new fdae() { // from class: pws
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
                Class clsD = this.a.d();
                boolean z = false;
                Method method = clsD.getMethod("addWindowLayoutInfoListener", Context.class, prn$$ExternalSyntheticApiModelOutline0.m$4());
                Method method2 = clsD.getMethod("removeWindowLayoutInfoListener", prn$$ExternalSyntheticApiModelOutline0.m$4());
                method.getClass();
                if (pyz.f(method)) {
                    method2.getClass();
                    if (pyz.f(method2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
