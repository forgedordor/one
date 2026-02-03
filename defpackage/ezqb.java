package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqb extends evsn implements evui {
    public static final ezqb a;
    private static volatile evuo e;
    public int b;
    public ezol c;
    public evtg d = emptyProtobufList();

    static {
        ezqb ezqbVar = new ezqb();
        a = ezqbVar;
        evsn.registerDefaultInstance(ezqb.class, ezqbVar);
    }

    private ezqb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezqb();
        }
        if (iOrdinal == 4) {
            return new ezqa();
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
        synchronized (ezqb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
