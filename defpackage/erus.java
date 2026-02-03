package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erus implements eqsf {
    static final erdy a;
    static final erdy b;
    private final eruu c;
    private final String d;
    private final byte[] e;
    private final eruz f;
    private final erbz g;
    private final byte[] h;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(erux.NIST_P256, erag.a, map, map2);
        erdx.b(erux.NIST_P384, erag.b, map, map2);
        erdx.b(erux.NIST_P521, erag.c, map, map2);
        a = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(eruz.UNCOMPRESSED, erai.b, map3, map4);
        erdx.b(eruz.COMPRESSED, erai.a, map3, map4);
        erdx.b(eruz.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, erai.c, map3, map4);
        b = erdx.a(map3, map4);
    }

    private erus(ECPublicKey eCPublicKey, byte[] bArr, String str, eruz eruzVar, erbz erbzVar, byte[] bArr2) throws GeneralSecurityException {
        erdw.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.c = new eruu(eCPublicKey);
        this.e = bArr;
        this.d = str;
        this.f = eruzVar;
        this.g = erbzVar;
        this.h = bArr2;
    }

    public static eqsf b(eram eramVar) throws GeneralSecurityException {
        erak erakVar = eramVar.a;
        erux eruxVar = (erux) a.a(erakVar.b);
        ECPoint eCPoint = eramVar.b;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        ECParameterSpec eCParameterSpecG = erva.g(eruxVar);
        ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        erdw.f(eCPoint2, eCParameterSpecG.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) ervg.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecG));
        erwn erwnVar = erakVar.g;
        byte[] bArrC = new byte[0];
        if (erwnVar != null) {
            bArrC = erwnVar.c();
        }
        return new erus(eCPublicKey, bArrC, c(erakVar.c), (eruz) b.a(erakVar.d), erca.a(erakVar), eramVar.d.c());
    }

    static final String c(erah erahVar) throws GeneralSecurityException {
        if (erahVar.equals(erah.a)) {
            return "HmacSha1";
        }
        if (erahVar.equals(erah.b)) {
            return "HmacSha224";
        }
        if (erahVar.equals(erah.c)) {
            return "HmacSha256";
        }
        if (erahVar.equals(erah.d)) {
            return "HmacSha384";
        }
        if (erahVar.equals(erah.e)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(String.valueOf(erahVar))));
    }

    @Override // defpackage.eqsf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        ECPublicKey eCPublicKey = this.c.a;
        erbz erbzVar = this.g;
        int iA = erbzVar.a();
        KeyPair keyPairC = erva.c(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) keyPairC.getPublic();
        byte[] bArrI = erva.i((ECPrivateKey) keyPairC.getPrivate(), eCPublicKey);
        byte[] bArrK = erva.k(eCPublicKey2.getParams().getCurve(), this.f, eCPublicKey2.getW());
        byte[] bArrA = ervr.a(bArrK, bArrI, this.d, this.e, bArr2, iA);
        erwn erwnVarB = erwn.b(bArrK);
        return erbzVar.c(erwn.b(bArrA).c(), this.h, erwnVarB.c(), bArr);
    }
}
