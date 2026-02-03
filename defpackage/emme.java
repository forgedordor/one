package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emme extends evsn implements evui {
    public static final emme a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        emme emmeVar = new emme();
        a = emmeVar;
        evsn.registerDefaultInstance(emme.class, emmeVar);
    }

    private emme() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"b", "c", exbq.a});
        }
        if (iOrdinal == 3) {
            return new emme();
        }
        if (iOrdinal == 4) {
            return new emmd();
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
        synchronized (emme.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
