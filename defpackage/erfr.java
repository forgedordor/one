package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfr {
    public final Map a;
    public final Map b;

    public erfr() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final void a(erfp erfpVar) throws GeneralSecurityException {
        if (erfpVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        erfs erfsVar = new erfs(erfpVar.b, erfpVar.c);
        Map map = this.a;
        if (!map.containsKey(erfsVar)) {
            map.put(erfsVar, erfpVar);
            return;
        }
        erfp erfpVar2 = (erfp) map.get(erfsVar);
        if (!erfpVar2.equals(erfpVar) || !erfpVar.equals(erfpVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(erfsVar.toString()));
        }
    }

    public final void b(erfu erfuVar) throws GeneralSecurityException {
        Map map = this.b;
        Class clsB = erfuVar.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, erfuVar);
            return;
        }
        erfu erfuVar2 = (erfu) map.get(clsB);
        if (!erfuVar2.equals(erfuVar) || !erfuVar.equals(erfuVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
        }
    }

    public erfr(erft erftVar) {
        this.a = new HashMap(erftVar.a);
        this.b = new HashMap(erftVar.b);
    }
}
