package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddki {
    private static final Object a = new Object();
    private static volatile ddkf b;

    private ddki() {
    }

    public static IInterface a(Context context, String str, ddkh ddkhVar) {
        ddkf ddkfVarB = b;
        if (ddkfVarB == null) {
            synchronized (a) {
                ddkfVarB = b;
                if (ddkfVarB == null) {
                    ddkfVarB = b(context);
                    b = ddkfVarB;
                }
            }
        }
        return ddkfVarB.a(context, str, ddkhVar);
    }

    private static ddkf b(Context context) throws ddkg, ClassNotFoundException {
        Class<?> clsLoadClass;
        if (Log.isLoggable("brella.DynamiteLdr", 3)) {
            Log.d("brella.DynamiteLdr", "Trying to load fat dynamite loader");
        }
        try {
            clsLoadClass = ddki.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", "Found fat DynamiteLoader impl: " + clsLoadClass.getName());
            }
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", "Falling back to trying to load default dynamite loader");
            }
            try {
                clsLoadClass = ddki.class.getClassLoader().loadClass("ddke");
                if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                    Log.d("brella.DynamiteLdr", "Found default DynamiteLoader impl: " + clsLoadClass.getName());
                }
            } catch (ClassNotFoundException e) {
                String strValueOf = String.valueOf(e.getMessage());
                boolean zIsLoggable = Log.isLoggable("brella.DynamiteLdr", 3);
                String strConcat = "No dynamite loader found: ".concat(strValueOf);
                if (zIsLoggable) {
                    Log.d("brella.DynamiteLdr", strConcat, e);
                }
                throw new ddkg(strConcat, e);
            }
        }
        try {
            return (ddkf) clsLoadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            boolean zIsLoggable2 = Log.isLoggable("brella.DynamiteLdr", 3);
            String strConcat2 = "Failed to create dynamite loader instance: ".concat(strValueOf2);
            if (zIsLoggable2) {
                Log.d("brella.DynamiteLdr", strConcat2, e2);
            }
            throw new ddkg(strConcat2, e2);
        }
    }
}
