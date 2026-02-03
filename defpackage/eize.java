package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eize extends evsn implements evui {
    public static final eize a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();

    static {
        eize eizeVar = new eize();
        a = eizeVar;
        evsn.registerDefaultInstance(eize.class, eizeVar);
    }

    private eize() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", eizi.class});
        }
        if (iOrdinal == 3) {
            return new eize();
        }
        if (iOrdinal == 4) {
            return new eizd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eize.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
