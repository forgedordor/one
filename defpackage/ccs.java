package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccs implements ccc {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c;
    public Executor d;
    public cbw e;
    private final int f;
    private final int g;
    private byte[] h;

    public ccs(cbi cbiVar) {
        this.f = cbiVar.c();
        this.g = cbiVar.d();
    }

    @Override // defpackage.ccc
    public final ccb a(ByteBuffer byteBuffer) throws InterruptedException {
        c();
        lcg.d(this.a.get(), "AudioStream has not been started.");
        long jRemaining = byteBuffer.remaining();
        int i = this.f;
        long j = i;
        boolean z = j > 0;
        long jB = ccg.b(jRemaining, i);
        lcg.b(z, "bytesPerFrame must be greater than 0.");
        int i2 = (int) (j * jB);
        if (i2 <= 0) {
            return new ccj(0, this.c);
        }
        long jA = this.c + ccg.a(jB, this.g);
        long jNanoTime = jA - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException e) {
                bbs.g("SilentAudioStream", "Ignore interruption", e);
            }
        }
        lcg.c(i2 <= byteBuffer.remaining());
        byte[] bArr = this.h;
        if (bArr == null || bArr.length < i2) {
            this.h = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.h, 0, i2).limit(iPosition + i2).position(iPosition);
        ccj ccjVar = new ccj(i2, this.c);
        this.c = jA;
        return ccjVar;
    }

    @Override // defpackage.ccc
    public final void b() {
        throw null;
    }

    public final void c() {
        lcg.d(!this.b.get(), "AudioStream has been released.");
    }
}
