package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgv extends cgj implements cgt {
    public static final cgs b = new cgs() { // from class: cgu
        @Override // defpackage.cgs
        public final cgt a(String str) {
            return cgv.j(str);
        }
    };
    private final MediaCodecInfo.VideoCapabilities c;

    public cgv(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.a.getVideoCapabilities();
        videoCapabilities.getClass();
        this.c = videoCapabilities;
    }

    public static /* synthetic */ cgt j(String str) throws Throwable {
        MediaCodecInfo codecInfo;
        MediaCodec mediaCodecA;
        try {
            LruCache lruCache = cgw.a;
            synchronized (lruCache) {
                codecInfo = (MediaCodecInfo) lruCache.get(str);
            }
            if (codecInfo == null) {
                try {
                    mediaCodecA = cgw.a(str);
                } catch (Throwable th) {
                    th = th;
                    mediaCodecA = null;
                }
                try {
                    codecInfo = mediaCodecA.getCodecInfo();
                    LruCache lruCache2 = cgw.a;
                    synchronized (lruCache2) {
                        lruCache2.put(str, codecInfo);
                    }
                    if (mediaCodecA != null) {
                        mediaCodecA.release();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (mediaCodecA != null) {
                        mediaCodecA.release();
                    }
                    throw th;
                }
            }
            return che.j(new cgv(codecInfo, str), null);
        } catch (cgm e) {
            bbs.g("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
            return null;
        }
    }

    private static IllegalArgumentException k(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // defpackage.cgt
    public final int a() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.cgt
    public final int b() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.cgt
    public final Range c() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.cgt
    public final Range d() {
        return this.c.getSupportedHeights();
    }

    @Override // defpackage.cgt
    public final Range e(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            throw k(th);
        }
    }

    @Override // defpackage.cgt
    public final Range f() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.cgt
    public final Range g(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            throw k(th);
        }
    }

    @Override // defpackage.cgt
    public final boolean h(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.cgt
    public final /* synthetic */ boolean i(int i, int i2) {
        return cgr.a(this, i, i2);
    }
}
