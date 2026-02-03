package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyi implements eqrz {
    private final eqrz a;
    private final byte[] b;

    public eqyi(eqrz eqrzVar, byte[] bArr) {
        this.a = eqrzVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static eqrz c(eqrz eqrzVar, erwn erwnVar) {
        return new eqyi(eqrzVar, erwnVar.c());
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, null);
        }
        if (ergh.e(bArr3, bArr)) {
            return this.a.a(Arrays.copyOfRange(bArr, 5, bArr.length), null);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.a.b(bArr, null) : erup.b(bArr3, this.a.b(bArr, null));
    }
}
