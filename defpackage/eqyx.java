package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyx implements eqrz {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new eqyw();

    public static Cipher c() {
        try {
            Cipher cipher = (Cipher) b.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
