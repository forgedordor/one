package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknr {
    public static Object[] a(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        return objArrCopyOf;
    }

    public static Object[] b(Object[] objArr, Object[] objArr2, Class cls) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrC = c(cls, length + length2);
        System.arraycopy(objArr, 0, objArrC, 0, length);
        System.arraycopy(objArr2, 0, objArrC, length, length2);
        return objArrC;
    }

    public static Object[] c(Class cls, int i) {
        return (Object[]) Array.newInstance((Class<?>) cls, i);
    }

    public static Object[] d(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = eknx.a(objArr, size);
        }
        h(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    static void e(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.g(i, "at index "));
        }
    }

    static void f(Object... objArr) {
        g(objArr, objArr.length);
    }

    static void g(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            e(objArr[i2], i2);
        }
    }

    public static void h(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }
}
