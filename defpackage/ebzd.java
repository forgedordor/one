package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebzd implements ebza {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.ebza
    public final Object a(Object obj) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj2 = concurrentHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        concurrentHashMap.putIfAbsent(obj, new Object());
        return concurrentHashMap.get(obj);
    }
}
