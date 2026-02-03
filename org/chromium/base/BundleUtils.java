package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import defpackage.ffxu;
import defpackage.ffyj;
import defpackage.ffyr;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class BundleUtils {
    public static final ArrayMap a = new ArrayMap();
    private static Boolean b;

    static {
        DesugarCollections.synchronizedMap(new ArrayMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x00fd, TryCatch #4 {, blocks: (B:15:0x003d, B:17:0x0043, B:18:0x0053, B:20:0x005b, B:22:0x0065, B:25:0x0071, B:23:0x0069), top: B:70:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x00fd, TryCatch #4 {, blocks: (B:15:0x003d, B:17:0x0043, B:18:0x0053, B:20:0x005b, B:22:0x0065, B:25:0x0071, B:23:0x0069), top: B:70:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #1 {all -> 0x00d2, blocks: (B:30:0x009f, B:32:0x00a7, B:34:0x00af, B:35:0x00b5, B:36:0x00bd, B:38:0x00c3), top: B:65:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.a(java.lang.String):android.content.Context");
    }

    public static void b(Context context, ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Field declaredField = context.getClass().getDeclaredField("mClassLoader");
        declaredField.setAccessible(true);
        declaredField.set(context, classLoader);
    }

    public static boolean c(String str) {
        return isBundle() && e(str) != null;
    }

    private static String d(String str, String str2) {
        String strE = e(str2);
        if (strE == null) {
            return null;
        }
        ApplicationInfo applicationInfo = ffxu.a.getApplicationInfo();
        return strE + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
    }

    private static String e(String str) {
        int iBinarySearch;
        ApplicationInfo applicationInfo = ffxu.a.getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        if (strArr != null && (iBinarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[iBinarySearch];
        }
        return null;
    }

    public static String getNativeLibraryPath(String str, String str2) {
        ffyj ffyjVarA = ffyj.a();
        try {
            String strFindLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (strFindLibrary != null) {
                ffyjVarA.close();
                return strFindLibrary;
            }
            ClassLoader classLoader = ffxu.a.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                strFindLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof ffyr) {
                throw null;
            }
            if (strFindLibrary != null) {
                ffyjVarA.close();
                return strFindLibrary;
            }
            String strD = d(str, str2);
            ffyjVarA.close();
            return strD;
        } catch (Throwable th) {
            try {
                ffyjVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean isBundle() {
        if (b == null) {
            String[] strArr = ffxu.a.getApplicationInfo().splitNames;
            boolean z = false;
            if (strArr != null && strArr.length > 0) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }
}
