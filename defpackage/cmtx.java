package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtx {
    private static final Lock b = new ReentrantLock();
    static final Map a = new HashMap();

    public static cmtw a(String str) {
        Lock lock = b;
        lock.lock();
        try {
            Map map = a;
            cmtw cmtwVar = (cmtw) map.get(str);
            if (cmtwVar == null) {
                cmtwVar = new cmtw(str);
                map.put(str, cmtwVar);
            }
            lock.unlock();
            return cmtwVar;
        } catch (Throwable th) {
            b.unlock();
            throw th;
        }
    }
}
