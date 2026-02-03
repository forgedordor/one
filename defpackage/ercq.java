package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercq {
    public static ercj a(eran eranVar) {
        if (eranVar == eran.a) {
            return new erbu(16);
        }
        if (eranVar == eran.b) {
            return new erbu(32);
        }
        if (eranVar == eran.c) {
            return new erbv();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static ercn b(eraq eraqVar) {
        if (eraqVar == eraq.f) {
            return new erdd(new erci("HmacSha256"));
        }
        if (eraqVar == eraq.a) {
            return ercy.d(erux.NIST_P256);
        }
        if (eraqVar == eraq.b) {
            return ercy.d(erux.NIST_P384);
        }
        if (eraqVar == eraq.c) {
            return ercy.d(erux.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static erci c(erap erapVar) {
        if (erapVar == erap.a) {
            return new erci("HmacSha256");
        }
        if (erapVar == erap.b) {
            return new erci("HmacSha384");
        }
        if (erapVar == erap.c) {
            return new erci("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
