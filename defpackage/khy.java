package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class khy {
    public static final khy a = new khy();

    private khy() {
    }

    public static final void a(String str, String str2, hml hmlVar, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            int length = objArr.length;
            Method methodC = c(cls, str2, Arrays.copyOf(objArr, length));
            if (methodC != null) {
                methodC.setAccessible(true);
                if (Modifier.isStatic(methodC.getModifiers())) {
                    d(methodC, null, hmlVar, Arrays.copyOf(objArr, length));
                    return;
                } else {
                    d(methodC, cls.getConstructor(null).newInstance(null), hmlVar, Arrays.copyOf(objArr, length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e;
        }
    }

    private static final int b(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private static final Method c(Class cls, String str, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                fddq fddqVarR = fddu.r(0, iB);
                ArrayList arrayList2 = new ArrayList(fcva.p(fddqVarR, 10));
                fcvy it = fddqVarR.iterator();
                while (((fddp) it).a) {
                    it.a();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                ArrayList arrayList3 = new ArrayList(3);
                fdcl.a(clsArr, arrayList3);
                arrayList3.add(hml.class);
                fdcl.a(clsArr2, arrayList3);
                Class[] clsArr3 = (Class[]) arrayList3.toArray(new Class[arrayList3.size()]);
                int length2 = declaredMethods.length;
                int i3 = 0;
                loop2: while (true) {
                    if (i3 >= length2) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (!fdbq.f(str, method.getName())) {
                        if (!fdgn.t(method.getName(), str + '-')) {
                            continue;
                        }
                        i3++;
                        i = 0;
                    }
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?>[] clsArr4 = (Class[]) Arrays.copyOf(clsArr3, clsArr3.length);
                    int length3 = parameterTypes.length;
                    if (length3 == clsArr4.length) {
                        ArrayList arrayList4 = new ArrayList(length3);
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            Class<?> cls4 = parameterTypes[i4];
                            int i6 = i5 + 1;
                            Class<?> cls5 = clsArr4[i5];
                            boolean z = true;
                            if (!fdbq.f(fdab.c(cls4), fdab.c(cls5)) && !cls4.isAssignableFrom(cls5)) {
                                z = false;
                            }
                            arrayList4.add(Boolean.valueOf(z));
                            i4++;
                            i5 = i6;
                        }
                        if (!arrayList4.isEmpty()) {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                if (!((Boolean) it2.next()).booleanValue()) {
                                    break;
                                }
                            }
                            break loop2;
                        }
                        break;
                    }
                    continue;
                    i3++;
                    i = 0;
                }
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(str.concat(" not found"));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (!fdbq.f(method2.getName(), str)) {
                    if (!fdgn.t(method2.getName(), str + '-')) {
                    }
                }
                return method2;
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(java.lang.reflect.Method r10, java.lang.Object r11, defpackage.hml r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khy.d(java.lang.reflect.Method, java.lang.Object, hml, java.lang.Object[]):void");
    }
}
