package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfi {
    public static final Logger a = Logger.getLogger(eyfi.class.getName());
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    public static final Method j;
    public static Constructor k;

    static {
        Class clsA = a("java.lang.invoke.MethodHandles");
        Class clsA2 = a("java.lang.invoke.MethodHandle");
        Class clsA3 = a("java.lang.invoke.MethodHandles$Lookup");
        Class clsA4 = a("java.lang.invoke.MethodType");
        b = b(Method.class, "isDefault", new Class[0]);
        c = b(clsA, "lookup", new Class[0]);
        d = b(clsA3, "in", Class.class);
        f = b(clsA3, "unreflectSpecial", Method.class, Class.class);
        g = b(clsA3, "findSpecial", Class.class, String.class, clsA4, Class.class);
        h = b(clsA2, "bindTo", Object.class);
        i = b(clsA2, "invokeWithArguments", Object[].class);
        e = b(clsA, "privateLookupIn", Class.class, clsA3);
        j = b(clsA4, "methodType", Class.class, Class[].class);
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "com.sun.jna.internal.ReflectionUtils", "lookupClass", "Failed to lookup class: ".concat(str), (Throwable) e2);
            return null;
        }
    }

    private static Method b(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            a.logp(Level.FINE, "com.sun.jna.internal.ReflectionUtils", "lookupMethod", "Failed to lookup method: {0}#{1}({2})", new Object[]{null, str, Arrays.toString(clsArr)});
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Exception unused) {
            a.logp(Level.FINE, "com.sun.jna.internal.ReflectionUtils", "lookupMethod", "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
    }
}
