package defpackage;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffq implements fffz {
    final /* synthetic */ fffs a;
    private final ffgd b = new ffgd();

    public fffq(fffs fffsVar) {
        this.a = fffsVar;
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fffs fffsVar = this.a;
        ReentrantLock reentrantLock = fffsVar.d;
        reentrantLock.lock();
        try {
            if (fffsVar.b) {
                return;
            }
            if (fffsVar.c && fffsVar.a.b > 0) {
                throw new IOException("source is closed");
            }
            fffsVar.b = true;
            fffsVar.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() {
        fffs fffsVar = this.a;
        ReentrantLock reentrantLock = fffsVar.d;
        reentrantLock.lock();
        try {
            if (fffsVar.b) {
                throw new IllegalStateException("closed");
            }
            if (fffsVar.c && fffsVar.a.b > 0) {
                throw new IOException("source is closed");
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        fffs fffsVar = this.a;
        ReentrantLock reentrantLock = fffsVar.d;
        reentrantLock.lock();
        try {
            if (fffsVar.b) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                if (fffsVar.c) {
                    throw new IOException("source is closed");
                }
                ffez ffezVar2 = fffsVar.a;
                long j2 = 8192 - ffezVar2.b;
                if (j2 == 0) {
                    this.b.i(fffsVar.e);
                } else {
                    long jMin = Math.min(j2, j);
                    ffezVar2.hO(ffezVar, jMin);
                    j -= jMin;
                    fffsVar.e.signalAll();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
