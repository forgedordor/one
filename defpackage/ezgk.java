package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgk extends evsn implements evui {
    public static final ezgk a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ezgk ezgkVar = new ezgk();
        a = ezgkVar;
        evsn.registerDefaultInstance(ezgk.class, ezgkVar);
    }

    private ezgk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezgk();
        }
        if (iOrdinal == 4) {
            return new ezgj();
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
        synchronized (ezgk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
