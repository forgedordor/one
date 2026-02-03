package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffku {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(PKCSObjectIdentifiers.q, "MD2");
        map.put(PKCSObjectIdentifiers.r, "MD4");
        map.put(PKCSObjectIdentifiers.s, "MD5");
        map.put(ffjn.a, "SHA-1");
        map.put(NISTObjectIdentifiers.f, "SHA-224");
        map.put(NISTObjectIdentifiers.c, "SHA-256");
        map.put(NISTObjectIdentifiers.d, "SHA-384");
        map.put(NISTObjectIdentifiers.e, "SHA-512");
        map.put(NISTObjectIdentifiers.g, "SHA-512(224)");
        map.put(NISTObjectIdentifiers.h, "SHA-512(256)");
        map.put(TeleTrusTObjectIdentifiers.c, "RIPEMD-128");
        map.put(TeleTrusTObjectIdentifiers.b, "RIPEMD-160");
        map.put(TeleTrusTObjectIdentifiers.d, "RIPEMD-128");
        map.put(ffji.d, "RIPEMD-128");
        map.put(ffji.c, "RIPEMD-160");
        map.put(CryptoProObjectIdentifiers.b, "GOST3411");
        map.put(ffjg.a, "Tiger");
        map.put(ffji.e, "Whirlpool");
        map.put(NISTObjectIdentifiers.i, "SHA3-224");
        map.put(NISTObjectIdentifiers.j, "SHA3-256");
        map.put(NISTObjectIdentifiers.k, "SHA3-384");
        map.put(NISTObjectIdentifiers.l, "SHA3-512");
        map.put(NISTObjectIdentifiers.m, "SHAKE128");
        map.put(NISTObjectIdentifiers.n, "SHAKE256");
        map.put(GMObjectIdentifiers.f, "SM3");
        map.put(ffjj.l, "BLAKE3-256");
        map2.put("SHA-1", new AlgorithmIdentifier(ffjn.a, DERNull.a));
        map2.put("SHA-224", new AlgorithmIdentifier(NISTObjectIdentifiers.f));
        map2.put("SHA224", new AlgorithmIdentifier(NISTObjectIdentifiers.f));
        map2.put("SHA-256", new AlgorithmIdentifier(NISTObjectIdentifiers.c));
        map2.put("SHA256", new AlgorithmIdentifier(NISTObjectIdentifiers.c));
        map2.put("SHA-384", new AlgorithmIdentifier(NISTObjectIdentifiers.d));
        map2.put("SHA384", new AlgorithmIdentifier(NISTObjectIdentifiers.d));
        map2.put("SHA-512", new AlgorithmIdentifier(NISTObjectIdentifiers.e));
        map2.put("SHA512", new AlgorithmIdentifier(NISTObjectIdentifiers.e));
        map2.put("SHA3-224", new AlgorithmIdentifier(NISTObjectIdentifiers.i));
        map2.put("SHA3-256", new AlgorithmIdentifier(NISTObjectIdentifiers.j));
        map2.put("SHA3-384", new AlgorithmIdentifier(NISTObjectIdentifiers.k));
        map2.put("SHA3-512", new AlgorithmIdentifier(NISTObjectIdentifiers.l));
        map2.put("BLAKE3-256", new AlgorithmIdentifier(ffjj.l));
    }
}
