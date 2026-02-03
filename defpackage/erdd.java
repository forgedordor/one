package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erdd implements ercn {
    private final erci a;
    private final erda b;

    public erdd(erci erciVar) throws GeneralSecurityException {
        erda erdcVar;
        Provider providerA;
        this.a = erciVar;
        try {
            int i = erdb.b;
            providerA = erdl.a();
        } catch (GeneralSecurityException unused) {
            erdcVar = new erdc();
        }
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt is not available.");
        }
        KeyFactory.getInstance("XDH", providerA);
        KeyAgreement.getInstance("XDH", providerA);
        erdcVar = new erdb(providerA);
        erdcVar.a();
        this.b = erdcVar;
    }

    private final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = erup.b(bArr2, bArr3);
        byte[] bArrC = ercv.c(ercv.b);
        erci erciVar = this.a;
        return erciVar.e(bArr, bArrB, bArrC, erciVar.a());
    }

    @Override // defpackage.ercn
    public final erco a(byte[] bArr) {
        erda erdaVar = this.b;
        ercz erczVarA = erdaVar.a();
        byte[] bArr2 = erczVarA.a;
        byte[] bArr3 = erczVarA.b;
        return new erco(d(erdaVar.b(bArr2, bArr), bArr3, bArr), bArr3);
    }

    @Override // defpackage.ercn
    public final byte[] b(byte[] bArr, ercp ercpVar) {
        return d(this.b.b(ercpVar.a.c(), bArr), bArr, ercpVar.b.c());
    }

    @Override // defpackage.ercn
    public final byte[] c() throws GeneralSecurityException {
        if (Arrays.equals(this.a.b(), ercv.f)) {
            return ercv.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
