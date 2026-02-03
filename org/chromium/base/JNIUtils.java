package org.chromium.base;

import android.util.ArrayMap;
import defpackage.ffxx;
import defpackage.ffyc;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JNIUtils {
    private static final ffxx a = new ffxx();

    private static ClassLoader getSplitClassLoader(String str) {
        ClassLoader classLoader;
        ClassLoader classLoader2;
        if (!str.isEmpty()) {
            boolean zC = BundleUtils.c(str);
            ffyc.h("JNIUtils", "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(zC));
            if (zC) {
                if (!BundleUtils.isBundle()) {
                    return BundleUtils.class.getClassLoader();
                }
                ArrayMap arrayMap = BundleUtils.a;
                synchronized (arrayMap) {
                    classLoader = (ClassLoader) arrayMap.get(str);
                }
                if (classLoader != null) {
                    return classLoader;
                }
                BundleUtils.a(str);
                ArrayMap arrayMap2 = BundleUtils.a;
                synchronized (arrayMap2) {
                    classLoader2 = (ClassLoader) arrayMap2.get(str);
                }
                return classLoader2;
            }
        }
        return a;
    }
}
