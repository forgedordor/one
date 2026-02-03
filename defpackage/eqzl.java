package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzl {
    static {
        erna ernaVar = erna.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        erey ereyVar = erey.a;
        ereyVar.c(eqzr.a);
        ereyVar.b(eqzr.b);
        if (eqzb.a()) {
            return;
        }
        erfp erfpVar = eqzh.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        erfi erfiVar = eqzy.a;
        erfb erfbVar = erfb.a;
        erfbVar.h(eqzy.a);
        erfbVar.g(eqzy.b);
        erfbVar.f(eqzy.c);
        erfbVar.e(eqzy.d);
        ereyVar.b(eqzh.a);
        erex erexVar = erex.a;
        HashMap map = new HashMap();
        map.put("AES256_SIV", eqzt.a);
        eqzi eqziVar = new eqzi();
        eqziVar.b(64);
        eqziVar.a = eqzj.c;
        map.put("AES256_SIV_RAW", eqziVar.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map));
        ereu.a.a(eqzh.c, eqzk.class);
        eres.a.b(eqzh.d, eqzk.class);
        erec.a.c(eqzh.b, true);
    }
}
