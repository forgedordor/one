package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqk {
    public oxf c;
    public final oqj a = new oqj();
    public final oqj b = new oqj();
    private final ReentrantLock d = new ReentrantLock();

    public final void a(oxf oxfVar, fdat fdatVar) {
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (oxfVar != null) {
                this.c = oxfVar;
            }
            fdatVar.a(this.a, this.b);
        } finally {
            reentrantLock.unlock();
        }
    }
}
