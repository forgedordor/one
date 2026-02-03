package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhy extends evsn implements evui {
    public static final ejhy a;
    private static volatile evuo e;
    public Object c;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        ejhy ejhyVar = new ejhy();
        a = ejhyVar;
        evsn.registerDefaultInstance(ejhy.class, ejhyVar);
    }

    private ejhy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000", new Object[]{"c", "b", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new ejhy();
        }
        if (iOrdinal == 4) {
            return new ejhx();
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
        synchronized (ejhy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
