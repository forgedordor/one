package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwk extends evsn implements evui {
    public static final enwk a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enwk enwkVar = new enwk();
        a = enwkVar;
        evsn.registerDefaultInstance(enwk.class, enwkVar);
    }

    private enwk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", enwe.class, enwg.class});
        }
        if (iOrdinal == 3) {
            return new enwk();
        }
        if (iOrdinal == 4) {
            return new enwi();
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
        synchronized (enwk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
