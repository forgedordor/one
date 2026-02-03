package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        eifi eifiVar = new eifi(ecem.g());
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = eidc.c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, eifiVar);
        }
        return eifiVar;
    }
}
