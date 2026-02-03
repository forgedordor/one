package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrw extends evsn implements evui {
    public static final etrw a;
    private static volatile evuo d;
    public int b;
    public etrq c;

    static {
        etrw etrwVar = new etrw();
        a = etrwVar;
        evsn.registerDefaultInstance(etrw.class, etrwVar);
    }

    private etrw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001LL\u0001\u0000\u0000\u0000Lဉ\u001f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new etrw();
        }
        if (iOrdinal == 4) {
            return new etrv();
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
        synchronized (etrw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
