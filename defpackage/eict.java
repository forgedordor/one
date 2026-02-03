package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eict {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static eiix a(Throwable th) {
        ejwl.m(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            Throwable cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cause == null) {
                return null;
            }
            eigx eigxVar = (eigx) weakHashMap.get(cause);
            weakHashMap.put(th, eigxVar);
            return new eiix(eigxVar);
        }
    }

    public static void b(Throwable th) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }

    public static void c(Throwable th) {
        Throwable cause;
        eifn eifnVarC;
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null && a(th) == null && (eifnVarC = eidc.c()) != null) {
            ArrayList arrayList = new ArrayList();
            for (eifnVarC = eidc.c(); eifnVarC != null; eifnVarC = eifnVarC.a()) {
                arrayList.add(eifnVarC);
            }
            UUID uuidG = ((eifn) arrayList.get(0)).g();
            if (uuidG == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            long jL = ((eifn) arrayList.get(0)).l();
            ekfw ekfwVarD = ekgb.d(arrayList.size());
            ekfw ekfwVarD2 = ekgb.d(arrayList.size());
            for (eifn eifnVar : ekjz.f(arrayList)) {
                ekfwVarD2.h(eifnVar.d());
                ekfwVarD.h(eifnVar.k());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                ekgb ekgbVarG = ekfwVarD2.g();
                if (ekgbVarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                ekgb ekgbVarG2 = ekfwVarD.g();
                if (ekgbVarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new eibr(ekgbVarG, ekgbVarG2, uuidG, jL));
            }
        }
    }
}
