package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhr extends evsn implements evui {
    public static final ejhr a;
    private static volatile evuo i;
    public ejha b;
    public float c;
    public boolean d;
    public int e;
    public evtg f = emptyProtobufList();
    public evtg g = emptyProtobufList();
    public float h;
    private int j;

    static {
        ejhr ejhrVar = new ejhr();
        a = ejhrVar;
        evsn.registerDefaultInstance(ejhr.class, ejhrVar);
    }

    private ejhr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007ခ\u0004", new Object[]{"j", "b", "c", "d", "e", "f", ejhq.class, "g", ejhn.class, "h"});
        }
        if (iOrdinal == 3) {
            return new ejhr();
        }
        if (iOrdinal == 4) {
            return new ejho();
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
        synchronized (ejhr.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
