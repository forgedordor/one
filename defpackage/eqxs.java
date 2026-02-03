package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqxs extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) ervg.a.a("ChaCha20-Poly1305");
            if (eqxt.e(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
