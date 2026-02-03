package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfi {
    public static int a(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static MediaFormat b(mau mauVar) {
        int i;
        int i2;
        MediaFormat mediaFormat = new MediaFormat();
        d(mediaFormat, "bitrate", mauVar.j);
        d(mediaFormat, "max-bitrate", mauVar.i);
        d(mediaFormat, "channel-count", mauVar.G);
        c(mediaFormat, mauVar.E);
        e(mediaFormat, "mime", mauVar.o);
        e(mediaFormat, "codecs-string", mauVar.k);
        g(mediaFormat, mauVar.z);
        d(mediaFormat, "width", mauVar.v);
        d(mediaFormat, "height", mauVar.w);
        f(mediaFormat, mauVar.r);
        int i3 = mauVar.I;
        if (i3 != -1) {
            d(mediaFormat, "exo-pcm-encoding-int", i3);
            if (i3 == 0) {
                i2 = 0;
            } else if (i3 != 2) {
                i2 = 3;
                if (i3 != 3) {
                    i2 = 4;
                    if (i3 != 4) {
                        i2 = 21;
                        if (i3 != 21) {
                            i2 = 22;
                            if (i3 == 22) {
                            }
                        }
                    }
                }
            } else {
                i2 = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i2);
        }
        e(mediaFormat, "language", mauVar.d);
        d(mediaFormat, "max-input-size", mauVar.p);
        d(mediaFormat, "sample-rate", mauVar.H);
        d(mediaFormat, "caption-service-number", mauVar.L);
        mediaFormat.setInteger("rotation-degrees", mauVar.A);
        int i4 = mauVar.e;
        h(mediaFormat, "is-autoselect", 0);
        h(mediaFormat, "is-default", i4 & 1);
        h(mediaFormat, "is-forced-subtitle", i4 & 2);
        mediaFormat.setInteger("encoder-delay", mauVar.J);
        mediaFormat.setInteger("encoder-padding", mauVar.K);
        float f = mauVar.B;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f);
        int i5 = 1073741824;
        if (f < 1.0f) {
            i5 = (int) (f * 1.07374182E9f);
            i = 1073741824;
        } else if (f > 1.0f) {
            i = (int) (1.07374182E9f / f);
        } else {
            i5 = 1;
            i = 1;
        }
        mediaFormat.setInteger("sar-width", i5);
        mediaFormat.setInteger("sar-height", i);
        String str = mauVar.a;
        if (str != null) {
            mediaFormat.setInteger("track-id", Integer.parseInt(str));
        }
        return mediaFormat;
    }

    public static void c(MediaFormat mediaFormat, mag magVar) {
        if (magVar != null) {
            d(mediaFormat, "color-transfer", magVar.e);
            d(mediaFormat, "color-standard", magVar.c);
            d(mediaFormat, "color-range", magVar.d);
            byte[] bArr = magVar.f;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void e(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void f(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.g(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void g(MediaFormat mediaFormat, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
    }

    private static void h(MediaFormat mediaFormat, String str, int i) {
        mediaFormat.setInteger(str, i != 0 ? 1 : 0);
    }
}
