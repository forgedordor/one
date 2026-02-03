package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncz implements ncf {
    private final MediaCodec a;
    private final ncc b;

    public ncz(MediaCodec mediaCodec, ncc nccVar) {
        this.a = mediaCodec;
        this.b = nccVar;
        if (Build.VERSION.SDK_INT < 35 || nccVar == null) {
            return;
        }
        nccVar.a(mediaCodec);
    }

    @Override // defpackage.ncf
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.ncf
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.ncf
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.ncf
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.ncf
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.ncf
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.ncf
    public final void h() {
        this.a.flush();
    }

    @Override // defpackage.ncf
    public final void i() {
        ncc nccVar;
        ncc nccVar2;
        try {
            if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                this.a.stop();
            }
            if (Build.VERSION.SDK_INT >= 35 && (nccVar2 = this.b) != null) {
                nccVar2.b(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (nccVar = this.b) != null) {
                nccVar.b(this.a);
            }
            this.a.release();
            throw th;
        }
    }

    @Override // defpackage.ncf
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ncf
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.ncf
    public final void l(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.ncf
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.ncf
    public final void n(int i, int i2, long j, int i3) throws MediaCodec.CryptoException {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ncf
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ncf
    public final void p(int i, mit mitVar, long j) throws MediaCodec.CryptoException {
        this.a.queueSecureInputBuffer(i, 0, mitVar.i, j, 0);
    }

    @Override // defpackage.ncf
    public final /* synthetic */ void q() {
    }
}
