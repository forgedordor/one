package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erps implements eqsw {
    private final erfm a;

    public erps(erfm erfmVar) {
        this.a = erfmVar;
    }

    @Override // defpackage.eqsw
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (erpr erprVar : this.a.a(bArr)) {
            try {
                erprVar.a.a(bArr, bArr2);
                int i = erprVar.b;
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
