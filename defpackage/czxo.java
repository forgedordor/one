package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxo extends evsn<czxo, czxn> implements evui {
    public static final czxo a;
    private static volatile evuo i;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public boolean f;
    public long g;
    public int h;

    static {
        czxo czxoVar = new czxo();
        a = czxoVar;
        evsn.registerDefaultInstance(czxo.class, czxoVar);
    }

    private czxo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", emgc.a});
        }
        if (iOrdinal == 3) {
            return new czxo();
        }
        if (iOrdinal == 4) {
            return new czxn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (czxo.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
