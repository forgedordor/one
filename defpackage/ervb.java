package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervb implements eqrz {
    private final ervs a;
    private final eqss b;
    private final int c;
    private final byte[] d;

    private ervb(ervs ervsVar, eqss eqssVar, int i, byte[] bArr) {
        this.a = ervsVar;
        this.b = eqssVar;
        this.c = i;
        this.d = bArr;
    }

    public static eqrz c(eqtl eqtlVar) {
        byte[] bArrD = eqtlVar.b.d();
        eqtt eqttVar = eqtlVar.a;
        eruf erufVar = new eruf(bArrD, eqttVar.c);
        String strValueOf = String.valueOf(String.valueOf(eqttVar.f));
        ervx ervxVar = new ervx("HMAC".concat(strValueOf), new SecretKeySpec(eqtlVar.c.d(), "HMAC"));
        int i = eqttVar.d;
        return new ervb(erufVar, new ervy(ervxVar, i), i, eqtlVar.d.c());
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr.length;
        int i = this.c;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(((ervy) this.b).a(erup.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        ervs ervsVar = this.a;
        int length3 = bArrCopyOfRange.length;
        eruf erufVar = (eruf) ervsVar;
        int i3 = erufVar.a;
        if (length3 < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i3);
        int i4 = length3 - i3;
        byte[] bArr5 = new byte[i4];
        erufVar.a(bArrCopyOfRange, i3, i4, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        eruf erufVar = (eruf) this.a;
        int i = erufVar.a;
        int length = bArr.length;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY - i;
        if (length > i2) {
            throw new GeneralSecurityException(a.g(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[i + length];
        byte[] bArrB = erfy.b(i);
        System.arraycopy(bArrB, 0, bArr3, 0, i);
        erufVar.a(bArr, 0, length, bArr3, i, bArrB, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return erup.b(this.d, bArr3, this.b.a(erup.b(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
