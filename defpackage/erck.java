package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erck {
    private static final byte[] d = new byte[0];
    public final ercj a;
    public final byte[] b;
    public final byte[] c;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    private erck(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, ercj ercjVar) {
        this.c = bArr;
        this.b = bArr2;
        this.f = bArr3;
        this.e = bigInteger;
        this.a = ercjVar;
    }

    static erck b(byte[] bArr, byte[] bArr2, byte[] bArr3, ercn ercnVar, erci erciVar, ercj ercjVar, byte[] bArr4) throws GeneralSecurityException {
        byte[] bArrC = ercnVar.c();
        byte[] bArrB = erciVar.b();
        byte[] bArrB2 = ercjVar.b();
        byte[] bArr5 = ercv.a;
        byte[] bArrB3 = erup.b(ercv.m, bArrC, bArrB, bArrB2);
        byte[] bArr6 = ercv.l;
        byte[] bArr7 = d;
        byte[] bArrB4 = erup.b(bArr, erciVar.d(bArr6, bArr7, "psk_id_hash", bArrB3), erciVar.d(bArr6, bArr4, "info_hash", bArrB3));
        byte[] bArrD = erciVar.d(bArr3, bArr7, "secret", bArrB3);
        return new erck(bArr2, erciVar.c(bArrD, bArrB4, "key", bArrB3, ercjVar.a()), erciVar.c(bArrD, bArrB4, "base_nonce", bArrB3, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), ercjVar);
    }

    public final synchronized byte[] a() {
        byte[] bArrC;
        bArrC = erup.c(this.f, erdk.b(this.g, 12));
        if (this.g.compareTo(this.e) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.g = this.g.add(BigInteger.ONE);
        return bArrC;
    }
}
