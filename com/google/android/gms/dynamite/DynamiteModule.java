package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.IDynamiteLoader;
import com.google.android.gms.dynamite.IDynamiteLoaderV2;
import defpackage.a;
import defpackage.dcdu;
import defpackage.dclc;
import defpackage.dcmx;
import defpackage.dcni;
import defpackage.dcvp;
import defpackage.dcvq;
import defpackage.dcvr;
import defpackage.dcvs;
import defpackage.dcvt;
import defpackage.dcvu;
import defpackage.dcvv;
import defpackage.dcvw;
import defpackage.dcvx;
import defpackage.dcvy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DynamiteModule {
    private static Boolean d = null;
    private static IDynamiteLoader e = null;
    private static IDynamiteLoaderV2 f = null;
    private static String g = null;
    private static boolean h = false;
    private static int i = -1;
    private static Boolean j;
    public final Context c;
    private static final ThreadLocal k = new ThreadLocal();
    private static final ThreadLocal l = new dcvp();
    private static final dcvw m = new dcvq();
    public static final dcvy a = new dcvr();
    public static final dcvy b = new dcvs();

    /* compiled from: PG */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    private DynamiteModule(Context context) {
        this.c = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(a.a(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (dclc.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.a(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x015b A[Catch: all -> 0x01be, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x01be, blocks: (B:3:0x0002, B:61:0x00cc, B:63:0x00d2, B:69:0x00f4, B:91:0x014c, B:95:0x015b, B:116:0x01b6, B:117:0x01b9, B:111:0x01ad, B:67:0x00d9, B:121:0x01bd, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00c9, B:19:0x0046, B:41:0x009a, B:44:0x009d, B:52:0x00b6, B:60:0x00cb, B:58:0x00bc), top: B:140:0x0002, inners: #1, #10 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01ab -> B:130:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x01ad -> B:130:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.b(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule d(Context context, dcvy dcvyVar, String str) throws Throwable {
        long j2;
        long j3;
        DynamiteModule dynamiteModuleF;
        int i2;
        Boolean bool;
        IObjectWrapper iObjectWrapperCreateModuleContext;
        IDynamiteLoaderV2 iDynamiteLoaderV2;
        boolean z;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperLoadModule2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new dcvv("null application Context");
        }
        ThreadLocal threadLocal = k;
        dcvt dcvtVar = (dcvt) threadLocal.get();
        dcvt dcvtVar2 = new dcvt();
        threadLocal.set(dcvtVar2);
        ThreadLocal threadLocal2 = l;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            dcvx dcvxVarA = dcvyVar.a(context, str, m);
            j3 = 0;
            try {
                int i3 = dcvxVarA.a;
                j2 = jLongValue;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i3 + " and remote module " + str + ":" + dcvxVarA.b);
                    int i4 = dcvxVarA.c;
                    if (i4 == 0 || ((i4 == -1 && dcvxVarA.a == 0) || (i4 == 1 && dcvxVarA.b == 0))) {
                        throw new dcvv("No acceptable module " + str + " found. Local version is " + dcvxVarA.a + " and remote version is " + dcvxVarA.b + ".");
                    }
                    if (i4 == -1) {
                        DynamiteModule dynamiteModuleF2 = f(applicationContext, str);
                        if (j2 == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        Cursor cursor = dcvtVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(dcvtVar);
                        return dynamiteModuleF2;
                    }
                    if (i4 != 1) {
                        throw new dcvv(a.g(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        i2 = dcvxVarA.b;
                    } catch (dcvv e2) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e2.getMessage());
                        int i5 = dcvxVarA.a;
                        if (i5 == 0 || dcvyVar.a(context, str, new dcvu(i5)).c != -1) {
                            throw new dcvv("Remote load failed. No local fallback found.", e2);
                        }
                        dynamiteModuleF = f(applicationContext, str);
                    }
                    try {
                        synchronized (DynamiteModule.class) {
                            if (!j(context)) {
                                throw new dcvv("Remote loading disabled");
                            }
                            bool = d;
                        }
                        if (bool == null) {
                            throw new dcvv("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", a.B(i2, str, "Selected remote version of ", ", version >= "));
                            synchronized (DynamiteModule.class) {
                                iDynamiteLoaderV2 = f;
                            }
                            if (iDynamiteLoaderV2 == null) {
                                throw new dcvv("DynamiteLoaderV2 was not cached.");
                            }
                            dcvt dcvtVar3 = (dcvt) threadLocal.get();
                            if (dcvtVar3 == null || dcvtVar3.a == null) {
                                throw new dcvv("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = dcvtVar3.a;
                            ObjectWrapper.wrap(null);
                            synchronized (DynamiteModule.class) {
                                z = i >= 2;
                                boolValueOf = Boolean.valueOf(z);
                            }
                            boolValueOf.getClass();
                            if (z) {
                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                iObjectWrapperLoadModule2 = iDynamiteLoaderV2.loadModule2NoCrashUtils(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor2));
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                iObjectWrapperLoadModule2 = iDynamiteLoaderV2.loadModule2(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor2));
                            }
                            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperLoadModule2);
                            if (context2 == null) {
                                throw new dcvv("Failed to get module context");
                            }
                            dynamiteModuleF = new DynamiteModule(context2);
                        } else {
                            Log.i("DynamiteModule", a.B(i2, str, "Selected remote version of ", ", version >= "));
                            IDynamiteLoader iDynamiteLoaderG = g(context);
                            if (iDynamiteLoaderG == null) {
                                throw new dcvv("Failed to create IDynamiteLoader.");
                            }
                            int iDynamiteLoaderVersion = iDynamiteLoaderG.getIDynamiteLoaderVersion();
                            if (iDynamiteLoaderVersion >= 3) {
                                dcvt dcvtVar4 = (dcvt) threadLocal.get();
                                if (dcvtVar4 == null) {
                                    throw new dcvv("No cached result cursor holder");
                                }
                                iObjectWrapperCreateModuleContext = iDynamiteLoaderG.createModuleContext3NoCrashUtils(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(dcvtVar4.a));
                            } else if (iDynamiteLoaderVersion == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                iObjectWrapperCreateModuleContext = iDynamiteLoaderG.createModuleContextNoCrashUtils(ObjectWrapper.wrap(context), str, i2);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                iObjectWrapperCreateModuleContext = iDynamiteLoaderG.createModuleContext(ObjectWrapper.wrap(context), str, i2);
                            }
                            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperCreateModuleContext);
                            if (objUnwrap == null) {
                                throw new dcvv("Failed to load remote module.");
                            }
                            dynamiteModuleF = new DynamiteModule((Context) objUnwrap);
                        }
                        if (j2 == 0) {
                            l.remove();
                        } else {
                            l.set(l2);
                        }
                        Cursor cursor3 = dcvtVar2.a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        k.set(dcvtVar);
                        return dynamiteModuleF;
                    } catch (RemoteException e3) {
                        throw new dcvv("Failed to load remote module.", e3);
                    } catch (dcvv e4) {
                        throw e4;
                    } catch (Throwable th) {
                        dcmx.a(context);
                        throw new dcvv("Failed to load remote module.", th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (j2 == j3) {
                        l.remove();
                    } else {
                        l.set(l2);
                    }
                    Cursor cursor4 = dcvtVar2.a;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    k.set(dcvtVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j2 = jLongValue;
            }
        } catch (Throwable th4) {
            th = th4;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124 A[PHI: r13
      0x0124: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ec, B:74:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new DynamiteModule(context);
    }

    private static IDynamiteLoader g(Context context) {
        synchronized (DynamiteModule.class) {
            IDynamiteLoader iDynamiteLoader = e;
            if (iDynamiteLoader != null) {
                return iDynamiteLoader;
            }
            try {
                IDynamiteLoader iDynamiteLoaderAsInterface = IDynamiteLoader.Stub.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                if (iDynamiteLoaderAsInterface != null) {
                    e = iDynamiteLoaderAsInterface;
                    return iDynamiteLoaderAsInterface;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    private static void h(ClassLoader classLoader) throws dcvv {
        try {
            f = IDynamiteLoaderV2.Stub.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new dcvv("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        dcvt dcvtVar = (dcvt) k.get();
        if (dcvtVar == null || dcvtVar.a != null) {
            return false;
        }
        dcvtVar.a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != dcni.b() ? 0 : VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            if (dcdu.d.h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            j = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public final IBinder c(String str) throws dcvv {
        try {
            return (IBinder) this.c.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new dcvv("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
