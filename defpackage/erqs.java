package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqs {
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
        ereyVar.c(erpp.a);
        ereyVar.b(erpp.b);
        ereyVar.c(erpt.a);
        ereyVar.b(erpt.b);
        int i = eroo.e;
        if (!eqza.a(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        erfi erfiVar = errc.a;
        erfb erfbVar = erfb.a;
        erfbVar.h(errc.a);
        erfbVar.g(errc.b);
        erfbVar.f(errc.c);
        erfbVar.e(errc.d);
        erfbVar.f(errc.e);
        erfbVar.e(errc.f);
        erex erexVar = erex.a;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", erpm.a);
        map.put("ECDSA_P256_IEEE_P1363", erpm.d);
        erod erodVar = erod.a;
        map.put("ECDSA_P256_RAW", erob.a(eroe.a, eroc.a, erodVar, erof.d));
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", erpm.f);
        map.put("ECDSA_P384", erpm.b);
        map.put("ECDSA_P384_IEEE_P1363", erpm.e);
        erod erodVar2 = erod.c;
        eroc erocVar = eroc.b;
        eroe eroeVar = eroe.b;
        erof erofVar = erof.a;
        map.put("ECDSA_P384_SHA512", erob.a(eroeVar, erocVar, erodVar2, erofVar));
        map.put("ECDSA_P384_SHA384", erob.a(eroeVar, erocVar, erod.b, erofVar));
        map.put("ECDSA_P521", erpm.c);
        map.put("ECDSA_P521_IEEE_P1363", erpm.g);
        erexVar.b(DesugarCollections.unmodifiableMap(map));
        ereyVar.b(eroo.a);
        ereyVar.b(eroo.b);
        eres eresVar = eres.a;
        eresVar.b(eroo.d, erog.class);
        erec erecVar = erec.a;
        erecVar.d(eroo.f, i, true);
        erecVar.d(eroo.c, i, false);
        int i2 = erqf.e;
        if (!eqza.a(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        erfbVar.h(errw.a);
        erfbVar.g(errw.b);
        erfbVar.f(errw.c);
        erfbVar.e(errw.d);
        erfbVar.f(errw.e);
        erfbVar.e(errw.f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", erpm.h);
        BigInteger bigInteger = erpx.a;
        erpu erpuVar = new erpu();
        erpuVar.b = erpv.a;
        erpuVar.b(3072);
        BigInteger bigInteger2 = erpx.a;
        erpuVar.a = bigInteger2;
        erpw erpwVar = erpw.d;
        erpuVar.c = erpwVar;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", erpuVar.a());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", erpm.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", erpm.j);
        erpu erpuVar2 = new erpu();
        erpuVar2.b = erpv.c;
        erpuVar2.b(4096);
        erpuVar2.a = bigInteger2;
        erpuVar2.c = erpwVar;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", erpuVar2.a());
        erexVar.b(map2);
        ereyVar.b(erqf.a);
        ereyVar.b(erqf.b);
        eresVar.b(erqf.d, erpx.class);
        erecVar.d(erqf.f, i2, true);
        erecVar.d(erqf.c, i2, false);
        int i3 = erqr.e;
        if (!eqza.a(i3)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        erfbVar.h(ersf.a);
        erfbVar.g(ersf.b);
        erfbVar.f(ersf.c);
        erfbVar.e(ersf.d);
        erfbVar.f(ersf.e);
        erfbVar.e(ersf.f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = erqj.a;
        erqg erqgVar = new erqg();
        erqh erqhVar = erqh.a;
        erqgVar.b = erqhVar;
        erqgVar.c = erqhVar;
        erqgVar.c(32);
        erqgVar.b(3072);
        BigInteger bigInteger4 = erqj.a;
        erqgVar.a = bigInteger4;
        erqi erqiVar = erqi.a;
        erqgVar.d = erqiVar;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", erqgVar.a());
        erqg erqgVar2 = new erqg();
        erqgVar2.b = erqhVar;
        erqgVar2.c = erqhVar;
        erqgVar2.c(32);
        erqgVar2.b(3072);
        erqgVar2.a = bigInteger4;
        erqi erqiVar2 = erqi.d;
        erqgVar2.d = erqiVar2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", erqgVar2.a());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", erpm.k);
        erqg erqgVar3 = new erqg();
        erqh erqhVar2 = erqh.c;
        erqgVar3.b = erqhVar2;
        erqgVar3.c = erqhVar2;
        erqgVar3.c(64);
        erqgVar3.b(4096);
        erqgVar3.a = bigInteger4;
        erqgVar3.d = erqiVar;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", erqgVar3.a());
        erqg erqgVar4 = new erqg();
        erqgVar4.b = erqhVar2;
        erqgVar4.c = erqhVar2;
        erqgVar4.c(64);
        erqgVar4.b(4096);
        erqgVar4.a = bigInteger4;
        erqgVar4.d = erqiVar2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", erqgVar4.a());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", erpm.l);
        erexVar.b(DesugarCollections.unmodifiableMap(map3));
        ereyVar.b(erqr.a);
        ereyVar.b(erqr.b);
        eresVar.b(erqr.d, erqj.class);
        erecVar.d(erqr.f, i3, true);
        erecVar.d(erqr.c, i3, false);
        if (eqzb.a()) {
            return;
        }
        erfp erfpVar = erow.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        erfbVar.h(errl.a);
        erfbVar.g(errl.b);
        erfbVar.f(errl.c);
        erfbVar.e(errl.d);
        erfbVar.f(errl.e);
        erfbVar.e(errl.f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new eroq(erop.a));
        erop eropVar = erop.d;
        map4.put("ED25519_RAW", new eroq(eropVar));
        map4.put("ED25519WithRawOutput", new eroq(eropVar));
        erexVar.b(DesugarCollections.unmodifiableMap(map4));
        eresVar.b(erow.e, eroq.class);
        ereu.a.a(erow.d, eroq.class);
        ereyVar.b(erow.a);
        ereyVar.b(erow.b);
        erecVar.c(erow.f, true);
        erecVar.c(erow.c, false);
    }
}
