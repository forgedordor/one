package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjl extends evsn implements evui {
    public static final ezjl a;
    private static volatile evuo h;
    public int b;
    public ezol c;
    public evtg d = emptyProtobufList();
    public ezjj e;
    public ezpp f;
    public long g;

    static {
        ezjl ezjlVar = new ezjl();
        a = ezjlVar;
        evsn.registerDefaultInstance(ezjl.class, ezjlVar);
    }

    private ezjl() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005\u0002\t\u001c", new Object[]{"b", "c", "e", "f", "g", "d"});
        }
        if (iOrdinal == 3) {
            return new ezjl();
        }
        if (iOrdinal == 4) {
            return new ezjk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezjl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
