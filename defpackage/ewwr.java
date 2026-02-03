package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewwr extends evsn implements evui {
    public static final ewwr a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ewwr ewwrVar = new ewwr();
        a = ewwrVar;
        evsn.registerDefaultInstance(ewwr.class, ewwrVar);
    }

    private ewwr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ewws.a});
        }
        if (iOrdinal == 3) {
            return new ewwr();
        }
        if (iOrdinal == 4) {
            return new ewwq();
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
        synchronized (ewwr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
