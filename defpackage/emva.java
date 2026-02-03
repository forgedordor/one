package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emva extends evsn implements evui {
    public static final emva a;
    private static volatile evuo g;
    public int b;
    public emuw d;
    public emuw e;
    public String c = "";
    public evtg f = emptyProtobufList();

    static {
        emva emvaVar = new emva();
        a = emvaVar;
        evsn.registerDefaultInstance(emva.class, emvaVar);
    }

    private emva() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", emvc.class});
        }
        if (iOrdinal == 3) {
            return new emva();
        }
        if (iOrdinal == 4) {
            return new emuz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emva.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
