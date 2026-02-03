package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erbo implements eqsf {
    private final erbn a;

    public erbo(erbn erbnVar) {
        this.a = erbnVar;
    }

    @Override // defpackage.eqsf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        eqsf eqsfVar = this.a.a;
        if (eqsfVar == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        byte[] bArrA = eqsfVar.a(bArr, bArr2);
        int length = bArr.length;
        return bArrA;
    }
}
