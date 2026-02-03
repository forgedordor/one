package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvz {
    public final prm a;
    public final prg b;
    private final ClassLoader c;
    private final WindowExtensions d;

    public pvz(ClassLoader classLoader, prm prmVar, WindowExtensions windowExtensions) {
        this.c = classLoader;
        this.a = prmVar;
        this.d = windowExtensions;
        this.b = new prg(classLoader);
    }

    public final ActivityEmbeddingComponent a() {
        if (this.b.b() && pyz.a("WindowExtensions#getActivityEmbeddingComponent is not valid", new fdae() { // from class: pvt
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
                pvz pvzVar = this.a;
                Method method = pvzVar.b.a().getMethod("getActivityEmbeddingComponent", null);
                Class clsB = pvzVar.b();
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, clsB)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        })) {
            int i = new prh().a;
            boolean zH = true;
            if (i == 1) {
                zH = c();
            } else if (i == 2) {
                zH = d();
            } else if (i >= 3 && i < 5) {
                zH = e();
            } else if (i == 5) {
                zH = f();
            } else if (i == 6) {
                zH = g();
            } else if (i == 7) {
                zH = h();
            } else if (i < 8 || !h() || !pyz.a("Class EmbeddingConfiguration.Builder is not valid", new fdae() { // from class: pub
                @Override // defpackage.fdae
                public final Object invoke() throws NoSuchMethodException, SecurityException {
                    Method method = pth.class.getMethod("a", Boolean.TYPE);
                    method.getClass();
                    return Boolean.valueOf(pyz.f(method) && pyz.c(method, pth.class));
                }
            })) {
                zH = false;
            }
            if (zH) {
                try {
                    return this.d.getActivityEmbeddingComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.c.loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean c() {
        return pyz.a("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new fdae() { // from class: pvp
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("setEmbeddingRules", Set.class);
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new fdae() { // from class: pvd
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("isActivityEmbedded", Activity.class);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, Boolean.TYPE));
            }
        }) && pyz.a("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new fdae() { // from class: pvf
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                pvz pvzVar = this.a;
                Class clsA = pvzVar.a.a();
                boolean zF = false;
                if (clsA != null) {
                    Method method = pvzVar.b().getMethod("setSplitInfoCallback", clsA);
                    method.getClass();
                    zF = pyz.f(method);
                }
                return Boolean.valueOf(zF);
            }
        }) && pyz.a("SplitRule#getSplitRatio is not valid", new fdae() { // from class: pvc
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$27().getMethod("getSplitRatio", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Float.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("SplitRule#getLayoutDirection is not valid", new fdae() { // from class: pvn
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$27().getMethod("getLayoutDirection", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Integer.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class ActivityRule is not valid", new fdae() { // from class: pue
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$8().getMethod("shouldAlwaysExpand", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Boolean.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class ActivityRule.Builder is not valid", new fdae() { // from class: put
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$18().getMethod("setShouldAlwaysExpand", Boolean.TYPE);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$18()));
            }
        }) && pyz.a("Class SplitInfo is not valid", new fdae() { // from class: puk
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$6 = prn$$ExternalSyntheticApiModelOutline0.m$6();
                Method method = clsM$6.getMethod("getPrimaryActivityStack", null);
                Method method2 = clsM$6.getMethod("getSecondaryActivityStack", null);
                Method method3 = clsM$6.getMethod("getSplitRatio", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$13())) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, prn$$ExternalSyntheticApiModelOutline0.m$13())) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, Float.TYPE)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitPairRule is not valid", new fdae() { // from class: pvv
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$30 = prn$$ExternalSyntheticApiModelOutline0.m$30();
                Method method = clsM$30.getMethod("getFinishPrimaryWithSecondary", null);
                Method method2 = clsM$30.getMethod("getFinishSecondaryWithPrimary", null);
                Method method3 = clsM$30.getMethod("shouldClearTop", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Integer.TYPE)) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Integer.TYPE)) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, Boolean.TYPE)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitPairRule.Builder is not valid", new fdae() { // from class: ptx
            /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r6 = this;
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Float.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$2()
                    java.lang.String r4 = "setSplitRatio"
                    java.lang.reflect.Method r1 = r2.getMethod(r4, r1)
                    java.lang.Class[] r4 = new java.lang.Class[r0]
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r4[r3] = r5
                    java.lang.String r5 = "setLayoutDirection"
                    java.lang.reflect.Method r2 = r2.getMethod(r5, r4)
                    r1.getClass()
                    boolean r4 = defpackage.pyz.f(r1)
                    if (r4 == 0) goto L45
                    java.lang.Class r4 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$2()
                    boolean r1 = defpackage.pyz.c(r1, r4)
                    if (r1 == 0) goto L45
                    r2.getClass()
                    boolean r1 = defpackage.pyz.f(r2)
                    if (r1 == 0) goto L45
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$2()
                    boolean r1 = defpackage.pyz.c(r2, r1)
                    if (r1 == 0) goto L45
                    goto L46
                L45:
                    r0 = r3
                L46:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ptx.invoke():java.lang.Object");
            }
        }) && pyz.a("Class SplitPlaceholderRule is not valid", new fdae() { // from class: pvh
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$9 = prn$$ExternalSyntheticApiModelOutline0.m$9();
                Method method = clsM$9.getMethod("getPlaceholderIntent", null);
                Method method2 = clsM$9.getMethod("isSticky", null);
                Method method3 = clsM$9.getMethod("getFinishPrimaryWithSecondary", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Intent.class)) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Boolean.TYPE)) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, Integer.TYPE)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitPlaceholderRule.Builder is not valid", new fdae() { // from class: puh
            /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r8 = this;
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Float.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$10()
                    java.lang.String r4 = "setSplitRatio"
                    java.lang.reflect.Method r1 = r2.getMethod(r4, r1)
                    java.lang.Class[] r4 = new java.lang.Class[r0]
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r4[r3] = r5
                    java.lang.String r5 = "setLayoutDirection"
                    java.lang.reflect.Method r4 = r2.getMethod(r5, r4)
                    java.lang.Class[] r5 = new java.lang.Class[r0]
                    java.lang.Class r6 = java.lang.Boolean.TYPE
                    r5[r3] = r6
                    java.lang.String r6 = "setSticky"
                    java.lang.reflect.Method r5 = r2.getMethod(r6, r5)
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r6[r3] = r7
                    java.lang.String r7 = "setFinishPrimaryWithSecondary"
                    java.lang.reflect.Method r2 = r2.getMethod(r7, r6)
                    r1.getClass()
                    boolean r6 = defpackage.pyz.f(r1)
                    if (r6 == 0) goto L83
                    java.lang.Class r6 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$10()
                    boolean r1 = defpackage.pyz.c(r1, r6)
                    if (r1 == 0) goto L83
                    r4.getClass()
                    boolean r1 = defpackage.pyz.f(r4)
                    if (r1 == 0) goto L83
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$10()
                    boolean r1 = defpackage.pyz.c(r4, r1)
                    if (r1 == 0) goto L83
                    r5.getClass()
                    boolean r1 = defpackage.pyz.f(r5)
                    if (r1 == 0) goto L83
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$10()
                    boolean r1 = defpackage.pyz.c(r5, r1)
                    if (r1 == 0) goto L83
                    r2.getClass()
                    boolean r1 = defpackage.pyz.f(r2)
                    if (r1 == 0) goto L83
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$10()
                    boolean r1 = defpackage.pyz.c(r2, r1)
                    if (r1 == 0) goto L83
                    goto L84
                L83:
                    r0 = r3
                L84:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.puh.invoke():java.lang.Object");
            }
        });
    }

    public final boolean d() {
        return c() && pyz.a("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new fdae() { // from class: pvg
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("setSplitInfoCallback", prn$$ExternalSyntheticApiModelOutline0.m$4());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new fdae() { // from class: puo
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("clearSplitInfoCallback", null);
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new fdae() { // from class: pvr
            /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r6 = this;
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$29()
                    pvz r1 = r6.a
                    java.lang.Class r2 = r1.b()
                    r3 = 1
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    r5 = 0
                    r4[r5] = r0
                    java.lang.String r0 = "setSplitAttributesCalculator"
                    java.lang.reflect.Method r0 = r2.getMethod(r0, r4)
                    java.lang.Class r1 = r1.b()
                    java.lang.String r2 = "clearSplitAttributesCalculator"
                    r4 = 0
                    java.lang.reflect.Method r1 = r1.getMethod(r2, r4)
                    r0.getClass()
                    boolean r0 = defpackage.pyz.f(r0)
                    if (r0 == 0) goto L34
                    r1.getClass()
                    boolean r0 = defpackage.pyz.f(r1)
                    if (r0 == 0) goto L34
                    goto L35
                L34:
                    r3 = r5
                L35:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pvr.invoke():java.lang.Object");
            }
        }) && pyz.a("SplitInfo#getSplitAttributes is not valid", new fdae() { // from class: pvw
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$6().getMethod("getSplitAttributes", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$3())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", new fdae() { // from class: pug
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$9().getMethod("getFinishPrimaryWithPlaceholder", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Integer.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("SplitRule#getDefaultSplitAttributes is not valid", new fdae() { // from class: pve
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$27().getMethod("getDefaultSplitAttributes", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$3())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class ActivityRule.Builder is not valid", new fdae() { // from class: pux
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                boolean z = false;
                Class<?>[] clsArr = {prn$$ExternalSyntheticApiModelOutline0.m$1(), prn$$ExternalSyntheticApiModelOutline0.m$1()};
                Class clsM$18 = prn$$ExternalSyntheticApiModelOutline0.m$18();
                Constructor declaredConstructor = clsM$18.getDeclaredConstructor(clsArr);
                Method method = clsM$18.getMethod("setTag", String.class);
                declaredConstructor.getClass();
                if (pyz.d(declaredConstructor)) {
                    method.getClass();
                    if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$18())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class EmbeddingRule is not valid", new fdae() { // from class: pud
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = ptk.class.getMethod("a", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, String.class)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitAttributes is not valid", new fdae() { // from class: pva
            /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r8 = this;
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$3()
                    java.lang.String r1 = "getLayoutDirection"
                    r2 = 0
                    java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                    java.lang.String r3 = "getSplitType"
                    java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$23()
                    r3 = 1
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    r5 = 0
                    r4[r5] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$17()
                    java.lang.String r6 = "setSplitType"
                    java.lang.reflect.Method r4 = r2.getMethod(r6, r4)
                    java.lang.Class[] r6 = new java.lang.Class[r3]
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r6[r5] = r7
                    java.lang.String r7 = "setLayoutDirection"
                    java.lang.reflect.Method r2 = r2.getMethod(r7, r6)
                    r1.getClass()
                    boolean r6 = defpackage.pyz.f(r1)
                    if (r6 == 0) goto L68
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    boolean r1 = defpackage.pyz.c(r1, r6)
                    if (r1 == 0) goto L68
                    r0.getClass()
                    boolean r1 = defpackage.pyz.f(r0)
                    if (r1 == 0) goto L68
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$23()
                    boolean r0 = defpackage.pyz.c(r0, r1)
                    if (r0 == 0) goto L68
                    r4.getClass()
                    boolean r0 = defpackage.pyz.f(r4)
                    if (r0 == 0) goto L68
                    r2.getClass()
                    boolean r0 = defpackage.pyz.f(r2)
                    if (r0 == 0) goto L68
                    goto L69
                L68:
                    r3 = r5
                L69:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pva.invoke():java.lang.Object");
            }
        }) && pyz.a("Class SplitAttributesCalculatorParams is not valid", new fdae() { // from class: pum
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$15 = prn$$ExternalSyntheticApiModelOutline0.m$15();
                Method method = clsM$15.getMethod("getParentWindowMetrics", null);
                Method method2 = clsM$15.getMethod("getParentConfiguration", null);
                Method method3 = clsM$15.getMethod("getDefaultSplitAttributes", null);
                Method method4 = clsM$15.getMethod("areDefaultConstraintsSatisfied", null);
                Method method5 = clsM$15.getMethod("getParentWindowLayoutInfo", null);
                Method method6 = clsM$15.getMethod("getSplitRuleTag", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, jzi$$ExternalSyntheticApiModelOutline5.m567m())) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Configuration.class)) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, prn$$ExternalSyntheticApiModelOutline0.m$3())) {
                            method4.getClass();
                            if (pyz.f(method4) && pyz.c(method4, Boolean.TYPE)) {
                                method5.getClass();
                                if (pyz.f(method5) && pyz.c(method5, WindowLayoutInfo.class)) {
                                    method6.getClass();
                                    if (pyz.f(method6) && pyz.c(method6, String.class)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitAttributes.SplitType is not valid", new fdae() { // from class: pvb
            /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r9 = this;
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Float.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$24()
                    java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)
                    java.lang.String r4 = "getRatio"
                    r5 = 0
                    java.lang.reflect.Method r4 = r2.getMethod(r4, r5)
                    java.lang.String r6 = "splitEqually"
                    java.lang.reflect.Method r2 = r2.getMethod(r6, r5)
                    java.lang.Class r6 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$23()
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    r7[r3] = r6
                    java.lang.Class r6 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$25()
                    java.lang.reflect.Constructor r7 = r6.getDeclaredConstructor(r7)
                    java.lang.String r8 = "getFallbackSplitType"
                    java.lang.reflect.Method r6 = r6.getMethod(r8, r5)
                    java.lang.Class r8 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$26()
                    java.lang.reflect.Constructor r5 = r8.getDeclaredConstructor(r5)
                    r1.getClass()
                    boolean r1 = defpackage.pyz.d(r1)
                    if (r1 == 0) goto L8e
                    r4.getClass()
                    boolean r1 = defpackage.pyz.f(r4)
                    if (r1 == 0) goto L8e
                    java.lang.Class r1 = java.lang.Float.TYPE
                    boolean r1 = defpackage.pyz.c(r4, r1)
                    if (r1 == 0) goto L8e
                    r7.getClass()
                    boolean r1 = defpackage.pyz.d(r7)
                    if (r1 == 0) goto L8e
                    r2.getClass()
                    boolean r1 = defpackage.pyz.f(r2)
                    if (r1 == 0) goto L8e
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$24()
                    boolean r1 = defpackage.pyz.c(r2, r1)
                    if (r1 == 0) goto L8e
                    r6.getClass()
                    boolean r1 = defpackage.pyz.f(r6)
                    if (r1 == 0) goto L8e
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$23()
                    boolean r1 = defpackage.pyz.c(r6, r1)
                    if (r1 == 0) goto L8e
                    r5.getClass()
                    boolean r1 = defpackage.pyz.d(r5)
                    if (r1 == 0) goto L8e
                    goto L8f
                L8e:
                    r0 = r3
                L8f:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pvb.invoke():java.lang.Object");
            }
        }) && pyz.a("Class SplitPairRule.Builder is not valid", new fdae() { // from class: ptw
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                boolean z = false;
                Class<?>[] clsArr = {prn$$ExternalSyntheticApiModelOutline0.m$1(), prn$$ExternalSyntheticApiModelOutline0.m$1(), prn$$ExternalSyntheticApiModelOutline0.m$1()};
                Class clsM$2 = prn$$ExternalSyntheticApiModelOutline0.m$2();
                Constructor declaredConstructor = clsM$2.getDeclaredConstructor(clsArr);
                Method method = clsM$2.getMethod("setDefaultSplitAttributes", prn$$ExternalSyntheticApiModelOutline0.m$3());
                Method method2 = clsM$2.getMethod("setTag", String.class);
                declaredConstructor.getClass();
                if (pyz.d(declaredConstructor)) {
                    method.getClass();
                    if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$2())) {
                        method2.getClass();
                        if (pyz.f(method2) && pyz.c(method2, prn$$ExternalSyntheticApiModelOutline0.m$2())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class SplitPlaceholderRule.Builder is not valid", new fdae() { // from class: pvl
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                boolean z = false;
                Class<?>[] clsArr = {Intent.class, prn$$ExternalSyntheticApiModelOutline0.m$1(), prn$$ExternalSyntheticApiModelOutline0.m$1(), prn$$ExternalSyntheticApiModelOutline0.m$1()};
                Class clsM$10 = prn$$ExternalSyntheticApiModelOutline0.m$10();
                Constructor declaredConstructor = clsM$10.getDeclaredConstructor(clsArr);
                Method method = clsM$10.getMethod("setDefaultSplitAttributes", prn$$ExternalSyntheticApiModelOutline0.m$3());
                Method method2 = clsM$10.getMethod("setFinishPrimaryWithPlaceholder", Integer.TYPE);
                Method method3 = clsM$10.getMethod("setTag", String.class);
                declaredConstructor.getClass();
                if (pyz.d(declaredConstructor)) {
                    method.getClass();
                    if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$10())) {
                        method2.getClass();
                        if (pyz.f(method2) && pyz.c(method2, prn$$ExternalSyntheticApiModelOutline0.m$10())) {
                            method3.getClass();
                            if (pyz.f(method3) && pyz.c(method3, prn$$ExternalSyntheticApiModelOutline0.m$10())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean e() {
        return d() && pyz.a("#invalidateTopVisibleSplitAttributes is not valid", new fdae() { // from class: pus
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("invalidateTopVisibleSplitAttributes", null);
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("#updateSplitAttributes is not valid", new fdae() { // from class: pun
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("updateSplitAttributes", IBinder.class, prn$$ExternalSyntheticApiModelOutline0.m$3());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("SplitInfo#getToken is not valid", new fdae() { // from class: puf
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$6().getMethod("getToken", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, IBinder.class)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean f() {
        return e() && pyz.a("ActivityStack#getActivityToken is not valid", new fdae() { // from class: pvi
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$13().getMethod("getActivityStackToken", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$28())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("registerActivityStackCallback is not valid", new fdae() { // from class: pvq
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("registerActivityStackCallback", Executor.class, prn$$ExternalSyntheticApiModelOutline0.m$4());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("unregisterActivityStackCallback is not valid", new fdae() { // from class: pvx
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("unregisterActivityStackCallback", prn$$ExternalSyntheticApiModelOutline0.m$4());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("#pin(unPin)TopActivityStack is not valid", new fdae() { // from class: ptz
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$5().getMethod("isSticky", null);
                pvz pvzVar = this.a;
                boolean z = false;
                Method method2 = pvzVar.b().getMethod("pinTopActivityStack", Integer.TYPE, prn$$ExternalSyntheticApiModelOutline0.m$5());
                Method method3 = pvzVar.b().getMethod("unpinTopActivityStack", Integer.TYPE);
                method.getClass();
                if (pyz.f(method) && pyz.c(method, Boolean.TYPE)) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Boolean.TYPE)) {
                        method3.getClass();
                        if (pyz.f(method3)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("updateSplitAttributes is not valid", new fdae() { // from class: pvs
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("updateSplitAttributes", prn$$ExternalSyntheticApiModelOutline0.m$7(), prn$$ExternalSyntheticApiModelOutline0.m$3());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("SplitInfo#getSplitInfoToken is not valid", new fdae() { // from class: pua
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$6().getMethod("getSplitInfoToken", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$7())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class AnimationBackground is not valid", new fdae() { // from class: puy
            /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r11 = this;
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$20()
                    java.lang.String r4 = "createColorBackground"
                    java.lang.reflect.Method r1 = r2.getMethod(r4, r1)
                    java.lang.String r4 = "ANIMATION_BACKGROUND_DEFAULT"
                    java.lang.reflect.Field r4 = r2.getDeclaredField(r4)
                    java.lang.Class r5 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$22()
                    java.lang.String r6 = "getColor"
                    r7 = 0
                    java.lang.reflect.Method r6 = r5.getMethod(r6, r7)
                    java.lang.Class r8 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$3()
                    java.lang.String r9 = "getAnimationBackground"
                    java.lang.reflect.Method r7 = r8.getMethod(r9, r7)
                    java.lang.Class r8 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$20()
                    java.lang.Class[] r9 = new java.lang.Class[r0]
                    r9[r3] = r8
                    java.lang.Class r8 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$17()
                    java.lang.String r10 = "setAnimationBackground"
                    java.lang.reflect.Method r8 = r8.getMethod(r10, r9)
                    r1.getClass()
                    boolean r9 = defpackage.pyz.f(r1)
                    if (r9 == 0) goto L8b
                    boolean r1 = defpackage.pyz.c(r1, r5)
                    if (r1 == 0) goto L8b
                    r4.getClass()
                    boolean r1 = defpackage.pyz.e(r4)
                    if (r1 == 0) goto L8b
                    r6.getClass()
                    boolean r1 = defpackage.pyz.f(r6)
                    if (r1 == 0) goto L8b
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    boolean r1 = defpackage.pyz.c(r6, r1)
                    if (r1 == 0) goto L8b
                    r7.getClass()
                    boolean r1 = defpackage.pyz.f(r7)
                    if (r1 == 0) goto L8b
                    boolean r1 = defpackage.pyz.c(r7, r2)
                    if (r1 == 0) goto L8b
                    r8.getClass()
                    boolean r1 = defpackage.pyz.f(r8)
                    if (r1 == 0) goto L8b
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$17()
                    boolean r1 = defpackage.pyz.c(r8, r1)
                    if (r1 == 0) goto L8b
                    goto L8c
                L8b:
                    r0 = r3
                L8c:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.invoke():java.lang.Object");
            }
        }) && pyz.a("Class ActivityStack.Token is not valid", new fdae() { // from class: pvy
            /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r8 = this;
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$28()
                    java.lang.String r1 = "toBundle"
                    r2 = 0
                    java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                    r2 = 1
                    java.lang.Class[] r3 = new java.lang.Class[r2]
                    java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                    r5 = 0
                    r3[r5] = r4
                    java.lang.String r4 = "readFromBundle"
                    java.lang.reflect.Method r3 = r0.getMethod(r4, r3)
                    java.lang.Class[] r4 = new java.lang.Class[r2]
                    java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
                    r4[r5] = r6
                    java.lang.String r6 = "createFromBinder"
                    java.lang.reflect.Method r4 = r0.getMethod(r6, r4)
                    java.lang.String r6 = "INVALID_ACTIVITY_STACK_TOKEN"
                    java.lang.reflect.Field r6 = r0.getDeclaredField(r6)
                    r1.getClass()
                    boolean r7 = defpackage.pyz.f(r1)
                    if (r7 == 0) goto L64
                    java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
                    boolean r1 = defpackage.pyz.c(r1, r7)
                    if (r1 == 0) goto L64
                    r3.getClass()
                    boolean r1 = defpackage.pyz.f(r3)
                    if (r1 == 0) goto L64
                    boolean r1 = defpackage.pyz.c(r3, r0)
                    if (r1 == 0) goto L64
                    r4.getClass()
                    boolean r1 = defpackage.pyz.f(r4)
                    if (r1 == 0) goto L64
                    boolean r0 = defpackage.pyz.c(r4, r0)
                    if (r0 == 0) goto L64
                    r6.getClass()
                    boolean r0 = defpackage.pyz.e(r6)
                    if (r0 == 0) goto L64
                    goto L65
                L64:
                    r2 = r5
                L65:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pvy.invoke():java.lang.Object");
            }
        }) && pyz.a("Class WindowAttributes is not valid", new fdae() { // from class: pup
            /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r8 = this;
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$16()
                    java.lang.String r1 = "getDimAreaBehavior"
                    r2 = 0
                    java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                    java.lang.Class r3 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$3()
                    java.lang.String r4 = "getWindowAttributes"
                    java.lang.reflect.Method r2 = r3.getMethod(r4, r2)
                    java.lang.Class r3 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$16()
                    r4 = 1
                    java.lang.Class[] r5 = new java.lang.Class[r4]
                    r6 = 0
                    r5[r6] = r3
                    java.lang.Class r3 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$17()
                    java.lang.String r7 = "setWindowAttributes"
                    java.lang.reflect.Method r3 = r3.getMethod(r7, r5)
                    r1.getClass()
                    boolean r5 = defpackage.pyz.f(r1)
                    if (r5 == 0) goto L5d
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    boolean r1 = defpackage.pyz.c(r1, r5)
                    if (r1 == 0) goto L5d
                    r2.getClass()
                    boolean r1 = defpackage.pyz.f(r2)
                    if (r1 == 0) goto L5d
                    boolean r0 = defpackage.pyz.c(r2, r0)
                    if (r0 == 0) goto L5d
                    r3.getClass()
                    boolean r0 = defpackage.pyz.f(r3)
                    if (r0 == 0) goto L5d
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$17()
                    boolean r0 = defpackage.pyz.c(r3, r0)
                    if (r0 == 0) goto L5d
                    goto L5e
                L5d:
                    r4 = r6
                L5e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pup.invoke():java.lang.Object");
            }
        }) && pyz.a("SplitInfo.Token is not valid", new fdae() { // from class: puq
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$7 = prn$$ExternalSyntheticApiModelOutline0.m$7();
                Method method = clsM$7.getMethod("createFromBinder", IBinder.class);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, clsM$7));
            }
        }) && pyz.a("Class EmbeddingConfiguration.Builder is not valid", new fdae() { // from class: pur
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = pth.class.getMethod("b", pti.class);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, pth.class));
            }
        });
    }

    public final boolean g() {
        return f() && pyz.a("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new fdae() { // from class: pul
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("getEmbeddedActivityWindowInfo", Activity.class);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$14()));
            }
        }) && pyz.a("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new fdae() { // from class: pty
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("setEmbeddedActivityWindowInfoCallback", Executor.class, prn$$ExternalSyntheticApiModelOutline0.m$4());
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new fdae() { // from class: puc
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = this.a.b().getMethod("clearEmbeddedActivityWindowInfoCallback", null);
                method.getClass();
                return Boolean.valueOf(pyz.f(method));
            }
        }) && pyz.a("SplitAttributes#getDividerAttributes is not valid", new fdae() { // from class: pvm
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$3().getMethod("getDividerAttributes", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$19())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("SplitAttributes#setDividerAttributes is not valid", new fdae() { // from class: puv
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$17().getMethod("setDividerAttributes", prn$$ExternalSyntheticApiModelOutline0.m$19());
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$17()));
            }
        }) && pyz.a("Class EmbeddedActivityWindowInfo is not valid", new fdae() { // from class: pvk
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$14 = prn$$ExternalSyntheticApiModelOutline0.m$14();
                Method method = clsM$14.getMethod("getActivity", null);
                Method method2 = clsM$14.getMethod("isEmbedded", null);
                Method method3 = clsM$14.getMethod("getTaskBounds", null);
                Method method4 = clsM$14.getMethod("getActivityStackBounds", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Activity.class)) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Boolean.TYPE)) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, Rect.class)) {
                            method4.getClass();
                            if (pyz.f(method4) && pyz.c(method4, Rect.class)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class DividerAttributes is not valid", new fdae() { // from class: pvo
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Class clsM$19 = prn$$ExternalSyntheticApiModelOutline0.m$19();
                Method method = clsM$19.getMethod("getDividerType", null);
                Method method2 = clsM$19.getMethod("getWidthDp", null);
                Method method3 = clsM$19.getMethod("getPrimaryMinRatio", null);
                Method method4 = clsM$19.getMethod("getPrimaryMaxRatio", null);
                Method method5 = clsM$19.getMethod("getDividerColor", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Integer.TYPE)) {
                    method2.getClass();
                    if (pyz.f(method2) && pyz.c(method2, Integer.TYPE)) {
                        method3.getClass();
                        if (pyz.f(method3) && pyz.c(method3, Float.TYPE)) {
                            method4.getClass();
                            if (pyz.f(method4) && pyz.c(method4, Float.TYPE)) {
                                method5.getClass();
                                if (pyz.f(method5) && pyz.c(method5, Integer.TYPE)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class DividerAttributes.Builder is not valid", new fdae() { // from class: puu
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r10 = this;
                    r0 = 1
                    java.lang.Class[] r1 = new java.lang.Class[r0]
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$12()
                    java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)
                    java.lang.Class r4 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$19()
                    java.lang.Class[] r5 = new java.lang.Class[r0]
                    r5[r3] = r4
                    java.lang.reflect.Constructor r4 = r2.getDeclaredConstructor(r5)
                    java.lang.Class[] r5 = new java.lang.Class[r0]
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    r5[r3] = r6
                    java.lang.String r6 = "setWidthDp"
                    java.lang.reflect.Method r5 = r2.getMethod(r6, r5)
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Float.TYPE
                    r6[r3] = r7
                    java.lang.String r7 = "setPrimaryMinRatio"
                    java.lang.reflect.Method r6 = r2.getMethod(r7, r6)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Float.TYPE
                    r7[r3] = r8
                    java.lang.String r8 = "setPrimaryMaxRatio"
                    java.lang.reflect.Method r7 = r2.getMethod(r8, r7)
                    java.lang.Class[] r8 = new java.lang.Class[r0]
                    java.lang.Class r9 = java.lang.Integer.TYPE
                    r8[r3] = r9
                    java.lang.String r9 = "setDividerColor"
                    java.lang.reflect.Method r2 = r2.getMethod(r9, r8)
                    r1.getClass()
                    boolean r1 = defpackage.pyz.d(r1)
                    if (r1 == 0) goto Lab
                    r4.getClass()
                    boolean r1 = defpackage.pyz.d(r4)
                    if (r1 == 0) goto Lab
                    r5.getClass()
                    boolean r1 = defpackage.pyz.f(r5)
                    if (r1 == 0) goto Lab
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$12()
                    boolean r1 = defpackage.pyz.c(r5, r1)
                    if (r1 == 0) goto Lab
                    r6.getClass()
                    boolean r1 = defpackage.pyz.f(r6)
                    if (r1 == 0) goto Lab
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$12()
                    boolean r1 = defpackage.pyz.c(r6, r1)
                    if (r1 == 0) goto Lab
                    r7.getClass()
                    boolean r1 = defpackage.pyz.f(r7)
                    if (r1 == 0) goto Lab
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$12()
                    boolean r1 = defpackage.pyz.c(r7, r1)
                    if (r1 == 0) goto Lab
                    r2.getClass()
                    boolean r1 = defpackage.pyz.f(r2)
                    if (r1 == 0) goto Lab
                    java.lang.Class r1 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$12()
                    boolean r1 = defpackage.pyz.c(r2, r1)
                    if (r1 == 0) goto Lab
                    goto Lac
                Lab:
                    r0 = r3
                Lac:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.puu.invoke():java.lang.Object");
            }
        });
    }

    public final boolean h() {
        return g() && pyz.a("SplitAttributes#getAnimationParams is not valid", new fdae() { // from class: pui
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$3().getMethod("getAnimationParams", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$11())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("SplitAttributes#setAnimationParams is not valid", new fdae() { // from class: pvu
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$17().getMethod("setAnimationParams", prn$$ExternalSyntheticApiModelOutline0.m$11());
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$17()));
            }
        }) && pyz.a("DividerAttributes#isDraggingToFullscreenAllowed is not valid", new fdae() { // from class: pvj
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$19().getMethod("isDraggingToFullscreenAllowed", null);
                method.getClass();
                boolean z = false;
                if (pyz.f(method) && pyz.c(method, Boolean.TYPE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", new fdae() { // from class: puj
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Method method = prn$$ExternalSyntheticApiModelOutline0.m$12().getMethod("setDraggingToFullscreenAllowed", Boolean.TYPE);
                method.getClass();
                return Boolean.valueOf(pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$12()));
            }
        }) && pyz.a("Class AnimationParams is not valid", new fdae() { // from class: puz
            @Override // defpackage.fdae
            public final Object invoke() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
                Class clsM$11 = prn$$ExternalSyntheticApiModelOutline0.m$11();
                Field declaredField = clsM$11.getDeclaredField("DEFAULT_ANIMATION_RESOURCES_ID");
                Method method = clsM$11.getMethod("getAnimationBackground", null);
                Method method2 = clsM$11.getMethod("getOpenAnimationResId", null);
                Method method3 = clsM$11.getMethod("getCloseAnimationResId", null);
                Method method4 = clsM$11.getMethod("getChangeAnimationResId", null);
                declaredField.getClass();
                boolean z = false;
                if (pyz.e(declaredField)) {
                    method.getClass();
                    if (pyz.f(method) && pyz.c(method, prn$$ExternalSyntheticApiModelOutline0.m$20())) {
                        method2.getClass();
                        if (pyz.f(method2) && pyz.c(method2, Integer.TYPE)) {
                            method3.getClass();
                            if (pyz.f(method3) && pyz.c(method3, Integer.TYPE)) {
                                method4.getClass();
                                if (pyz.f(method4) && pyz.c(method4, Integer.TYPE)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }) && pyz.a("Class AnimationParams.Builder is not valid", new fdae() { // from class: puw
            /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r8 = this;
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$20()
                    r1 = 1
                    java.lang.Class[] r2 = new java.lang.Class[r1]
                    r3 = 0
                    r2[r3] = r0
                    java.lang.Class r0 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$21()
                    java.lang.String r4 = "setAnimationBackground"
                    java.lang.reflect.Method r2 = r0.getMethod(r4, r2)
                    java.lang.Class[] r4 = new java.lang.Class[r1]
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r4[r3] = r5
                    java.lang.String r5 = "setOpenAnimationResId"
                    java.lang.reflect.Method r4 = r0.getMethod(r5, r4)
                    java.lang.Class[] r5 = new java.lang.Class[r1]
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    r5[r3] = r6
                    java.lang.String r6 = "setCloseAnimationResId"
                    java.lang.reflect.Method r5 = r0.getMethod(r6, r5)
                    java.lang.Class[] r6 = new java.lang.Class[r1]
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r6[r3] = r7
                    java.lang.String r7 = "setChangeAnimationResId"
                    java.lang.reflect.Method r0 = r0.getMethod(r7, r6)
                    r2.getClass()
                    boolean r6 = defpackage.pyz.f(r2)
                    if (r6 == 0) goto L85
                    java.lang.Class r6 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$21()
                    boolean r2 = defpackage.pyz.c(r2, r6)
                    if (r2 == 0) goto L85
                    r4.getClass()
                    boolean r2 = defpackage.pyz.f(r4)
                    if (r2 == 0) goto L85
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$21()
                    boolean r2 = defpackage.pyz.c(r4, r2)
                    if (r2 == 0) goto L85
                    r5.getClass()
                    boolean r2 = defpackage.pyz.f(r5)
                    if (r2 == 0) goto L85
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$21()
                    boolean r2 = defpackage.pyz.c(r5, r2)
                    if (r2 == 0) goto L85
                    r0.getClass()
                    boolean r2 = defpackage.pyz.f(r0)
                    if (r2 == 0) goto L85
                    java.lang.Class r2 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m$21()
                    boolean r0 = defpackage.pyz.c(r0, r2)
                    if (r0 == 0) goto L85
                    goto L86
                L85:
                    r1 = r3
                L86:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.puw.invoke():java.lang.Object");
            }
        });
    }
}
