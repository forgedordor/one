package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erre implements eqsw {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final erdy c;
    public static final erdy d;
    public static final erdy e;
    private final ECPublicKey f;
    private final String g;
    private final eruy h;
    private final byte[] i;
    private final byte[] j;
    private final Provider k;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ervp.SHA256, erod.a, map, map2);
        erdx.b(ervp.SHA384, erod.b, map, map2);
        erdx.b(ervp.SHA512, erod.c, map, map2);
        c = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(eruy.IEEE_P1363, eroe.a, map3, map4);
        erdx.b(eruy.DER, eroe.b, map3, map4);
        d = erdx.a(map3, map4);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        erdx.b(erux.NIST_P256, eroc.a, map5, map6);
        erdx.b(erux.NIST_P384, eroc.b, map5, map6);
        erdx.b(erux.NIST_P521, eroc.c, map5, map6);
        e = erdx.a(map5, map6);
    }

    public erre(ECPublicKey eCPublicKey, ervp ervpVar, eruy eruyVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.g = erwj.b(ervpVar);
        this.f = eCPublicKey;
        this.h = eruyVar;
        this.i = bArr;
        this.j = bArr2;
        this.k = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(byte[] r14, byte[] r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erre.b(byte[], byte[]):void");
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.i;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ergh.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
