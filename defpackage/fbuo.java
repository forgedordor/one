package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.android.vcard.VCardConfig;
import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbuo extends fbur {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ String b;
    final /* synthetic */ ekgb c;

    public fbuo(PackageManager packageManager, String str, ekgb ekgbVar) {
        this.a = packageManager;
        this.b = str;
        this.c = ekgbVar;
    }

    @Override // defpackage.fbur
    public final Status a(int i) throws PackageManager.NameNotFoundException {
        int i2 = fbuq.a;
        PackageManager packageManager = this.a;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            return Status.j.withDescription("Rejected by (SHA-256 hash signature check) security policy");
        }
        boolean z = false;
        for (String str : packagesForUid) {
            if (this.b.equals(str)) {
                final ekgb ekgbVar = this.c;
                ejwm ejwmVar = new ejwm() { // from class: fbum
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj) {
                        int i3 = fbuq.a;
                        int i4 = elcz.a;
                        byte[] bArrE = elcx.a.b(((Signature) obj).toByteArray()).e();
                        ekqh it = ekgbVar.iterator();
                        while (it.hasNext()) {
                            if (Arrays.equals((byte[]) it.next(), bArrE)) {
                                return true;
                            }
                        }
                        return false;
                    }
                };
                z = true;
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                        if (packageInfo.signingInfo != null) {
                            for (Signature signature : packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory()) {
                                if (ejwmVar.a(signature)) {
                                    return Status.b;
                                }
                            }
                        }
                    } else {
                        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                        if (packageInfo2.signatures != null && packageInfo2.signatures.length == 1 && ejwmVar.a(packageInfo2.signatures[0])) {
                            return Status.b;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    continue;
                }
            }
        }
        return Status.i.withDescription("Rejected by (SHA-256 hash signature check) security policy. Package name matched: " + z);
    }
}
