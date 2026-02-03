package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqu extends evsn implements evui {
    public static final ejqu a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ejqu ejquVar = new ejqu();
        a = ejquVar;
        evsn.registerDefaultInstance(ejqu.class, ejquVar);
    }

    private ejqu() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001b", new Object[]{"b", ejqw.class});
        }
        if (iOrdinal == 3) {
            return new ejqu();
        }
        if (iOrdinal == 4) {
            return new ejqt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejqu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
