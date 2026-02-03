package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtw {
    public static String b = "0";
    private static final String c = "ddtw";
    private static DynamiteModule e;
    private static final dcdu d = dcdu.d;
    public static final Object a = new Object();

    private ddtw() {
    }

    public static DynamiteModule a() {
        DynamiteModule dynamiteModule;
        synchronized (a) {
            dynamiteModule = e;
        }
        return dynamiteModule;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            ddtz ddtzVar = new ddtz(context, 37401, 1.0f);
            try {
                new ddua("PlayServices CronetProviderInstaller#installIfNeeded");
                try {
                    dclh.n(context, "Context must not be null");
                    ClassLoader classLoader = ddtw.class.getClassLoader();
                    dclh.m(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new ddua("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                        try {
                            dceq.d(context, 11925000);
                            Trace.endSection();
                            try {
                                new ddua("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                                try {
                                    DynamiteModule dynamiteModuleD = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.cronet_dynamite");
                                    Trace.endSection();
                                    try {
                                        new ddua("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                        try {
                                            Class<?> clsLoadClass = dynamiteModuleD.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (clsLoadClass.getClassLoader() == ddtw.class.getClassLoader()) {
                                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                                throw new dcen(8);
                                            }
                                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) d(method, new Object[0]);
                                            dclh.m(num);
                                            int iIntValue = num.intValue();
                                            String str = (String) d(method2, new Object[0]);
                                            dclh.m(str);
                                            b = str;
                                            Trace.endSection();
                                            if (iIntValue >= 3) {
                                                e = dynamiteModuleD;
                                                ddtzVar.a();
                                                Trace.endSection();
                                                ddtzVar.close();
                                                return;
                                            }
                                            Intent intentI = d.i(context, 2, "cr");
                                            if (intentI == null) {
                                                Log.e(c, "Unable to fetch error resolution intent");
                                                throw new dcen(2);
                                            }
                                            throw new dceo(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentI);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw ((dcen) new dcen(8).initCause(e2));
                                    }
                                } finally {
                                    try {
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (dcvv e3) {
                                Log.e(c, "Unable to load Cronet module", e3);
                                throw ((dcen) new dcen(8).initCause(e3));
                            }
                        } finally {
                        }
                    } catch (ClassNotFoundException e4) {
                        Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                        throw ((dcen) new dcen(10).initCause(e4));
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
