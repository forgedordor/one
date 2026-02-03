package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzv extends evsn implements evui {
    public static final etzv a;
    private static volatile evuo c;
    public etzt b;
    private int d;

    static {
        etzv etzvVar = new etzv();
        a = etzvVar;
        evsn.registerDefaultInstance(etzv.class, etzvVar);
    }

    private etzv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new etzv();
        }
        if (iOrdinal == 4) {
            return new etzu();
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
        synchronized (etzv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
