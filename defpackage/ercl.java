package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercl implements eqse {
    private static final byte[] a = new byte[0];
    private final ercp b;
    private final ercn c;
    private final ercj d;
    private final int e;
    private final byte[] f;
    private final erci g;

    private ercl(ercp ercpVar, ercn ercnVar, erci erciVar, ercj ercjVar, int i, erwn erwnVar) {
        this.b = ercpVar;
        this.c = ercnVar;
        this.g = erciVar;
        this.d = ercjVar;
        this.e = i;
        this.f = erwnVar.c();
    }

    public static eqse b(erat eratVar) throws GeneralSecurityException {
        int i;
        eras erasVarA = eratVar.a();
        eraq eraqVar = erasVarA.a;
        ercn ercnVarB = ercq.b(eraqVar);
        erci erciVarC = ercq.c(erasVarA.b);
        ercj ercjVarA = ercq.a(erasVarA.c);
        eraq eraqVar2 = eraq.f;
        if (eraqVar.equals(eraqVar2)) {
            i = 32;
        } else if (eraqVar.equals(eraq.a)) {
            i = 65;
        } else if (eraqVar.equals(eraq.b)) {
            i = 97;
        } else {
            if (!eraqVar.equals(eraq.c)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        int i2 = i;
        eraq eraqVar3 = eratVar.a().a;
        if (eraqVar3.equals(eraqVar2) || eraqVar3.equals(eraq.a) || eraqVar3.equals(eraq.b) || eraqVar3.equals(eraq.c)) {
            return new ercl(new ercp(erwn.b(eratVar.b.d()), eratVar.a.b), ercnVarB, erciVarC, ercjVarA, i2, eratVar.g());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // defpackage.eqse
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f;
        int length2 = bArr3.length;
        int i = this.e + length2;
        if (length < i) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!ergh.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i);
        ercp ercpVar = this.b;
        ercn ercnVar = this.c;
        erck erckVarB = erck.b(ercv.a, bArrCopyOfRange, ercnVar.b(bArrCopyOfRange, ercpVar), ercnVar, this.g, this.d, bArr4);
        return erckVarB.a.c(erckVarB.b, erckVarB.a(), bArr, i, a);
    }
}
