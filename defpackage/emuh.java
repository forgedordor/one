package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emuh extends evsn implements evui {
    public static final emuh a;
    private static volatile evuo j;
    public int b;
    public long c;
    public long d;
    public int e;
    public boolean f;
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();
    public boolean i;

    static {
        emuh emuhVar = new emuh();
        a = emuhVar;
        evsn.registerDefaultInstance(emuh.class, emuhVar);
    }

    private emuh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005\u001b\u0006\u001b\u0007ဇ\u0004", new Object[]{"b", "c", "d", "e", emuq.a, "f", "g", emuu.class, "h", emub.class, "i"});
        }
        if (iOrdinal == 3) {
            return new emuh();
        }
        if (iOrdinal == 4) {
            return new emug();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emuh.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
