package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errp implements eqsw {
    private final eqsw a;
    private final byte[] b;
    private final byte[] c;

    public errp(eqsw eqswVar, byte[] bArr, byte[] bArr2) {
        this.a = eqswVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static byte[] b(erfv erfvVar) {
        return erfvVar.d.equals(ermy.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] c(erfv erfvVar) throws GeneralSecurityException {
        int iOrdinal = erfvVar.d.ordinal();
        if (iOrdinal == 1) {
            return erfc.b(erfvVar.e.intValue()).c();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return erfc.a.c();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return erfc.a(erfvVar.e.intValue()).c();
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0 && this.c.length == 0) {
            this.a.a(bArr, bArr2);
        } else {
            if (!ergh.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.c;
            if (bArr4.length != 0) {
                bArr2 = erup.b(bArr2, bArr4);
            }
            this.a.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
