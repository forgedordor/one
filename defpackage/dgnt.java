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
public final class dgnt {
    public final dcdt a;
    public final cebq b;
    public final cebf c;
    public final dflk d;
    public final dgjq e;

    public dgnt(dcdt dcdtVar, cebq cebqVar, cebf cebfVar, dgjq dgjqVar, dflk dflkVar) {
        this.a = dcdtVar;
        this.b = cebqVar;
        this.c = cebfVar;
        this.e = dgjqVar;
        this.d = dflkVar;
    }

    public static Optional a(Context context) {
        try {
            Signature[] signingCertificateHistory = Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(context.getPackageName(), VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS).signingInfo.getSigningCertificateHistory() : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signingCertificateHistory != null && signingCertificateHistory.length != 0) {
                return Optional.of(eldz.e.j(MessageDigest.getInstance("SHA1").digest(signingCertificateHistory[0].toByteArray())));
            }
            dhja.q("Package signatures were not found.", new Object[0]);
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            dhja.q("Error getting certificate hash.", new Object[0]);
            return Optional.empty();
        }
    }
}
