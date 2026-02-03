package org.chromium.base;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import defpackage.ffxr;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.ffyg;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class BuildInfo {
    private String a;
    private final Object b = new Object();

    public BuildInfo() {
        String str = ApkInfo.a().a;
        String str2 = ApkInfo.a().b;
        long j = ApkInfo.a().c;
        String str3 = ApkInfo.a().f;
        String str4 = ApkInfo.a().d;
        String str5 = ApkInfo.a().e;
        TextUtils.join(", ", Build.SUPPORTED_ABIS);
        AndroidInfo.a();
        String str6 = ApkInfo.a().g;
        DeviceInfo.e();
        DeviceInfo.b();
        DeviceInfo.d();
        DeviceInfo.c();
        DeviceInfo.a();
    }

    private static String lazyGetHostSigningCertSha256() {
        return ffxr.a.a();
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            if (this.a == null) {
                String string = "";
                PackageInfo packageInfoA = ffyg.a(ffxu.a.getPackageName(), Build.VERSION.SDK_INT >= 28 ? VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS : 64);
                Signature[] signingCertificateHistory = Build.VERSION.SDK_INT >= 28 ? packageInfoA.signingInfo == null ? null : packageInfoA.signingInfo.getSigningCertificateHistory() : packageInfoA.signatures;
                if (signingCertificateHistory != null) {
                    try {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signingCertificateHistory[signingCertificateHistory.length - 1].toByteArray());
                        StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
                        int i = 0;
                        while (true) {
                            int length = bArrDigest.length;
                            if (i >= length) {
                                break;
                            }
                            char[] cArr = ffyg.a;
                            sb.append(cArr[(bArrDigest[i] & 240) >>> 4]);
                            sb.append(cArr[bArrDigest[i] & 15]);
                            if (i < length - 1) {
                                sb.append(':');
                            }
                            i++;
                        }
                        string = sb.toString();
                    } catch (NoSuchAlgorithmException e) {
                        ffyc.j("BuildInfo", "Unable to hash host app signature", e);
                    }
                }
                this.a = string;
                str = this.a;
            } else {
                str = this.a;
            }
        }
        return str;
    }
}
