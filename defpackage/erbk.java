package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erbk implements eqse {
    private final erfm a;

    public erbk(erfm erfmVar) {
        this.a = erfmVar;
    }

    @Override // defpackage.eqse
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (erbj erbjVar : this.a.a(bArr)) {
            try {
                byte[] bArrA = erbjVar.a.a(bArr, bArr2);
                int i = erbjVar.b;
                int length = bArr.length;
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
