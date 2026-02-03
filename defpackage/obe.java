package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obe implements oaw {
    public final mau a;
    public final MediaCodec b;
    public final Surface c;
    public final int d;
    public final boolean e;
    public final AtomicBoolean f;
    private final MediaCodec.BufferInfo g;
    private final MediaFormat h;
    private final boolean i;
    private mau j;
    private ByteBuffer k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;

    public obe(Context context, mau mauVar, MediaFormat mediaFormat, String str, boolean z, Surface surface) throws IOException, ocp {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        this.a = mauVar;
        this.h = mediaFormat;
        this.e = z;
        String str2 = mauVar.o;
        mee.f(str2);
        boolean zL = mbw.l(str2);
        this.i = zL;
        this.g = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.f = new AtomicBoolean();
        int i = mjr.a;
        boolean zN = n(mediaFormat);
        Surface surfaceCreateInputSurface = null;
        try {
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (zN) {
                    mee.b(n(mediaCodecCreateByCodecName.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
                }
                if (zL && !z) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                this.b = mediaCodecCreateByCodecName;
                this.c = surfaceCreateInputSurface;
                this.d = mgb.m(context);
            } catch (Exception e) {
                exc = e;
                mff.h(exc);
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw m(mediaFormat, this.i, z, exc, ((exc instanceof IOException) || (exc instanceof MediaCodec.CodecException)) ? true != z ? 4001 : 3001 : exc instanceof IllegalArgumentException ? true != z ? 4003 : 3003 : 1001, str);
            }
        } catch (Exception e2) {
            exc = e2;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02a4 A[LOOP:0: B:129:0x025d->B:143:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mau j(android.media.MediaFormat r23, boolean r24, defpackage.mbt r25) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obe.j(android.media.MediaFormat, boolean, mbt):mau");
    }

    private static ocp m(MediaFormat mediaFormat, boolean z, boolean z2, Exception exc, int i, String str) {
        return ocp.b(exc, i, new oco(mediaFormat.toString(), z, z2, str));
    }

    private static boolean n(MediaFormat mediaFormat) {
        return Build.VERSION.SDK_INT >= 31 && mfi.a(mediaFormat, "color-transfer-request", 0) == 3;
    }

    private final boolean o(boolean z) throws ocp {
        if (this.m >= 0) {
            return true;
        }
        if (this.o) {
            return false;
        }
        try {
            int iDequeueOutputBuffer = this.b.dequeueOutputBuffer(this.g, 0L);
            this.m = iDequeueOutputBuffer;
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    MediaCodec mediaCodec = this.b;
                    boolean z2 = this.e;
                    mau mauVar = this.a;
                    this.j = j(mediaCodec.getOutputFormat(), z2, mauVar.l);
                    if (z2) {
                        if (Objects.equals(mauVar.o, "audio/raw")) {
                            mat matVar = new mat(this.j);
                            matVar.E = mauVar.G;
                            matVar.G = mauVar.I;
                            this.j = new mau(matVar);
                        }
                    } else if (this.i) {
                        this.f.set(true);
                    }
                    long j = this.g.presentationTimeUs;
                    int i = mjr.a;
                }
                return false;
            }
            MediaCodec.BufferInfo bufferInfo = this.g;
            if ((bufferInfo.flags & 4) != 0) {
                this.o = true;
                int i2 = mjr.a;
                if (bufferInfo.size == 0) {
                    i();
                    return false;
                }
                bufferInfo.flags &= -5;
            }
            if ((bufferInfo.flags & 2) != 0) {
                i();
                return false;
            }
            if (z) {
                try {
                    ByteBuffer outputBuffer = this.b.getOutputBuffer(this.m);
                    mee.f(outputBuffer);
                    this.k = outputBuffer;
                    MediaCodec.BufferInfo bufferInfo2 = this.g;
                    outputBuffer.position(bufferInfo2.offset);
                    this.k.limit(bufferInfo2.offset + bufferInfo2.size);
                } catch (RuntimeException e) {
                    mff.h(e);
                    throw k(e);
                }
            }
            return true;
        } catch (RuntimeException e2) {
            mff.h(e2);
            throw k(e2);
        }
    }

    @Override // defpackage.oaw
    public final MediaCodec.BufferInfo a() {
        if (o(false)) {
            return this.g;
        }
        return null;
    }

    @Override // defpackage.oaw
    public final mau b() throws ocp {
        o(false);
        return this.j;
    }

    @Override // defpackage.oaw
    public final String c() {
        return Build.VERSION.SDK_INT >= 29 ? this.b.getCanonicalName() : this.b.getName();
    }

    @Override // defpackage.oaw
    public final ByteBuffer d() {
        if (!o(true)) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.g;
        long j = bufferInfo.presentationTimeUs;
        int i = bufferInfo.size;
        int i2 = mjr.a;
        return this.k;
    }

    @Override // defpackage.oaw
    public final void e(mix mixVar) throws MediaCodec.CryptoException, ocp {
        int iPosition;
        int iRemaining;
        int i;
        int i2;
        int i3;
        long j;
        boolean z = true;
        mee.d(!this.n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = mixVar.d;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = mixVar.d.position();
            iRemaining = mixVar.d.remaining();
        }
        long j2 = mixVar.f;
        if (mixVar.eS()) {
            this.n = true;
            int i4 = mjr.a;
            if (this.e) {
                ByteBuffer byteBuffer2 = mixVar.d;
                if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                    z = false;
                }
                mee.c(z);
                j2 = 0;
                i = 0;
                i3 = 0;
            } else {
                i = iPosition;
                i3 = iRemaining;
            }
            j = j2;
            i2 = 4;
        } else {
            i = iPosition;
            i2 = 0;
            i3 = iRemaining;
            j = j2;
        }
        try {
            this.b.queueInputBuffer(this.l, i, i3, j, i2);
            int i5 = mjr.a;
            this.l = -1;
            mixVar.d = null;
        } catch (RuntimeException e) {
            mff.h(e);
            throw k(e);
        }
    }

    @Override // defpackage.oaw
    public final void f() {
        this.k = null;
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.b.release();
    }

    @Override // defpackage.oaw
    public final boolean g() {
        return this.o && this.m == -1;
    }

    @Override // defpackage.oaw
    public final boolean h(mix mixVar) throws ocp {
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int iDequeueInputBuffer = this.b.dequeueInputBuffer(0L);
                this.l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    mixVar.d = this.b.getInputBuffer(iDequeueInputBuffer);
                    mixVar.eP();
                } catch (RuntimeException e) {
                    mff.h(e);
                    throw k(e);
                }
            } catch (RuntimeException e2) {
                mff.h(e2);
                throw k(e2);
            }
        }
        mee.f(mixVar.d);
        return true;
    }

    @Override // defpackage.oaw
    public final void i() throws ocp {
        l(false, this.g.presentationTimeUs);
    }

    public final ocp k(Exception exc) {
        boolean z = this.e;
        return m(this.h, this.i, z, exc, true != z ? 4002 : 3002, c());
    }

    protected final void l(boolean z, long j) throws ocp {
        this.k = null;
        try {
            if (z) {
                this.b.releaseOutputBuffer(this.m, j * 1000);
                int i = mjr.a;
            } else {
                this.b.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            mff.h(e);
            throw k(e);
        }
    }
}
