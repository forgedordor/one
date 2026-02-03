package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import defpackage.ffxu;
import defpackage.ffyc;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ApkAssets {
    private static String a;

    public static long[] open(String str, String str2) throws IOException {
        long[] jArr;
        AssetFileDescriptor assetFileDescriptorOpenNonAssetFd = null;
        a = null;
        try {
            try {
                Context contextA = ffxu.a;
                if (!TextUtils.isEmpty(str2) && BundleUtils.c(str2)) {
                    contextA = BundleUtils.a(str2);
                }
                assetFileDescriptorOpenNonAssetFd = contextA.getAssets().openNonAssetFd(str);
                jArr = new long[]{assetFileDescriptorOpenNonAssetFd.getParcelFileDescriptor().detachFd(), assetFileDescriptorOpenNonAssetFd.getStartOffset(), assetFileDescriptorOpenNonAssetFd.getLength()};
            } finally {
                if (assetFileDescriptorOpenNonAssetFd != null) {
                    try {
                        assetFileDescriptorOpenNonAssetFd.close();
                    } catch (IOException e) {
                        ffyc.d("ApkAssets", "Unable to close AssetFileDescriptor", e);
                    }
                }
            }
        } catch (IOException e2) {
            a = "Error while loading asset " + str + " from " + str2 + ": " + e2.toString();
            if (!TextUtils.isEmpty(e2.getMessage()) && !e2.getMessage().equals(str)) {
                ffyc.c("ApkAssets", a);
            }
            jArr = new long[]{-1, -1, -1};
        }
        return jArr;
    }

    private static String takeLastErrorString() {
        String str = a;
        a = null;
        return str;
    }
}
