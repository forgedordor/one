package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eazg {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final eazh a(int i, long j) {
        return (eazh) a.get(new eaze(i, j));
    }

    public static final boolean b(int i, long j) {
        return a.containsKey(new eaze(i, j));
    }
}
