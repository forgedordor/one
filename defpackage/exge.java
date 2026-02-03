package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exge extends evsn implements evui {
    public static final exge a;
    private static volatile evuo i;
    public int b;
    public exfk c;
    public exeg d;
    public exek e;
    public exgg f;
    public evtg g = emptyProtobufList();
    public evsx h = emptyIntList();

    static {
        exge exgeVar = new exge();
        a = exgeVar;
        evsn.registerDefaultInstance(exge.class, exgeVar);
    }

    private exge() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,", new Object[]{"b", "c", "d", "e", "f", "g", exgm.class, "h"});
        }
        if (iOrdinal == 3) {
            return new exge();
        }
        if (iOrdinal == 4) {
            return new exgd();
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
        synchronized (exge.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
