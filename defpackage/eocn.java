package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocn extends evsn implements evui {
    public static final eocn a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        eocn eocnVar = new eocn();
        a = eocnVar;
        evsn.registerDefaultInstance(eocn.class, eocnVar);
    }

    private eocn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eocm.a});
        }
        if (iOrdinal == 3) {
            return new eocn();
        }
        if (iOrdinal == 4) {
            return new eocl();
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
        synchronized (eocn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
