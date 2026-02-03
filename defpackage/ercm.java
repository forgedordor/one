package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercm implements eqsf {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    private final ercn c;
    private final ercj d;
    private final byte[] e;
    private final erci f;

    private ercm(erwn erwnVar, ercn ercnVar, erci erciVar, ercj ercjVar, erwn erwnVar2) {
        this.b = erwnVar.c();
        this.c = ercnVar;
        this.f = erciVar;
        this.d = ercjVar;
        this.e = erwnVar2.c();
    }

    public static eqsf b(erbb erbbVar) {
        eras erasVar = erbbVar.a;
        return new ercm(erbbVar.b, ercq.b(erasVar.a), ercq.c(erasVar.b), ercq.a(erasVar.c), erbbVar.c);
    }

    @Override // defpackage.eqsf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArr4 = this.b;
        ercn ercnVar = this.c;
        erci erciVar = this.f;
        ercj ercjVar = this.d;
        erco ercoVarA = ercnVar.a(bArr4);
        erck erckVarB = erck.b(ercv.a, ercoVarA.b, ercoVarA.a, ercnVar, erciVar, ercjVar, bArr3);
        byte[] bArr5 = erckVarB.c;
        byte[] bArr6 = this.e;
        int length = bArr6.length;
        int length2 = bArr5.length;
        byte[] bArr7 = a;
        byte[] bArrA = erckVarB.a();
        byte[] bArrD = erckVarB.a.d(erckVarB.b, bArrA, bArr, length + length2, bArr7);
        System.arraycopy(bArr6, 0, bArrD, 0, length);
        System.arraycopy(bArr5, 0, bArrD, length, length2);
        return bArrD;
    }
}
