package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezso extends evsn implements evui {
    public static final ezso a;
    private static volatile evuo i;
    public int b;
    public ezpp c;
    public ezol d;
    public ezpx f;
    public int h;
    public String e = "";
    public evtg g = emptyProtobufList();

    static {
        ezso ezsoVar = new ezso();
        a = ezsoVar;
        evsn.registerDefaultInstance(ezso.class, ezsoVar);
    }

    private ezso() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005ဉ\u0002\b\f", new Object[]{"b", "c", "d", "g", ezsn.class, "e", "f", "h"});
        }
        if (iOrdinal == 3) {
            return new ezso();
        }
        if (iOrdinal == 4) {
            return new ezsl();
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
        synchronized (ezso.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
