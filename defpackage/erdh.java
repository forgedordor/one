package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdh {
    public static KeyStore a() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
