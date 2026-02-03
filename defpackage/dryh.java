package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryh {
    public static final /* synthetic */ int a = 0;
    private static final cvw b;

    static {
        new ConcurrentHashMap();
        b();
        cvw cvwVar = new cvw();
        b = cvwVar;
        cvwVar.put(Byte.class, Byte.TYPE);
        cvwVar.put(Short.class, Short.TYPE);
        cvwVar.put(Integer.class, Integer.TYPE);
        cvwVar.put(Long.class, Long.TYPE);
        cvwVar.put(Float.class, Float.TYPE);
        cvwVar.put(Double.class, Double.TYPE);
        cvwVar.put(Character.class, Character.TYPE);
        cvwVar.put(Boolean.class, Boolean.TYPE);
    }

    public static Context a(Context context) {
        Context contextCreateDeviceProtectedStorageContext = context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
        return contextCreateDeviceProtectedStorageContext != null ? contextCreateDeviceProtectedStorageContext : context;
    }

    public static void b() {
        if (drxl.a) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("<clinit>") && (stackTraceElement.getClassName().endsWith("AppBase") || stackTraceElement.getClassName().endsWith("LatinApp") || stackTraceElement.getClassName().endsWith("Application"))) {
                    throw new ejyc("This class shall not be used before Application.onCreate() as it has a static filed of ConcurrentHashMap, please move it to later in the initialization sequence");
                }
            }
        }
    }
}
