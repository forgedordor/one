package defpackage;

import android.content.Context;
import android.media.AudioManager$AudioRecordingCallback;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cby {
    public final Executor a;
    final ccc d;
    final ccs e;
    public final long f;
    boolean h;
    Executor i;
    cbc j;
    boolean k;
    public long l;
    boolean m;
    boolean n;
    public byte[] o;
    double p;
    public final int r;
    byl t;
    private bpu u;
    private bll v;
    final AtomicReference b = new AtomicReference(null);
    final AtomicBoolean c = new AtomicBoolean(false);
    int s = 1;
    cbb g = cbb.INACTIVE;
    long q = 0;

    public cby(cbi cbiVar, Executor executor, Context context) throws cbz {
        final bpq bpqVar = new bpq(executor);
        this.a = bpqVar;
        this.f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            final ccr ccrVar = new ccr(new ccf(cbiVar, context), cbiVar);
            this.d = ccrVar;
            final cbw cbwVar = new cbw(this);
            lcg.d(!ccrVar.a.get(), "AudioStream can not be started when setCallback.");
            ccrVar.c();
            lcg.b(true, "executor can't be null with non-null callback.");
            ccrVar.d.execute(new Runnable() { // from class: ccl
                @Override // java.lang.Runnable
                public final void run() {
                    ccf ccfVar = (ccf) ccrVar.g;
                    lcg.d(!ccfVar.d.get(), "AudioStream can not be started when setCallback.");
                    ccfVar.e();
                    lcg.b(true, "executor can't be null with non-null callback.");
                    ccfVar.k = cbwVar;
                    Executor executor2 = bpqVar;
                    ccfVar.g = executor2;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = ccfVar.i;
                        if (audioManager$AudioRecordingCallback != null) {
                            ccfVar.a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                        }
                        if (ccfVar.i == null) {
                            ccfVar.i = new cce(ccfVar);
                        }
                        ccfVar.a.registerAudioRecordingCallback(executor2, ccfVar.i);
                    }
                }
            });
            this.e = new ccs(cbiVar);
            this.r = cbiVar.a();
            cbiVar.b();
        } catch (cca | IllegalArgumentException e) {
            throw new cbz(e);
        }
    }

    final void a(final Throwable th) {
        Executor executor = this.i;
        final byl bylVar = this.t;
        if (executor == null || bylVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: cbl
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th2 = th;
                bbs.d("Recorder", "Error occurred after audio source started.", th2);
                if (th2 instanceof cbz) {
                    bylVar.a.accept(th2);
                }
            }
        });
    }

    final void b() {
        Executor executor = this.i;
        final byl bylVar = this.t;
        if (executor == null || bylVar == null) {
            return;
        }
        final boolean z = true;
        if (!this.n && !this.k && !this.m) {
            z = false;
        }
        AtomicReference atomicReference = this.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(boolValueOf), boolValueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: cbp
            @Override // java.lang.Runnable
            public final void run() {
                bzf bzfVar = bylVar.b;
                boolean z2 = bzfVar.S;
                boolean z3 = z;
                if (z2 == z3) {
                    bbs.f("Recorder", a.r(z3, "Audio source silenced transitions to the same state "));
                } else {
                    bzfVar.S = z3;
                    bzfVar.v(true);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(cbc cbcVar) {
        cbc cbcVar2 = this.j;
        cbb cbbVar = null;
        if (cbcVar2 != null) {
            bll bllVar = this.v;
            bllVar.getClass();
            cbcVar2.d(bllVar);
            this.j = null;
            this.v = null;
            this.u = null;
            this.g = cbb.INACTIVE;
            f();
        }
        if (cbcVar != null) {
            this.j = cbcVar;
            this.v = new cbu(this, cbcVar);
            this.u = new cbv(this, cbcVar);
            try {
                ListenableFuture listenableFutureB = cbcVar.b();
                if (listenableFutureB.isDone()) {
                    cbbVar = (cbb) listenableFutureB.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (cbbVar != null) {
                this.g = cbbVar;
                f();
            }
            this.j.c(this.a, this.v);
        }
    }

    final void d() {
        cbc cbcVar = this.j;
        cbcVar.getClass();
        ListenableFuture listenableFutureA = cbcVar.a();
        bpu bpuVar = this.u;
        bpuVar.getClass();
        bqk.i(listenableFutureA, bpuVar, this.a);
    }

    public final void e() {
        if (this.h) {
            this.h = false;
            bbs.a("AudioSource", "stopSendingAudio");
            final ccr ccrVar = (ccr) this.d;
            ccrVar.c();
            if (ccrVar.a.getAndSet(false)) {
                ccrVar.d.execute(new Runnable() { // from class: cck
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalStateException {
                        ccr ccrVar2 = ccrVar;
                        ccrVar2.i.set(false);
                        ccf ccfVar = (ccf) ccrVar2.g;
                        ccfVar.e();
                        if (ccfVar.d.getAndSet(false)) {
                            ccfVar.a.stop();
                            if (ccfVar.a.getRecordingState() != 1) {
                                bbs.f("AudioStreamImpl", "Failed to stop AudioRecord with state: " + ccfVar.a.getRecordingState());
                            }
                            if (ccf.g()) {
                                ccfVar.a.release();
                                ccfVar.a = ccf.c(ccfVar.f, ccfVar.b, null);
                            }
                        }
                        synchronized (ccrVar2.e) {
                            ccrVar2.f = null;
                            ccrVar2.c.clear();
                        }
                    }
                });
            }
        }
    }

    final void f() {
        if (this.s != 2) {
            e();
            return;
        }
        cbb cbbVar = this.g;
        cbb cbbVar2 = cbb.ACTIVE;
        boolean z = cbbVar != cbbVar2;
        Executor executor = this.i;
        byl bylVar = this.t;
        if (executor != null && bylVar != null && this.c.getAndSet(z) != z) {
            executor.execute(new Runnable() { // from class: cbt
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        if (cbbVar != cbbVar2) {
            e();
            return;
        }
        if (this.h) {
            return;
        }
        try {
            bbs.a("AudioSource", "startSendingAudio");
            this.d.b();
            this.k = false;
        } catch (cca e) {
            bbs.g("AudioSource", "Failed to start AudioStream", e);
            this.k = true;
            ccs ccsVar = this.e;
            ccsVar.c();
            if (!ccsVar.a.getAndSet(true)) {
                ccsVar.c = System.nanoTime();
                cbw cbwVar = ccsVar.e;
                Executor executor2 = ccsVar.d;
            }
            this.l = System.nanoTime();
            b();
        }
        this.h = true;
        d();
    }

    final void g(int i) {
        bbs.a("AudioSource", "Transitioning internal state: " + ((Object) cbx.a(this.s)) + " --> " + ((Object) cbx.a(i)));
        this.s = i;
    }
}
