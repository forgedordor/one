package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffla extends Provider {
    public static final Map b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final ffie[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final Map l;
    public static final Logger a = Logger.getLogger(ffla.class.getName());
    private static final String m = "BouncyCastle Security Provider v1.78.1";

    static {
        int i2 = fflb.a;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        b = new HashMap();
        c = ffkq.a(ffla.class, "java.security.cert.PKIXRevocationChecker");
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f = new ffie[]{new ffkz("AES"), new ffkz("ARC4"), new ffkz("ARIA"), new ffkz("Blowfish"), new ffkz("Camellia"), new ffkz("CAST5"), new ffkz("CAST6"), new ffkz("ChaCha"), new ffkz("DES"), new ffkz("DESede"), new ffkz("GOST28147"), new ffkz("Grainv1"), new ffkz("Grain128"), new ffkz("HC128"), new ffkz("HC256"), new ffkz("IDEA"), new ffkz("Noekeon"), new ffkz("RC2"), new ffkz("RC5"), new ffkz("RC6"), new ffkz("Rijndael"), new ffkz("Salsa20"), new ffkz("SEED"), new ffkz("Serpent"), new ffkz("Shacal2"), new ffkz("Skipjack"), new ffkz("SM4"), new ffkz("TEA"), new ffkz("Twofish"), new ffkz("Threefish"), new ffkz("VMPC"), new ffkz("VMPCKSA3"), new ffkz("XTEA"), new ffkz("XSalsa20"), new ffkz("OpenSSLPBKDF"), new ffkz("DSTU7624"), new ffkz("GOST3412_2015"), new ffkz("Zuc")};
        g = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        h = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        i = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        j = new String[]{"BC", "BCFKS", "PKCS12"};
        k = new String[]{"DRBG"};
    }

    public ffla() {
        super("BC", 1.7801d, m);
        this.l = new ConcurrentHashMap();
        AccessController.doPrivileged(new ffkx(this));
    }

    public static final void d(ASN1ObjectIdentifier aSN1ObjectIdentifier, ffks ffksVar) {
        Map map = b;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, ffksVar);
        }
    }

    public static final void e(String str, String str2) {
        Class clsA = ffkq.a(ffla.class, str + str2 + "$Mappings");
        if (clsA != null) {
            try {
                ((ffkr) clsA.newInstance()).a();
            } catch (Exception e2) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2.toString());
            }
        }
    }

    public static final void f(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String strQ = a.q(ffwu.c(str2), str, ".");
        Provider.Service service2 = (Provider.Service) this.l.get(strQ);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            Map map = this.l;
            service = !map.containsKey(strQ) ? (Provider.Service) AccessController.doPrivileged(new ffky(this, str, str2, strQ)) : (Provider.Service) map.get(strQ);
        }
        return service;
    }
}
