package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiju extends evsn implements evui {
    public static final aiju a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        aiju aijuVar = new aiju();
        a = aijuVar;
        evsn.registerDefaultInstance(aiju.class, aijuVar);
    }

    private aiju() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiju();
        }
        if (iOrdinal == 4) {
            return new aijt();
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
        synchronized (aiju.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
