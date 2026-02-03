package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwf {
    public static final boolean a(String str, boolean z) {
        Iterator itA = fdbd.a(new MediaCodecList(1).getCodecInfos());
        while (itA.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) itA.next();
            if (mediaCodecInfo.isEncoder() == z) {
                Iterator itA2 = fdbd.a(mediaCodecInfo.getSupportedTypes());
                while (itA2.hasNext()) {
                    if (fdbq.f((String) itA2.next(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
