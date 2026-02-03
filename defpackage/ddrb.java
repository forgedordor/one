package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.internal.ICreator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrb {
    private static final String a = "ddrb";
    private static Context b;
    private static ICreator c;

    public static ICreator a(Context context) {
        return b(context, null);
    }

    public static ICreator b(Context context, ddqo ddqoVar) throws dcen, PackageManager.NameNotFoundException {
        dclh.m(context);
        String str = a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(String.valueOf(ddqoVar))));
        ICreator iCreator = c;
        if (iCreator != null) {
            return iCreator;
        }
        int i = dcep.a;
        int iB = dceq.b(context, 13400000);
        if (iB != 0) {
            throw new dcen(iB);
        }
        ICreator iCreatorE = e(context, ddqoVar);
        c = iCreatorE;
        try {
            int rendererType = iCreatorE.getRendererType();
            String packageName = context.getPackageName();
            if (rendererType != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d(str, "not early loading native code");
            } else {
                Log.d(str, "early loading native code");
                try {
                    c.preInit(ObjectWrapper.wrap(d(context, ddqoVar)));
                } catch (RemoteException e) {
                    throw new ddrw(e);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    b = null;
                    c = e(context, ddqo.LEGACY);
                }
            }
            try {
                c.initV2(ObjectWrapper.wrap(d(context, ddqoVar).getResources()), 20000000);
                return c;
            } catch (RemoteException e2) {
                throw new ddrw(e2);
            }
        } catch (RemoteException e3) {
            throw new ddrw(e3);
        }
    }

    private static Context c(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        int i = dcep.a;
        return dceq.c(context);
    }

    private static Context d(Context context, ddqo ddqoVar) {
        Context contextC;
        Context context2 = b;
        if (context2 != null) {
            return context2;
        }
        String str = ddqoVar == ddqo.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextC = DynamiteModule.d(context, DynamiteModule.a, str).c;
        } catch (Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextC = c(e, context);
            } else {
                try {
                    Log.d(a, "Attempting to load maps_dynamite again.");
                    contextC = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.maps_dynamite").c;
                } catch (Exception e2) {
                    contextC = c(e2, context);
                }
            }
        }
        b = contextC;
        if (contextC != null) {
            return contextC;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static ICreator e(Context context, ddqo ddqoVar) {
        Log.i(a, "Making Creator dynamically");
        ClassLoader classLoader = d(context, ddqoVar).getClassLoader();
        try {
            dclh.m(classLoader);
            IBinder iBinder = (IBinder) f(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder != null) {
                return ICreator.Stub.asInterface(iBinder);
            }
            throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static Object f(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }
}
