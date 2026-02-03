package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwc extends evsn implements evui {
    public static final elwc a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        elwc elwcVar = new elwc();
        a = elwcVar;
        evsn.registerDefaultInstance(elwc.class, elwcVar);
    }

    private elwc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", enmq.a, "d"});
        }
        if (iOrdinal == 3) {
            return new elwc();
        }
        if (iOrdinal == 4) {
            return new elwb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elwc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
