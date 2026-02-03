package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtc {
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
        ereyVar.c(eqtj.a);
        ereyVar.b(eqtj.b);
        erhf.a();
        int i = eqtp.e;
        if (!eqza.a(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        erfi erfiVar = eqwz.a;
        erfb erfbVar = erfb.a;
        erfbVar.h(eqwz.a);
        erfbVar.g(eqwz.b);
        erfbVar.f(eqwz.c);
        erfbVar.e(eqwz.d);
        ereyVar.b(eqtp.a);
        erex erexVar = erex.a;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", eqwh.e);
        eqtq eqtqVar = new eqtq();
        eqtqVar.b(16);
        eqtqVar.c(32);
        eqtqVar.e(16);
        eqtqVar.d(16);
        eqtr eqtrVar = eqtr.c;
        eqtqVar.a = eqtrVar;
        eqts eqtsVar = eqts.c;
        eqtqVar.b = eqtsVar;
        map.put("AES128_CTR_HMAC_SHA256_RAW", eqtqVar.a());
        map.put("AES256_CTR_HMAC_SHA256", eqwh.f);
        eqtq eqtqVar2 = new eqtq();
        eqtqVar2.b(32);
        eqtqVar2.c(32);
        eqtqVar2.e(32);
        eqtqVar2.d(16);
        eqtqVar2.a = eqtrVar;
        eqtqVar2.b = eqtsVar;
        map.put("AES256_CTR_HMAC_SHA256_RAW", eqtqVar2.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map));
        ereu ereuVar = ereu.a;
        ereuVar.a(eqtp.c, eqtt.class);
        eres eresVar = eres.a;
        eresVar.b(eqtp.d, eqtt.class);
        erec erecVar = erec.a;
        erecVar.d(eqtp.b, i, true);
        int i2 = equh.e;
        if (!eqza.a(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        erfbVar.h(eqxl.a);
        erfbVar.g(eqxl.b);
        erfbVar.f(eqxl.c);
        erfbVar.e(eqxl.d);
        ereyVar.b(equh.a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", eqwh.a);
        equi equiVar = new equi();
        equiVar.b();
        equiVar.c(16);
        equiVar.d();
        equj equjVar = equj.c;
        equiVar.a = equjVar;
        map2.put("AES128_GCM_RAW", equiVar.a());
        map2.put("AES256_GCM", eqwh.b);
        equi equiVar2 = new equi();
        equiVar2.b();
        equiVar2.c(32);
        equiVar2.d();
        equiVar2.a = equjVar;
        map2.put("AES256_GCM_RAW", equiVar2.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map2));
        ereuVar.a(equh.c, equk.class);
        eresVar.b(equh.d, equk.class);
        erecVar.d(equh.b, i2, true);
        if (eqzb.a()) {
            return;
        }
        erfp erfpVar = eqty.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        erfbVar.h(eqxe.a);
        erfbVar.g(eqxe.b);
        erfbVar.f(eqxe.c);
        erfbVar.e(eqxe.d);
        ereyVar.b(eqty.a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", eqwh.c);
        eqtz eqtzVar = new eqtz();
        eqtzVar.b(16);
        eqtzVar.c(16);
        eqtzVar.d();
        equa equaVar = equa.c;
        eqtzVar.a = equaVar;
        map3.put("AES128_EAX_RAW", eqtzVar.a());
        map3.put("AES256_EAX", eqwh.d);
        eqtz eqtzVar2 = new eqtz();
        eqtzVar2.b(16);
        eqtzVar2.c(32);
        eqtzVar2.d();
        eqtzVar2.a = equaVar;
        map3.put("AES256_EAX_RAW", eqtzVar2.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map3));
        eresVar.b(eqty.c, equb.class);
        erecVar.c(eqty.b, true);
        erfp erfpVar2 = equq.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        erfbVar.h(eqxr.a);
        erfbVar.g(eqxr.b);
        erfbVar.f(eqxr.c);
        erfbVar.e(eqxr.d);
        HashMap map4 = new HashMap();
        equr equrVar = new equr();
        equrVar.b(16);
        equs equsVar = equs.a;
        equrVar.a = equsVar;
        map4.put("AES128_GCM_SIV", equrVar.a());
        equr equrVar2 = new equr();
        equrVar2.b(16);
        equs equsVar2 = equs.c;
        equrVar2.a = equsVar2;
        map4.put("AES128_GCM_SIV_RAW", equrVar2.a());
        equr equrVar3 = new equr();
        equrVar3.b(32);
        equrVar3.a = equsVar;
        map4.put("AES256_GCM_SIV", equrVar3.a());
        equr equrVar4 = new equr();
        equrVar4.b(32);
        equrVar4.a = equsVar2;
        map4.put("AES256_GCM_SIV_RAW", equrVar4.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map4));
        ereuVar.a(equq.c, equt.class);
        eresVar.b(equq.b, equt.class);
        ereyVar.b(equq.a);
        erecVar.c(equq.d, true);
        erfp erfpVar3 = equx.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        erfbVar.h(eqxy.a);
        erfbVar.g(eqxy.b);
        erfbVar.f(eqxy.c);
        erfbVar.e(eqxy.d);
        ereyVar.b(equx.a);
        eresVar.b(equx.b, equz.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new equz(equy.a));
        map5.put("CHACHA20_POLY1305_RAW", new equz(equy.c));
        erexVar.b(DesugarCollections.unmodifiableMap(map5));
        erecVar.c(equx.c, true);
        erfp erfpVar4 = eqvc.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        erfbVar.h(eqvo.a);
        erfbVar.g(eqvo.b);
        erfbVar.f(eqvo.c);
        erfbVar.e(eqvo.d);
        ereyVar.b(eqvc.a);
        eresVar.b(eqvc.c, eqvj.class);
        erecVar.c(eqvc.b, true);
        eqsh eqshVar = eqvg.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        erfbVar.h(eqvx.a);
        erfbVar.g(eqvx.b);
        erfbVar.f(eqvx.c);
        erfbVar.e(eqvx.d);
        eresVar.b(eqvg.b, eqvs.class);
        ereyVar.b(eqvg.c);
        erecVar.c(eqvg.a, true);
        erfp erfpVar5 = eqws.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        erfbVar.h(eqyv.a);
        erfbVar.g(eqyv.b);
        erfbVar.f(eqyv.c);
        erfbVar.e(eqyv.d);
        ereyVar.b(eqws.a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new eqwu(eqwt.a));
        map6.put("XCHACHA20_POLY1305_RAW", new eqwu(eqwt.c));
        erexVar.b(DesugarCollections.unmodifiableMap(map6));
        eresVar.b(eqws.d, eqwu.class);
        ereuVar.a(eqws.c, eqwu.class);
        erecVar.c(eqws.b, true);
        erfbVar.h(eqyp.a);
        erfbVar.g(eqyp.b);
        erfbVar.f(eqyp.c);
        erfbVar.e(eqyp.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", eqwh.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", eqwh.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", eqwh.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", eqwh.j);
        erexVar.b(DesugarCollections.unmodifiableMap(map7));
        ereyVar.b(eqwl.b);
        eresVar.b(eqwl.a, eqwn.class);
    }
}
