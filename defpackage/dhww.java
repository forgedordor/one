package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhww implements dhwu {
    private final ReentrantReadWriteLock a = new ReentrantReadWriteLock();

    @Override // defpackage.dhwu
    public final Object a(fdae fdaeVar) {
        ReentrantReadWriteLock.ReadLock lock = this.a.readLock();
        lock.lock();
        try {
            return fdaeVar.invoke();
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dhwu
    public final void b(fdae fdaeVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            fdaeVar.invoke();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
