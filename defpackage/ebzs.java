package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebzs implements ebzx {
    private final String a;
    private final ebzr b;
    private ebzv c;
    private Object d;

    public ebzs(String str, ebzr ebzrVar) {
        this.a = str;
        this.b = ebzrVar;
    }

    private final synchronized ebzv f() {
        int i;
        Object objA = this.b.a();
        if (this.d != objA) {
            this.d = objA;
            if (objA instanceof ebzv) {
                ebzv ebzvVar = (ebzv) objA;
                this.c = ebzvVar;
                return ebzvVar;
            }
            ebzw ebzwVar = new ebzw("AutoTarget");
            this.c = ebzwVar;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> superclass = objA.getClass();
            while (true) {
                i = 0;
                if (superclass == Object.class) {
                    break;
                }
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int length = declaredMethods.length;
                while (i < length) {
                    Method method = declaredMethods[i];
                    if (method.isAnnotationPresent(ecag.class)) {
                        arrayList.add(method);
                    } else if (method.isAnnotationPresent(ecai.class)) {
                        arrayList2.add(method);
                    }
                    i++;
                }
                superclass = superclass.getSuperclass();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Method method2 = (Method) arrayList.get(i2);
                ecag ecagVar = (ecag) method2.getAnnotation(ecag.class);
                ebzwVar.g(new ebzn((ecagVar == null || TextUtils.isEmpty(ecagVar.a())) ? method2.getName() : ecagVar.a(), objA, method2));
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Method method3 = (Method) arrayList2.get(i);
                if (method3.getParameterTypes().length != 0) {
                    throw new IllegalArgumentException("Invalid @PokeTarget method: ".concat(String.valueOf(String.valueOf(method3))));
                }
                method3.setAccessible(true);
                ecai ecaiVar = (ecai) method3.getAnnotation(ecai.class);
                ebzwVar.i(new ebzs((ecaiVar == null || TextUtils.isEmpty(ecaiVar.a())) ? method3.getName() : ecaiVar.a(), new ebzq(objA, method3)));
                i++;
            }
        }
        return this.c;
    }

    @Override // defpackage.ebzx
    public final ebzu a(String str) {
        return ecaf.a(f(), str);
    }

    @Override // defpackage.ebzx
    public final ebzv b(String str) {
        return ecaf.b(f(), str);
    }

    @Override // defpackage.ebzv
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ebzv
    public final List d() {
        return f().d();
    }

    @Override // defpackage.ebzv
    public final List e() {
        return f().e();
    }
}
