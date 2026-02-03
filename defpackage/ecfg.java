package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfg {
    public static final Uri a(String str, String str2, long j) throws ecge {
        Uri.Builder builderPath = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        if (ecfh.c(str) && !ecfh.b(str)) {
            builderPath.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri uriBuild = builderPath.build();
        ecfh.a(uriBuild);
        return uriBuild;
    }
}
