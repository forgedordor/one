package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ercy implements ercn {
    private final erux a;
    private final erci b;

    private ercy(erci erciVar, erux eruxVar) {
        this.b = erciVar;
        this.a = eruxVar;
    }

    static ercy d(erux eruxVar) throws GeneralSecurityException {
        int iOrdinal = eruxVar.ordinal();
        if (iOrdinal == 0) {
            return new ercy(new erci("HmacSha256"), erux.NIST_P256);
        }
        if (iOrdinal == 1) {
            return new ercy(new erci("HmacSha384"), erux.NIST_P384);
        }
        if (iOrdinal == 2) {
            return new ercy(new erci("HmacSha512"), erux.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(String.valueOf(eruxVar))));
    }

    private final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = erup.b(bArr2, bArr3);
        byte[] bArrC = ercv.c(c());
        erci erciVar = this.b;
        return erciVar.e(bArr, bArrB, bArrC, erciVar.a());
    }

    @Override // defpackage.ercn
    public final erco a(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        erux eruxVar = this.a;
        KeyPair keyPairB = erva.b(eruxVar);
        eruz eruzVar = eruz.UNCOMPRESSED;
        byte[] bArrI = erva.i((ECPrivateKey) keyPairB.getPrivate(), erva.e(eruxVar, eruzVar, bArr));
        byte[] bArrJ = erva.j(eruxVar, eruzVar, ((ECPublicKey) keyPairB.getPublic()).getW());
        return new erco(e(bArrI, bArrJ, bArr), bArrJ);
    }

    @Override // defpackage.ercn
    public final byte[] b(byte[] bArr, ercp ercpVar) {
        erux eruxVar = this.a;
        return e(erva.i(erva.d(eruxVar, ercpVar.a.c()), erva.e(eruxVar, eruz.UNCOMPRESSED, bArr)), bArr, ercpVar.b.c());
    }

    @Override // defpackage.ercn
    public final byte[] c() throws GeneralSecurityException {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return ercv.c;
        }
        if (iOrdinal == 1) {
            return ercv.d;
        }
        if (iOrdinal == 2) {
            return ercv.e;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
