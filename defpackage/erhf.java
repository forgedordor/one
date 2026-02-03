package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhf {
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
        ereyVar.c(erhl.a);
        ereyVar.b(erhl.b);
        ereyVar.c(ergt.a);
        int i = erha.f;
        if (!eqza.a(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        erdy erdyVar = erie.a;
        erfb erfbVar = erfb.a;
        erfbVar.h(erie.c);
        erfbVar.g(erie.d);
        erfbVar.f(erie.e);
        erfbVar.e(erie.f);
        ereyVar.b(erha.a);
        ereyVar.b(erha.b);
        erex erexVar = erex.a;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", erhr.a);
        erhb erhbVar = new erhb();
        erhbVar.b(32);
        erhbVar.c(16);
        erhd erhdVar = erhd.d;
        erhbVar.b = erhdVar;
        erhc erhcVar = erhc.c;
        erhbVar.a = erhcVar;
        map.put("HMAC_SHA256_128BITTAG_RAW", erhbVar.a());
        erhb erhbVar2 = new erhb();
        erhbVar2.b(32);
        erhbVar2.c(32);
        erhd erhdVar2 = erhd.a;
        erhbVar2.b = erhdVar2;
        erhbVar2.a = erhcVar;
        map.put("HMAC_SHA256_256BITTAG", erhbVar2.a());
        erhb erhbVar3 = new erhb();
        erhbVar3.b(32);
        erhbVar3.c(32);
        erhbVar3.b = erhdVar;
        erhbVar3.a = erhcVar;
        map.put("HMAC_SHA256_256BITTAG_RAW", erhbVar3.a());
        erhb erhbVar4 = new erhb();
        erhbVar4.b(64);
        erhbVar4.c(16);
        erhbVar4.b = erhdVar2;
        erhc erhcVar2 = erhc.e;
        erhbVar4.a = erhcVar2;
        map.put("HMAC_SHA512_128BITTAG", erhbVar4.a());
        erhb erhbVar5 = new erhb();
        erhbVar5.b(64);
        erhbVar5.c(16);
        erhbVar5.b = erhdVar;
        erhbVar5.a = erhcVar2;
        map.put("HMAC_SHA512_128BITTAG_RAW", erhbVar5.a());
        erhb erhbVar6 = new erhb();
        erhbVar6.b(64);
        erhbVar6.c(32);
        erhbVar6.b = erhdVar2;
        erhbVar6.a = erhcVar2;
        map.put("HMAC_SHA512_256BITTAG", erhbVar6.a());
        erhb erhbVar7 = new erhb();
        erhbVar7.b(64);
        erhbVar7.c(32);
        erhbVar7.b = erhdVar;
        erhbVar7.a = erhcVar2;
        map.put("HMAC_SHA512_256BITTAG_RAW", erhbVar7.a());
        map.put("HMAC_SHA512_512BITTAG", erhr.b);
        erhb erhbVar8 = new erhb();
        erhbVar8.b(64);
        erhbVar8.c(64);
        erhbVar8.b = erhdVar;
        erhbVar8.a = erhcVar2;
        map.put("HMAC_SHA512_512BITTAG_RAW", erhbVar8.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map));
        eres eresVar = eres.a;
        eresVar.b(erha.e, erhe.class);
        ereu.a.a(erha.d, erhe.class);
        erec erecVar = erec.a;
        erecVar.d(erha.c, i, true);
        if (eqzb.a()) {
            return;
        }
        erer ererVar = ergn.a;
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        erfbVar.h(erhw.a);
        erfbVar.g(erhw.b);
        erfbVar.f(erhw.c);
        erfbVar.e(erhw.d);
        eresVar.b(ergn.a, ergq.class);
        ereyVar.b(ergn.b);
        ereyVar.b(ergn.c);
        HashMap map2 = new HashMap();
        ergq ergqVar = erhr.c;
        map2.put("AES_CMAC", ergqVar);
        map2.put("AES256_CMAC", ergqVar);
        ergo ergoVar = new ergo();
        ergoVar.b(32);
        ergoVar.c(16);
        ergoVar.a = ergp.d;
        map2.put("AES256_CMAC_RAW", ergoVar.a());
        erexVar.b(DesugarCollections.unmodifiableMap(map2));
        erecVar.c(ergn.d, true);
    }
}
