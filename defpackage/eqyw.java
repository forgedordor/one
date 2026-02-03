package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqyw extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) ervg.a.a("AES/GCM-SIV/NoPadding");
            if (eqxm.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
