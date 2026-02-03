package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkh extends evsn implements evui {
    public static final erkh a;
    private static volatile evuo d;
    public int b;
    public erkj c;

    static {
        erkh erkhVar = new erkh();
        a = erkhVar;
        evsn.registerDefaultInstance(erkh.class, erkhVar);
    }

    private erkh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erkh();
        }
        if (iOrdinal == 4) {
            return new erkg();
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
        synchronized (erkh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
