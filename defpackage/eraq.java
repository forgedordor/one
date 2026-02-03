package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eraq extends erao {
    public static final eraq a = new eraq("DHKEM_P256_HKDF_SHA256", 16);
    public static final eraq b = new eraq("DHKEM_P384_HKDF_SHA384", 17);
    public static final eraq c = new eraq("DHKEM_P521_HKDF_SHA512", 18);
    public static final eraq f = new eraq("DHKEM_X25519_HKDF_SHA256", 32);

    private eraq(String str, int i) {
        super(str, i);
    }
}
