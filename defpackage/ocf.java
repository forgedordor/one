package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocf {
    public static final /* synthetic */ int a = 0;
    private static final ekby b = new ekby();

    public static int a(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        mee.f(audioCapabilities);
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        int i3 = 0;
        if (supportedSampleRates != null) {
            while (i3 < supportedSampleRates.length) {
                int i4 = supportedSampleRates[i3];
                if (Math.abs(i4 - i) < Math.abs(i2 - i)) {
                    i2 = i4;
                }
                i3++;
            }
            return i2;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length = supportedSampleRateRanges.length;
        while (i3 < length) {
            int iIntValue = ((Integer) supportedSampleRateRanges[i3].clamp(Integer.valueOf(i))).intValue();
            if (Math.abs(iIntValue - i) < Math.abs(i2 - i)) {
                i2 = iIntValue;
            }
            i3++;
        }
        return i2;
    }

    public static Range c(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        mee.f(videoCapabilities);
        return videoCapabilities.getBitrateRange();
    }

    public static Size d(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        mee.f(videoCapabilities);
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iK = k(i, widthAlignment);
        int iK2 = k(i2, heightAlignment);
        if (j(mediaCodecInfo, str, iK, iK2)) {
            return new Size(iK, iK2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iK3 = k(Math.round(i * f), widthAlignment);
            int iK4 = k(Math.round(i2 * f), heightAlignment);
            if (j(mediaCodecInfo, str, iK3, iK4)) {
                return new Size(iK3, iK4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = k((int) Math.round((i * iIntValue) / i2), widthAlignment);
            i2 = k(iIntValue, heightAlignment);
        }
        if (j(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ekgb e(java.lang.String r8, int r9) {
        /*
            int r0 = r8.hashCode()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            switch(r0) {
                case -1851077871: goto L38;
                case -1662735862: goto L2e;
                case -1662541442: goto L24;
                case 1331836730: goto L1a;
                case 1599127257: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L42
            r8 = 0
            goto L43
        L1a:
            java.lang.String r0 = "video/avc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L42
            r8 = r3
            goto L43
        L24:
            java.lang.String r0 = "video/hevc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L42
            r8 = r4
            goto L43
        L2e:
            java.lang.String r0 = "video/av01"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L42
            r8 = r2
            goto L43
        L38:
            java.lang.String r0 = "video/dolby-vision"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L42
            r8 = r1
            goto L43
        L42:
            r8 = -1
        L43:
            r0 = 6
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 7
            if (r8 == 0) goto L90
            if (r8 == r3) goto L83
            if (r8 == r4) goto L71
            if (r8 == r2) goto L5f
            if (r8 == r1) goto L52
            goto L95
        L52:
            if (r9 != r7) goto L95
            r8 = 256(0x100, float:3.59E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            ekgb r8 = defpackage.ekgb.r(r8)
            return r8
        L5f:
            if (r9 != r7) goto L66
            ekgb r8 = defpackage.ekgb.r(r5)
            return r8
        L66:
            if (r9 != r0) goto L95
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            ekgb r8 = defpackage.ekgb.r(r8)
            return r8
        L71:
            if (r9 != r7) goto L78
            ekgb r8 = defpackage.ekgb.r(r5)
            return r8
        L78:
            if (r9 != r0) goto L95
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            ekgb r8 = defpackage.ekgb.r(r8)
            return r8
        L83:
            if (r9 != r7) goto L95
            r8 = 16
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            ekgb r8 = defpackage.ekgb.r(r8)
            return r8
        L90:
            if (r9 == r7) goto L9a
            if (r9 != r0) goto L95
            goto L9a
        L95:
            int r8 = defpackage.ekgb.d
            ekgb r8 = defpackage.ekoe.a
            return r8
        L9a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            ekgb r8 = defpackage.ekgb.s(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocf.e(java.lang.String, int):ekgb");
    }

    public static synchronized ekgb f(String str) {
        l();
        return ekgb.n(b.c(ejuf.c(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb g(String str, mag magVar) {
        if (Build.VERSION.SDK_INT < 33 || magVar == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        ekgb ekgbVarF = f(str);
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < ekgbVarF.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ekgbVarF.get(i2);
            if (!mediaCodecInfo.isAlias() && i(mediaCodecInfo, str, magVar)) {
                ekfwVar.h(mediaCodecInfo);
            }
        }
        return ekfwVar.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, mag magVar) {
        if (!str.equals("video/dolby-vision") && !h(mediaCodecInfo, str, "hdr-editing") && (magVar.e != 7 || Build.VERSION.SDK_INT < 35 || !h(mediaCodecInfo, str, "hlg-editing"))) {
            return false;
        }
        ekgb ekgbVarE = e(str, magVar.e);
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (ekgbVarE.contains(Integer.valueOf(codecProfileLevel.profile))) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        mee.f(videoCapabilities);
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920) {
            if (i2 == 1080) {
                return CamcorderProfile.hasProfile(6);
            }
            return false;
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    private static int k(int i, int i2) {
        return i % 10 == 1 ? (int) (i2 * Math.floor(r4 / r1)) : i2 * Math.round(i / i2);
    }

    private static synchronized void l() {
        ekby ekbyVar = b;
        if (ekbyVar.A()) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        ekbyVar.t(ejuf.c(str), mediaCodecInfo);
                    }
                }
            }
        }
    }
}
