package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ereu {
    public static final ereu a = new ereu();
    private final Map b = new HashMap();

    public final synchronized void a(eret eretVar, Class cls) {
        Map map = this.b;
        eret eretVar2 = (eret) map.get(cls);
        if (eretVar2 != null && !eretVar2.equals(eretVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        map.put(cls, eretVar);
    }
}
