package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercw implements eqse {
    private final eqse a;
    private final byte[] b;

    public ercw(eqse eqseVar, byte[] bArr) {
        this.a = eqseVar;
        this.b = bArr;
    }

    @Override // defpackage.eqse
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.a.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
