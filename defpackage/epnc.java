package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnc extends evsn implements evui {
    public static final epnc a;
    private static volatile evuo c;
    public boolean b;

    static {
        epnc epncVar = new epnc();
        a = epncVar;
        evsn.registerDefaultInstance(epnc.class, epncVar);
    }

    private epnc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epnc();
        }
        if (iOrdinal == 4) {
            return new epnb();
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
        synchronized (epnc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
