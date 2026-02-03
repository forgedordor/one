package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emju extends evsn implements evui {
    public static final emju a;
    private static volatile evuo l;
    public int b;
    public int c;
    public int d;
    public int e;
    public evtg f = emptyProtobufList();
    public evrj g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        emju emjuVar = new emju();
        a = emjuVar;
        evsn.registerDefaultInstance(emju.class, emjuVar);
    }

    private emju() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emok.a;
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004\u001b\u0005ဉ\u0003\u0006᠌\u0004\u0007᠌\u0006\b᠌\u0007\t᠌\u0005", new Object[]{"b", "c", emjs.a, "d", evsvVar, "e", evsvVar, "f", emjz.class, "g", "h", emjq.a, "j", evsvVar, "k", evsvVar, "i", emjr.a});
        }
        if (iOrdinal == 3) {
            return new emju();
        }
        if (iOrdinal == 4) {
            return new emjp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emju.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
