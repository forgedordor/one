package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import internal.J.N;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.net.X509Util;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgad extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
            if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                N.MJdorYDE();
                return;
            } else {
                if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    return;
                }
                N.MJdorYDE();
                return;
            }
        }
        try {
            X509Util.reloadDefaultTrustManager();
        } catch (KeyStoreException e) {
            ffyc.d("X509Util", "Unable to reload the default TrustManager", e);
        } catch (NoSuchAlgorithmException e2) {
            ffyc.d("X509Util", "Unable to reload the default TrustManager", e2);
        } catch (CertificateException e3) {
            ffyc.d("X509Util", "Unable to reload the default TrustManager", e3);
        }
    }
}
