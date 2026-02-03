package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsp extends evsn implements evui {
    public static final evsp a;
    private static volatile evuo c;
    public int b;

    static {
        evsp evspVar = new evsp();
        a = evspVar;
        evsn.registerDefaultInstance(evsp.class, evspVar);
    }

    private evsp() {
    }

    public static evsp a(int i) {
        evso evsoVar = (evso) a.createBuilder();
        evsoVar.copyOnWrite();
        ((evsp) evsoVar.instance).b = i;
        return (evsp) evsoVar.build();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new evsp();
        }
        if (iOrdinal == 4) {
            return new evso();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evsp.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
