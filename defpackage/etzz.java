package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzz extends evsn implements evui {
    public static final etzz a;
    private static volatile evuo d;
    public int b;
    public etzv c;
    private int e;

    static {
        etzz etzzVar = new etzz();
        a = etzzVar;
        evsn.registerDefaultInstance(etzz.class, etzzVar);
    }

    private etzz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"e", "b", etzw.a, "c"});
        }
        if (iOrdinal == 3) {
            return new etzz();
        }
        if (iOrdinal == 4) {
            return new etzy();
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
        synchronized (etzz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
