package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class digc {
    public static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule");

    public static Optional a(Context context) {
        Signature[] signingCertificateHistory;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return Optional.empty();
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingCertificateHistory = packageManager.getPackageInfo(packageName, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS).signingInfo.getSigningCertificateHistory();
            } else {
                signingCertificateHistory = packageManager.getPackageInfo(packageName, 64).signatures;
                if (signingCertificateHistory.length > 1) {
                    ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", 129, "RpcModule.java")).q("Client not signed with exactly one certificate are forbidden.");
                    return Optional.empty();
                }
            }
            if (signingCertificateHistory != null && signingCertificateHistory.length != 0) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signingCertificateHistory[0].toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                return Optional.of(sb.toString());
            }
            ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", 134, "RpcModule.java")).q("Error reading signatures for packages");
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", (char) 141, "RpcModule.java")).q("Error getting package info: ");
            return Optional.empty();
        } catch (NoSuchAlgorithmException e2) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e2)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", (char) 144, "RpcModule.java")).q("Error getting messageDigest: ");
            return Optional.empty();
        }
    }
}
