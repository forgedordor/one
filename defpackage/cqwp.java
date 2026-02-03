package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwp {
    public final MediaExtractor a;
    public final cqwm b;
    public final cqwq c;
    public final cqwo d;
    public final cqwo e;
    public int f;
    public boolean g;
    public MediaFormat h;
    public int i;
    public int j;
    public long k;
    public long l;
    public boolean m;
    public int n;
    public int o;

    public cqwp(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2) {
        this(mediaExtractor, mediaCodec, mediaCodec2, null, null);
        this.n = 0;
        this.o = 0;
    }

    public final void a(MediaMuxer mediaMuxer) {
        MediaFormat mediaFormat = this.h;
        if (mediaFormat != null) {
            this.f = mediaMuxer.addTrack(mediaFormat);
            ((eksl) cqxo.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "addTrackToMuxer", 88, "MediaTrackPipeline.java")).w("Added track %s: %s", this.f, this.h);
        }
        this.m = true;
    }

    public final void b(MediaMuxer mediaMuxer) throws MediaCodec.CryptoException {
        MediaCodec mediaCodec;
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBuffer;
        int i;
        if (this.e.e && (i = this.j) >= 0) {
            this.d.a.queueInputBuffer(i, 0, 0, 0L, 4);
            this.j = -1;
            ((eksl) cqxo.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 311, "MediaTrackPipeline.java")).r("track %s signaling EOS", this.f);
        }
        cqwo cqwoVar = this.d;
        if (cqwoVar.e) {
            return;
        }
        if ((this.h == null || this.m) && (iDequeueOutputBuffer = (mediaCodec = cqwoVar.a).dequeueOutputBuffer((bufferInfo = cqwoVar.b), 10000L)) != -1) {
            if (iDequeueOutputBuffer == -3) {
                cqwoVar.d = mediaCodec.getOutputBuffers();
                return;
            }
            if (iDequeueOutputBuffer == -2) {
                ((eksl) cqxo.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 321, "MediaTrackPipeline.java")).w("mux: track %s output format changed to %s", this.f, mediaCodec.getOutputFormat());
                this.h = mediaCodec.getOutputFormat();
                return;
            }
            ByteBuffer byteBuffer = cqwoVar.d[iDequeueOutputBuffer];
            if ((bufferInfo.flags & 2) != 0) {
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return;
            }
            if (bufferInfo.size != 0) {
                long j = bufferInfo.presentationTimeUs;
                long j2 = this.l;
                if (j < j2) {
                    bufferInfo.presentationTimeUs = j2 + 1;
                }
                mediaMuxer.writeSampleData(this.f, byteBuffer, bufferInfo);
                this.l = bufferInfo.presentationTimeUs;
                ((eksl) cqxo.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "mux", 340, "MediaTrackPipeline.java")).v("track %s mux: %s s", this.f, TimeUnit.MICROSECONDS.toSeconds(this.l));
            }
            if ((bufferInfo.flags & 4) != 0) {
                cqwoVar.e = true;
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
    }

    public final boolean c() {
        return this.e.e;
    }

    public final boolean d() {
        return this.d.e;
    }

    public final boolean e() {
        if (this.m) {
            return false;
        }
        return this.h != null || this.a == null;
    }

    public cqwp(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, cqwm cqwmVar, cqwq cqwqVar) {
        this.f = -1;
        this.h = null;
        this.i = -1;
        this.j = -1;
        this.k = -1L;
        this.l = -1L;
        this.e = new cqwo(mediaCodec);
        this.d = new cqwo(mediaCodec2);
        this.a = mediaExtractor;
        this.b = cqwmVar;
        this.c = cqwqVar;
        this.g = mediaExtractor == null;
    }
}
