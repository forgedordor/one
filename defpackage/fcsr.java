package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcsr {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj;
        Class<?> cls;
        fcsq fcsqVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                fcsqVar = (fcsq) cls.asSubclass(fcsq.class).getConstructor(fcss.class).newInstance(fcsq.a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            fcsqVar = null;
        }
        if (fcsqVar == null) {
            new fcsq(fcsq.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, fcsr.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private fcsr() {
    }
}
