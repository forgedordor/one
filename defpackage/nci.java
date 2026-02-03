package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nci {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;

    public nci(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        mee.f(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = mbw.l(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(mgb.c(i, widthAlignment) * widthAlignment, mgb.c(i2, heightAlignment) * heightAlignment);
    }

    private final void j(String str) {
        mff.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + mgb.a + "]");
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public final mpe b(mau mauVar, mau mauVar2) throws NumberFormatException {
        mau mauVar3;
        mau mauVar4;
        int i;
        int i2 = true != Objects.equals(mauVar.o, mauVar2.o) ? 8 : 0;
        if (this.i) {
            if (mauVar.A != mauVar2.A) {
                i2 |= 1024;
            }
            boolean z = (mauVar.v == mauVar2.v && mauVar.w == mauVar2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            mag magVar = mauVar.E;
            if ((!mag.h(magVar) || !mag.h(mauVar2.E)) && !Objects.equals(magVar, mauVar2.E)) {
                i2 |= 2048;
            }
            String str = this.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !mauVar.d(mauVar2)) {
                i2 |= 2;
            }
            int i3 = mauVar.x;
            if (i3 != -1 && (i = mauVar.y) != -1 && i3 == mauVar2.x && i == mauVar2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new mpe(str, mauVar, mauVar2, true != mauVar.d(mauVar2) ? 2 : 3, 0);
            }
            mauVar3 = mauVar;
            mauVar4 = mauVar2;
        } else {
            mauVar3 = mauVar;
            mauVar4 = mauVar2;
            if (mauVar3.G != mauVar4.G) {
                i2 |= 4096;
            }
            if (mauVar3.H != mauVar4.H) {
                i2 |= 8192;
            }
            if (mauVar3.I != mauVar4.I) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                int i4 = ncy.a;
                Pair pairA = mek.a(mauVar3);
                Pair pairA2 = mek.a(mauVar4);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new mpe(this.a, mauVar3, mauVar4, 3, 0);
                    }
                }
            }
            if (!mauVar3.d(mauVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new mpe(this.a, mauVar3, mauVar4, 1, 0);
            }
        }
        return new mpe(this.a, mauVar3, mauVar4, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.mau r19, boolean r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nci.c(mau, boolean):boolean");
    }

    public final boolean d(mau mauVar) {
        return (Objects.equals(mauVar.o, "audio/flac") && mauVar.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(mau mauVar) {
        int i;
        if (!f(mauVar) || !c(mauVar, true) || !d(mauVar)) {
            return false;
        }
        if (this.i) {
            int i2 = mauVar.v;
            if (i2 <= 0 || (i = mauVar.w) <= 0) {
                return true;
            }
            return h(i2, i, mauVar.z);
        }
        int i3 = mauVar.H;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                j(a.g(i3, "sampleRate.support, "));
                return false;
            }
        }
        int i4 = mauVar.G;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                j("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                j("channelCount.aCaps");
                return false;
            }
            String str = this.a;
            String str2 = this.b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                mff.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i5 + "]");
                maxInputChannelCount = i5;
            }
            if (maxInputChannelCount < i4) {
                j(a.g(i4, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean f(mau mauVar) {
        String str = this.b;
        return str.equals(mauVar.o) || str.equals(ncy.b(mauVar));
    }

    public final boolean g(mau mauVar) throws NumberFormatException {
        if (this.i) {
            return this.e;
        }
        int i = ncy.a;
        Pair pairA = mek.a(mauVar);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10, int r11, double r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nci.h(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.a;
    }
}
