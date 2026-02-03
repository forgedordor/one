package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzij extends ThreadLocal {
    final /* synthetic */ dzik a;

    public dzij(dzik dzikVar) {
        this.a = dzikVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        dzil dzilVar = new dzil();
        WeakHashMap weakHashMap = this.a.b;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, dzilVar);
        }
        return dzilVar;
    }
}
