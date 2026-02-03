package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erur implements eqse {
    private final ECPrivateKey a;
    private final erut b;
    private final String c;
    private final byte[] d;
    private final eruz e;
    private final erbz f;
    private final byte[] g;

    private erur(ECPrivateKey eCPrivateKey, byte[] bArr, String str, eruz eruzVar, erbz erbzVar, byte[] bArr2) {
        this.a = eCPrivateKey;
        this.b = new erut(eCPrivateKey);
        this.d = bArr;
        this.c = str;
        this.e = eruzVar;
        this.f = erbzVar;
        this.g = bArr2;
    }

    public static eqse b(eral eralVar) throws NoSuchAlgorithmException {
        ECPrivateKey eCPrivateKeyD = erva.d((erux) erus.a.a(eralVar.a().b), erdk.a(eralVar.b.a));
        byte[] bArrC = new byte[0];
        if (eralVar.a().g != null) {
            bArrC = eralVar.a().g.c();
        }
        return new erur(eCPrivateKeyD, bArrC, erus.c(eralVar.a().c), (eruz) erus.b.a(eralVar.a().d), erca.a(eralVar.a()), eralVar.g().c());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    @Override // defpackage.eqse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
        /*
            r10 = this;
            byte[] r0 = r10.g
            boolean r1 = defpackage.ergh.e(r0, r11)
            if (r1 == 0) goto L65
            java.security.interfaces.ECPrivateKey r1 = r10.a
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            eruz r2 = r10.e
            int r1 = defpackage.erva.a(r1)
            int r3 = r2.ordinal()
            r4 = 1
            if (r3 == 0) goto L2e
            if (r3 == r4) goto L2f
            r4 = 2
            if (r3 != r4) goto L26
            int r1 = r1 + r1
            goto L30
        L26:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "unknown EC point format"
            r11.<init>(r12)
            throw r11
        L2e:
            int r1 = r1 + r1
        L2f:
            int r1 = r1 + r4
        L30:
            int r0 = r0.length
            int r3 = r11.length
            int r1 = r1 + r0
            if (r3 < r1) goto L5d
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r0, r1)
            erut r0 = r10.b
            java.lang.String r6 = r10.c
            byte[] r7 = r10.d
            erbz r3 = r10.f
            int r9 = r3.a()
            java.security.interfaces.ECPrivateKey r0 = r0.a
            java.security.spec.ECParameterSpec r5 = r0.getParams()
            java.security.interfaces.ECPublicKey r2 = defpackage.erva.f(r5, r2, r4)
            byte[] r5 = defpackage.erva.i(r0, r2)
            r8 = r12
            byte[] r12 = defpackage.ervr.a(r4, r5, r6, r7, r8, r9)
            byte[] r11 = r3.b(r12, r11, r1)
            return r11
        L5d:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "ciphertext too short"
            r11.<init>(r12)
            throw r11
        L65:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "Invalid ciphertext (output prefix mismatch)"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erur.a(byte[], byte[]):byte[]");
    }
}
