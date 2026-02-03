package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbs implements ncf {
    public final MediaCodec a;
    public final nby b;
    public final ncg c;
    public final ncc d;
    public int e = 0;
    private boolean f;

    public nbs(MediaCodec mediaCodec, HandlerThread handlerThread, ncg ncgVar, ncc nccVar) {
        this.a = mediaCodec;
        this.b = new nby(handlerThread);
        this.c = ncgVar;
        this.d = nccVar;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.ncf
    public final int a() {
        this.c.c();
        nby nbyVar = this.b;
        synchronized (nbyVar.a) {
            nbyVar.b();
            int iA = -1;
            if (nbyVar.c()) {
                return -1;
            }
            csv csvVar = nbyVar.d;
            if (!csvVar.d()) {
                iA = csvVar.a();
            }
            return iA;
        }
    }

    @Override // defpackage.ncf
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        nby nbyVar = this.b;
        synchronized (nbyVar.a) {
            nbyVar.b();
            if (nbyVar.c()) {
                return -1;
            }
            csv csvVar = nbyVar.e;
            if (csvVar.d()) {
                return -1;
            }
            int iA = csvVar.a();
            if (iA >= 0) {
                mee.g(nbyVar.h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) nbyVar.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iA == -2) {
                nbyVar.h = (MediaFormat) nbyVar.g.remove();
                iA = -2;
            }
            return iA;
        }
    }

    @Override // defpackage.ncf
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        nby nbyVar = this.b;
        synchronized (nbyVar.a) {
            mediaFormat = nbyVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
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
        this.c.b();
        this.a.flush();
        final nby nbyVar = this.b;
        synchronized (nbyVar.a) {
            nbyVar.i++;
            Handler handler = nbyVar.c;
            String str = mgb.a;
            handler.post(new Runnable() { // from class: nbx
                @Override // java.lang.Runnable
                public final void run() {
                    nby nbyVar2 = nbyVar;
                    Object obj = nbyVar2.a;
                    synchronized (obj) {
                        if (nbyVar2.j) {
                            return;
                        }
                        long j = nbyVar2.i - 1;
                        nbyVar2.i = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            nbyVar2.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj) {
                            nbyVar2.k = illegalStateException;
                        }
                    }
                }
            });
        }
        this.a.start();
    }

    @Override // defpackage.ncf
    public final void i() {
        ncc nccVar;
        ncc nccVar2;
        try {
            try {
                if (this.e == 1) {
                    ncg ncgVar = this.c;
                    if (((nbw) ncgVar).h) {
                        ((nbw) ncgVar).b();
                        ((nbw) ncgVar).d.quit();
                    }
                    ((nbw) ncgVar).h = false;
                    nby nbyVar = this.b;
                    synchronized (nbyVar.a) {
                        nbyVar.j = true;
                        nbyVar.b.quit();
                        nbyVar.a();
                    }
                }
                this.e = 2;
            } finally {
                if (!this.f) {
                    if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                        this.a.stop();
                    }
                    if (Build.VERSION.SDK_INT >= 35 && (nccVar = this.d) != null) {
                        nccVar.b(this.a);
                    }
                    this.a.release();
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (nccVar2 = this.d) != null) {
                nccVar2.b(this.a);
            }
            this.a.release();
            this.f = true;
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
        nbw nbwVar = (nbw) this.c;
        nbwVar.c();
        Handler handler = nbwVar.e;
        String str = mgb.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.ncf
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.ncf
    public final void n(int i, int i2, long j, int i3) {
        nbw nbwVar = (nbw) this.c;
        nbwVar.c();
        nbv nbvVarA = nbw.a();
        nbvVarA.a(i, i2, j, i3);
        Handler handler = nbwVar.e;
        String str = mgb.a;
        handler.obtainMessage(1, nbvVarA).sendToTarget();
    }

    @Override // defpackage.ncf
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ncf
    public final void p(int i, mit mitVar, long j) {
        nbw nbwVar = (nbw) this.c;
        nbwVar.c();
        nbv nbvVarA = nbw.a();
        nbvVarA.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = nbvVarA.d;
        cryptoInfo.numSubSamples = mitVar.f;
        cryptoInfo.numBytesOfClearData = nbw.e(mitVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = nbw.e(mitVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrD = nbw.d(mitVar.b, cryptoInfo.key);
        mee.f(bArrD);
        cryptoInfo.key = bArrD;
        byte[] bArrD2 = nbw.d(mitVar.a, cryptoInfo.iv);
        mee.f(bArrD2);
        cryptoInfo.iv = bArrD2;
        cryptoInfo.mode = mitVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(mitVar.g, mitVar.h));
        Handler handler = nbwVar.e;
        String str = mgb.a;
        handler.obtainMessage(2, nbvVarA).sendToTarget();
    }

    @Override // defpackage.ncf
    public final void q() {
        synchronized (this.b.a) {
        }
    }
}
