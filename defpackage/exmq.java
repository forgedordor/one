package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmq extends evsn implements evui {
    public static final exmq a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public exjh e;
    public exjh f;
    public float g;
    public long h;

    static {
        exmq exmqVar = new exmq();
        a = exmqVar;
        evsn.registerDefaultInstance(exmq.class, exmqVar);
    }

    private exmq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0001\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new exmq();
        }
        if (iOrdinal == 4) {
            return new exmp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exmq.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
