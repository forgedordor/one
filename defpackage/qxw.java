package defpackage;

import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxw extends qxx {
    private final byte[] a;

    public qxw(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.qxx, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
