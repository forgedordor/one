package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erft {
    public final Map a;
    public final Map b;

    public erft(erfr erfrVar) {
        this.a = new HashMap(erfrVar.a);
        this.b = new HashMap(erfrVar.b);
    }

    public final Object a(eqsg eqsgVar, Class cls) throws GeneralSecurityException {
        erfs erfsVar = new erfs(eqsgVar.getClass(), cls);
        Map map = this.a;
        if (map.containsKey(erfsVar)) {
            return ((erfp) map.get(erfsVar)).a(eqsgVar);
        }
        throw new GeneralSecurityException(a.b(erfsVar, "No PrimitiveConstructor for ", " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(erej erejVar, erep erepVar, Class cls) throws GeneralSecurityException {
        Map map = this.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        erfu erfuVar = (erfu) map.get(cls);
        return erfuVar.c(erejVar, erepVar, new erfq(this, erfuVar));
    }
}
