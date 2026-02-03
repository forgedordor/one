package defpackage;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ncj {
    public static int a(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            mat matVar = new mat();
            matVar.c("video/avc");
            mau mauVar = new mau(matVar);
            if (mauVar.o != null) {
                List listG = ncy.g(mauVar, z, false);
                for (int i = 0; i < ((ekoe) listG).c; i++) {
                    if (((nci) listG.get(i)).d != null && (videoCapabilities = ((nci) listG.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return b(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (ncv unused) {
        }
        return 0;
    }

    public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (iy$$ExternalSyntheticApiModelOutline0.m(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
