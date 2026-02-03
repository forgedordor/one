package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbv implements bpu {
    final /* synthetic */ cbc a;
    final /* synthetic */ cby b;

    public cbv(cby cbyVar, cbc cbcVar) {
        this.b = cbyVar;
        this.a = cbcVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        cby cbyVar = this.b;
        if (cbyVar.j != this.a) {
            return;
        }
        bbs.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th instanceof IllegalStateException) {
            return;
        }
        cbyVar.a(th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgl cglVar = (cgl) obj;
        cby cbyVar = this.b;
        if (!cbyVar.h || cbyVar.j != this.a) {
            cglVar.d();
            return;
        }
        if (cbyVar.k) {
            lcg.c(cbyVar.l > 0);
            if (System.nanoTime() - cbyVar.l >= cbyVar.f) {
                lcg.c(cbyVar.k);
                try {
                    cbyVar.d.b();
                    bbs.a("AudioSource", "Retry start AudioStream succeed");
                    ccs ccsVar = cbyVar.e;
                    ccsVar.c();
                    ccsVar.a.set(false);
                    cbyVar.k = false;
                } catch (cca e) {
                    bbs.g("AudioSource", "Retry start AudioStream failed", e);
                    cbyVar.l = System.nanoTime();
                }
            }
        }
        final cby cbyVar2 = this.b;
        ccc cccVar = cbyVar2.k ? cbyVar2.e : cbyVar2.d;
        cglVar.c();
        ByteBuffer byteBuffer = cglVar.b;
        ccj ccjVar = (ccj) cccVar.a(byteBuffer);
        int i = ccjVar.a;
        if (i > 0) {
            if (cbyVar2.n) {
                byte[] bArr = cbyVar2.o;
                if (bArr == null || bArr.length < i) {
                    cbyVar2.o = new byte[i];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.put(cbyVar2.o, 0, i);
                byteBuffer.limit(byteBuffer.position()).position(iPosition);
            }
            Executor executor = cbyVar2.i;
            if (executor != null) {
                long j = ccjVar.b;
                if (j - cbyVar2.q >= 200) {
                    cbyVar2.q = j;
                    final byl bylVar = cbyVar2.t;
                    if (cbyVar2.r == 2) {
                        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                        double dMax = 0.0d;
                        while (shortBufferAsShortBuffer.hasRemaining()) {
                            dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                        }
                        cbyVar2.p = dMax / 32767.0d;
                        if (bylVar != null) {
                            executor.execute(new Runnable() { // from class: cbs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cby cbyVar3 = cbyVar2;
                                    bylVar.b.Y = cbyVar3.p;
                                }
                            });
                        }
                    }
                }
            }
            byteBuffer.limit(byteBuffer.position() + i);
            cglVar.a(TimeUnit.NANOSECONDS.toMicros(ccjVar.b));
            cglVar.e();
        } else {
            bbs.f("AudioSource", "Unable to read data from AudioStream.");
            cglVar.d();
        }
        cbyVar2.d();
    }
}
