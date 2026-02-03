package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvji implements fbni {
    public static final fbrb a;
    public final ejxr b;

    static {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        a = new fbqw("X-Goog-Api-Key", fbqxVar);
        new fbqw("X-Android-Cert", fbrg.c);
        new fbqw("X-Android-Package", fbrg.c);
    }

    public dvji(final Context context) {
        this.b = ejxx.a(new ejxr() { // from class: dvjf
            @Override // defpackage.ejxr
            public final Object get() {
                fbrb fbrbVar = dvji.a;
                return context.getPackageName();
            }
        });
        ejxx.a(new ejxr() { // from class: dvjg
            @Override // defpackage.ejxr
            public final Object get() throws PackageManager.NameNotFoundException {
                MessageDigest messageDigestA;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo((String) this.a.b.get(), 64);
                    byte[] bArrDigest = (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (messageDigestA = dvje.a()) == null) ? null : messageDigestA.digest(packageInfo.signatures[0].toByteArray());
                    if (bArrDigest == null) {
                        return null;
                    }
                    char[] cArr = dvjr.a;
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i = 0; i < length; i++) {
                        char[] cArr2 = dvjr.a;
                        sb.append(cArr2[(bArrDigest[i] & 240) >>> 4]);
                        sb.append(cArr2[bArrDigest[i] & 15]);
                    }
                    return sb.toString();
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            }
        });
    }

    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        return new dvjh(fbndVar.a(fbrkVar, fbncVar));
    }
}
