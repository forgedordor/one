package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erti {
    static {
        erna ernaVar = erna.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        erey ereyVar = erey.a;
        ereyVar.c(ertq.a);
        ereyVar.b(ertq.b);
        if (eqzb.a()) {
            return;
        }
        erfp erfpVar = ersl.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        erfi erfiVar = ertv.a;
        erfb erfbVar = erfb.a;
        erfbVar.h(ertv.a);
        erfbVar.g(ertv.b);
        erfbVar.f(ertv.c);
        erfbVar.e(ertv.d);
        erex erexVar = erex.a;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256_4KB", erth.a);
        map.put("AES128_CTR_HMAC_SHA256_1MB", erth.b);
        map.put("AES256_CTR_HMAC_SHA256_4KB", erth.c);
        map.put("AES256_CTR_HMAC_SHA256_1MB", erth.d);
        erexVar.b(DesugarCollections.unmodifiableMap(map));
        eres eresVar = eres.a;
        eresVar.b(ersl.b, erso.class);
        ereyVar.b(ersl.a);
        erec erecVar = erec.a;
        erecVar.c(ersl.c, true);
        erfp erfpVar2 = ersu.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        erfbVar.h(erua.a);
        erfbVar.g(erua.b);
        erfbVar.f(erua.c);
        erfbVar.e(erua.d);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM_HKDF_4KB", erth.e);
        map2.put("AES128_GCM_HKDF_1MB", erth.f);
        map2.put("AES256_GCM_HKDF_4KB", erth.g);
        map2.put("AES256_GCM_HKDF_1MB", erth.h);
        erexVar.b(DesugarCollections.unmodifiableMap(map2));
        ereu.a.a(ersu.d, ersx.class);
        eresVar.b(ersu.c, ersx.class);
        ereyVar.b(ersu.a);
        erecVar.c(ersu.b, true);
    }
}
