package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epvr implements evst {
    CIPHER_SUITE_UNKNOWN(0),
    CIPHER_SUITE_CURVE25519_AES128(1),
    CIPHER_SUITE_P256_AES128(2),
    CIPHER_SUITE_P521_AES256(5),
    CIPHER_SUITE_P384_AES256(7),
    UNRECOGNIZED(-1);

    private final int h;

    epvr(int i) {
        this.h = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
