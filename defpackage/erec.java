package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erec {
    private static final Logger c = Logger.getLogger(erec.class.getName());
    public static final erec a = new erec();
    private final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    private final synchronized void e(eqsh eqshVar, boolean z) {
        String strD = eqshVar.d();
        if (z) {
            ConcurrentMap concurrentMap = this.b;
            if (concurrentMap.containsKey(strD) && !((Boolean) concurrentMap.get(strD)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strD));
            }
        }
        ConcurrentMap concurrentMap2 = this.d;
        eqsh eqshVar2 = (eqsh) concurrentMap2.get(strD);
        if (eqshVar2 != null && !eqshVar2.getClass().equals(eqshVar.getClass())) {
            c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strD));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strD, eqshVar2.getClass().getName(), eqshVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(strD, eqshVar);
        this.b.put(strD, Boolean.valueOf(z));
    }

    public final eqsh a(String str, Class cls) throws GeneralSecurityException {
        eqsh eqshVarB = b(str);
        if (eqshVarB.b().equals(cls)) {
            return eqshVarB;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(eqshVarB.getClass()) + ", which only supports: " + eqshVarB.b().toString());
    }

    public final synchronized eqsh b(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.d;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException(a.a(str, "No key manager found for key type ", ", see https://developers.google.com/tink/faq/registration_errors"));
        }
        return (eqsh) concurrentMap.get(str);
    }

    public final synchronized void c(eqsh eqshVar, boolean z) {
        d(eqshVar, 1, z);
    }

    public final synchronized void d(eqsh eqshVar, int i, boolean z) {
        if (!eqza.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(eqshVar, z);
    }
}
