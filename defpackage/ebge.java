package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ebge implements ebgf {
    public final /* synthetic */ KeyStore a;
    public final /* synthetic */ String b;

    public /* synthetic */ ebge(KeyStore keyStore, String str) {
        this.a = keyStore;
        this.b = str;
    }

    @Override // defpackage.ebgf
    public final SSLContext a() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, KeyManagementException {
        KeyManager[] keyManagers;
        char[] cArr = ebga.a;
        KeyStore keyStore = this.a;
        try {
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
            keyManagerFactory.init(keyStore, ebga.a);
            dhja.c("Returning key managers for %s", defaultAlgorithm);
            keyManagers = keyManagerFactory.getKeyManagers();
        } catch (Exception e) {
            dhja.i(e, "Error while creating key managers: %s", e.getMessage());
            keyManagers = null;
        }
        if (keyManagers == null) {
            throw new IOException("Key managers could not be created!");
        }
        String str = this.b;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        if (TextUtils.isEmpty(str)) {
            dhja.q("No fingerprint, using default trust manager", new Object[0]);
            sSLContext.init(keyManagers, null, null);
        } else {
            sSLContext.init(keyManagers, new TrustManager[]{new ebfy(str)}, null);
        }
        return sSLContext;
    }
}
