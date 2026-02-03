package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqti implements eqrz {
    private final eqth a;
    private final erfm b;

    public eqti(eqth eqthVar, erfm erfmVar) {
        this.a = eqthVar;
        this.b = erfmVar;
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (eqth eqthVar : this.b.a(bArr)) {
            try {
                byte[] bArrA = eqthVar.a.a(bArr, null);
                int i = eqthVar.b;
                int length = bArr.length;
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrB = this.a.a.b(bArr, null);
        int length = bArr.length;
        return bArrB;
    }
}
