package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erat extends erbs {
    public final erbb a;
    public final erwp b;

    private erat(erbb erbbVar, erwp erwpVar) {
        this.a = erbbVar;
        this.b = erwpVar;
    }

    public static erat e(erbb erbbVar, erwp erwpVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        int iA = erwpVar.a();
        eraq eraqVar = erbbVar.a.a;
        String str = "Encoded private key byte length for " + eraqVar.toString() + " must be %d, not " + iA;
        eraq eraqVar2 = eraq.a;
        if (eraqVar == eraqVar2) {
            if (iA != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (eraqVar == eraq.b) {
            if (iA != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (eraqVar == eraq.c) {
            if (iA != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (eraqVar != eraq.f) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(eraqVar.toString()));
            }
            if (iA != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] bArrC = erbbVar.b.c();
        byte[] bArrD = erwpVar.d();
        if (eraqVar == eraqVar2 || eraqVar == eraq.b || eraqVar == eraq.c) {
            if (eraqVar == eraqVar2) {
                eCParameterSpec = erdw.a;
            } else if (eraqVar == eraq.b) {
                eCParameterSpec = erdw.b;
            } else {
                if (eraqVar != eraq.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(eraqVar.toString()));
                }
                eCParameterSpec = erdw.c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigInteger = new BigInteger(1, bArrD);
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!erdw.e(bigInteger, eCParameterSpec).equals(erva.h(eCParameterSpec.getCurve(), eruz.UNCOMPRESSED, bArrC))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (eraqVar != eraq.f) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(eraqVar.toString()));
            }
            if (!Arrays.equals(erwl.c(bArrD), bArrC)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new erat(erbbVar, erwpVar);
    }

    @Override // defpackage.erbs, defpackage.eqsu
    public final /* synthetic */ eqsg c() {
        return this.a;
    }

    @Override // defpackage.erbs, defpackage.eqsg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eras a() {
        return this.a.a;
    }

    @Override // defpackage.erbs
    public final /* synthetic */ erbt f() {
        return this.a;
    }
}
