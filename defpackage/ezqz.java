package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqz extends evsn implements evui {
    public static final ezqz a;
    private static volatile evuo h;
    public int b;
    public ezpp c;
    public ezol d;
    public ezoz e;
    public evtg f = emptyProtobufList();
    public int g;

    static {
        ezqz ezqzVar = new ezqz();
        a = ezqzVar;
        evsn.registerDefaultInstance(ezqz.class, ezqzVar);
    }

    private ezqz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0007\f", new Object[]{"b", "c", "d", "e", "f", ezol.class, "g"});
        }
        if (iOrdinal == 3) {
            return new ezqz();
        }
        if (iOrdinal == 4) {
            return new ezqy();
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
        synchronized (ezqz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
