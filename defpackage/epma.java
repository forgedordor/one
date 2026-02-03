package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epma extends evsn implements evui {
    public static final epma a;
    private static volatile evuo g;
    public int c;
    public int d;
    public String b = "";
    public String e = "";
    public String f = "";

    static {
        epma epmaVar = new epma();
        a = epmaVar;
        evsn.registerDefaultInstance(epma.class, epmaVar);
    }

    private epma() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new epma();
        }
        if (iOrdinal == 4) {
            return new eplz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epma.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
