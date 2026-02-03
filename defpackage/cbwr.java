package defpackage;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwr {
    public static final ccio a(epvr epvrVar) {
        Object objA;
        epvrVar.getClass();
        cbwp.a();
        if (epvrVar == epvr.CIPHER_SUITE_P256_AES128) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.getClass();
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            keyPairGenerateKeyPair.getClass();
            evqs evqsVarX = evqs.x(keyPairGenerateKeyPair.getPublic().getEncoded());
            PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
            if (!(privateKey instanceof ECPrivateKey)) {
                throw new IllegalArgumentException("Not an ECPrivateKey");
            }
            byte[] byteArray = ((ECPrivateKey) privateKey).getS().toByteArray();
            byteArray.getClass();
            int length = byteArray.length;
            if (length < 32) {
                byte[] bArr = new byte[32];
                System.arraycopy(byteArray, 0, bArr, 32 - length, length);
                byteArray = bArr;
            } else if (length > 32) {
                byteArray = Arrays.copyOfRange(byteArray, length - 32, length);
                byteArray.getClass();
            }
            return new ccio(evqsVarX, evqs.x(byteArray));
        }
        eqap eqapVar = eqao.a;
        epzp epzpVarZinnia_SignatureKeyPairs_generate = eqao.a.Zinnia_SignatureKeyPairs_generate(epvrVar.a());
        if (epzpVarZinnia_SignatureKeyPairs_generate.isOk == 1) {
            eqam eqamVar = new eqam(epzpVarZinnia_SignatureKeyPairs_generate.union.ok);
            eqamVar.a();
            objA = eqamVar;
        } else {
            eqbs eqbsVar = new eqbs(epzpVarZinnia_SignatureKeyPairs_generate.union.err);
            eqbsVar.b();
            objA = fctl.a(eqbsVar);
        }
        fctl.b(objA);
        byte[] bArrB = ((eqam) objA).b();
        byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
        bArrCopyOf.getClass();
        epwn epwnVar = (epwn) evsn.parseFrom(epwn.a, bArrCopyOf);
        epwnVar.getClass();
        evqs evqsVar = epwnVar.d;
        evqsVar.getClass();
        evqs evqsVar2 = epwnVar.e;
        evqsVar2.getClass();
        return new ccio(evqsVar, evqsVar2);
    }

    public static final int b(epvr epvrVar) {
        int iOrdinal = epvrVar.ordinal();
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        Objects.toString(epvrVar);
        throw new IllegalStateException("Unknown cipher suite:".concat(epvrVar.toString()));
    }
}
