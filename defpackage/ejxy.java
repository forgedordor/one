package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxy {
    private static final Object a;

    static {
        Object objF = f();
        a = objF;
        if (objF != null) {
            g("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objF == null) {
            return;
        }
        h(objF);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Throwable b(Throwable th) {
        boolean z = false;
        Throwable cause = th;
        while (true) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                return th;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            th = cause2;
        }
    }

    public static List c(Throwable th) {
        th.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable cause = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
        }
    }

    public static void d(Throwable th, Class cls) {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void e(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Object f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method g(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodG = g("getStackTraceDepth", Throwable.class);
            if (methodG == null) {
                return;
            }
            methodG.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
