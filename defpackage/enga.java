package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enga extends evsn implements evui {
    public static final enga a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public evrj f;
    public int g;
    public int h;

    static {
        enga engaVar = new enga();
        a = engaVar;
        evsn.registerDefaultInstance(enga.class, engaVar);
    }

    private enga() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001e\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003e<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", engc.class});
        }
        if (iOrdinal == 3) {
            return new enga();
        }
        if (iOrdinal == 4) {
            return new enfz();
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
        synchronized (enga.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
