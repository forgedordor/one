package defpackage;

import android.media.AudioRecordingConfiguration;
import android.os.Build;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccr implements ccc {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Queue c = new ConcurrentLinkedQueue();
    public final Executor d;
    public final Object e;
    public ccq f;
    public final ccc g;
    public final int h;
    public final AtomicBoolean i;
    public int j;
    private final int k;

    public ccr(ccc cccVar, cbi cbiVar) {
        if (bpb.a == null) {
            synchronized (bpb.class) {
                if (bpb.a == null) {
                    bpb.a = new bpb();
                }
            }
        }
        this.d = new bpq(bpb.a);
        this.e = new Object();
        this.f = null;
        this.i = new AtomicBoolean(false);
        this.g = cccVar;
        int iC = cbiVar.c();
        this.h = iC;
        int iD = cbiVar.d();
        this.k = iD;
        lcg.b(((long) iC) > 0, "mBytesPerFrame must be greater than 0.");
        lcg.b(((long) iD) > 0, "mSampleRate must be greater than 0.");
        this.j = iC * 1024;
    }

    @Override // defpackage.ccc
    public final ccb a(ByteBuffer byteBuffer) throws InterruptedException {
        int iRemaining;
        c();
        AtomicBoolean atomicBoolean = this.a;
        lcg.d(atomicBoolean.get(), "AudioStream has not been started.");
        final int iRemaining2 = byteBuffer.remaining();
        this.d.execute(new Runnable() { // from class: cco
            @Override // java.lang.Runnable
            public final void run() {
                ccr ccrVar = this.a;
                int i = ccrVar.j;
                int i2 = iRemaining2;
                if (i == i2) {
                    return;
                }
                int i3 = ccrVar.h;
                ccrVar.j = (i2 / i3) * i3;
                bbs.a("BufferedAudioStream", "Update buffer size from " + i + " to " + ccrVar.j);
            }
        });
        ccj ccjVar = new ccj(0, 0L);
        while (true) {
            synchronized (this.e) {
                ccq ccqVar = this.f;
                this.f = null;
                if (ccqVar == null) {
                    ccqVar = (ccq) this.c.poll();
                }
                if (ccqVar != null) {
                    long j = ccqVar.d;
                    ByteBuffer byteBuffer2 = ccqVar.c;
                    int iPosition = byteBuffer2.position();
                    int iPosition2 = byteBuffer.position();
                    if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                        iRemaining = byteBuffer.remaining();
                        ccqVar.d += ccg.a(ccg.b(iRemaining, ccqVar.a), ccqVar.b);
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                        byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
                    } else {
                        iRemaining = byteBuffer2.remaining();
                        byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
                    }
                    byteBuffer2.position(iPosition + iRemaining);
                    ccj ccjVar2 = new ccj(iRemaining, j);
                    if (byteBuffer2.remaining() > 0) {
                        this.f = ccqVar;
                    }
                    ccjVar = ccjVar2;
                }
            }
            if (ccjVar.a > 0 || !atomicBoolean.get() || this.b.get()) {
                break;
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                bbs.g("BufferedAudioStream", "Interruption while waiting for audio data", e);
            }
        }
        return ccjVar;
    }

    @Override // defpackage.ccc
    public final void b() throws cca {
        c();
        if (this.a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: ccm
            @Override // java.lang.Runnable
            public final void run() throws cca, IllegalStateException {
                AudioRecordingConfiguration activeRecordingConfiguration;
                ccr ccrVar = this.a;
                try {
                    ccc cccVar = ccrVar.g;
                    ((ccf) cccVar).e();
                    AtomicBoolean atomicBoolean = ((ccf) cccVar).d;
                    if (!atomicBoolean.getAndSet(true)) {
                        if (ccf.g()) {
                            ccf.d(((ccf) cccVar).a);
                        }
                        ((ccf) cccVar).a.startRecording();
                        boolean z = false;
                        if (((ccf) cccVar).a.getRecordingState() != 3) {
                            atomicBoolean.set(false);
                            throw new cca("Unable to start AudioRecord with state: " + ((ccf) cccVar).a.getRecordingState());
                        }
                        ((ccf) cccVar).h = 0L;
                        ((ccf) cccVar).j = false;
                        ((ccf) cccVar).e.set(null);
                        if (Build.VERSION.SDK_INT >= 29 && (activeRecordingConfiguration = ((ccf) cccVar).a.getActiveRecordingConfiguration()) != null && activeRecordingConfiguration.isClientSilenced()) {
                            z = true;
                        }
                        ((ccf) cccVar).f(z);
                    }
                    if (ccrVar.i.getAndSet(true)) {
                        return;
                    }
                    ccrVar.d();
                } catch (cca e) {
                    throw new RuntimeException(e);
                }
            }
        }, null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.set(false);
            throw new cca(e);
        }
    }

    public final void c() {
        lcg.d(!this.b.get(), "AudioStream has been released.");
    }

    public final void d() {
        if (this.i.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.j);
            ccq ccqVar = new ccq(byteBufferAllocateDirect, this.g.a(byteBufferAllocateDirect), this.h, this.k);
            synchronized (this.e) {
                Queue queue = this.c;
                queue.offer(ccqVar);
                while (queue.size() > 500) {
                    queue.poll();
                    bbs.f("BufferedAudioStream", "Drop audio data due to full of queue.");
                }
            }
            if (this.i.get()) {
                this.d.execute(new Runnable() { // from class: ccn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            }
        }
    }
}
