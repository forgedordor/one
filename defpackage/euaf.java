package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euaf extends evsn implements evui {
    public static final euaf a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        euaf euafVar = new euaf();
        a = euafVar;
        evsn.registerDefaultInstance(euaf.class, euafVar);
    }

    private euaf() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", euac.a});
        }
        if (iOrdinal == 3) {
            return new euaf();
        }
        if (iOrdinal == 4) {
            return new euae();
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
        synchronized (euaf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
