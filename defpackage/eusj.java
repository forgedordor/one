package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusj extends evsn implements evui {
    public static final eusj a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();

    static {
        eusj eusjVar = new eusj();
        a = eusjVar;
        evsn.registerDefaultInstance(eusj.class, eusjVar);
    }

    private eusj() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"b", "c", eusi.class});
        }
        if (iOrdinal == 3) {
            return new eusj();
        }
        if (iOrdinal == 4) {
            return new eusg();
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
        synchronized (eusj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
