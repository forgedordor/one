package defpackage;

import j$.util.Base64;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccz {
    public static final Set a;
    public static final Set b;

    static {
        Set setD = fcwm.d("Era-ID", "Epoch-Authenticator");
        a = setD;
        b = fcwm.g(setD, fcwm.b("Original-Message-Id"));
    }

    public static final basd a(eyga eygaVar) {
        eyge eygeVar = (eyge) DesugarCollections.unmodifiableMap(eygaVar.b).get(civa.MLS_NAMESPACE.q);
        return basd.a(eygeVar != null ? (String) DesugarCollections.unmodifiableMap(eygeVar.b).get("Original-Message-Id") : null);
    }

    public static final evqs b(eyga eygaVar) {
        String str = (String) fdct.b(civb.a(eygaVar, civa.MLS_NAMESPACE, "Epoch-Authenticator"));
        if (str != null) {
            return evqs.x(Base64.getDecoder().decode(str));
        }
        return null;
    }

    public static final Integer c(eyga eygaVar) {
        Optional optionalA = civb.a(eygaVar, civa.MLS_NAMESPACE, "Era-ID");
        if (optionalA.isPresent()) {
            return Integer.valueOf(Integer.parseInt((String) optionalA.get()));
        }
        return null;
    }
}
