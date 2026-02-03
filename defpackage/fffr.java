package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffr implements ffgb {
    final /* synthetic */ fffs a;
    private final ffgd b = new ffgd();

    public fffr(fffs fffsVar) {
        this.a = fffsVar;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) {
        fffs fffsVar = this.a;
        ReentrantLock reentrantLock = fffsVar.d;
        reentrantLock.lock();
        try {
            if (fffsVar.c) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                ffez ffezVar2 = fffsVar.a;
                if (ffezVar2.b != 0) {
                    long jB = ffezVar2.b(ffezVar, 8192L);
                    fffsVar.e.signalAll();
                    return jB;
                }
                if (fffsVar.b) {
                    reentrantLock.unlock();
                    return -1L;
                }
                this.b.i(fffsVar.e);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fffs fffsVar = this.a;
        ReentrantLock reentrantLock = fffsVar.d;
        reentrantLock.lock();
        try {
            fffsVar.c = true;
            fffsVar.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
