package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emws extends evsn implements evui {
    public static final emws a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int e;
    public String d = "";
    public String f = "";

    static {
        emws emwsVar = new emws();
        a = emwsVar;
        evsn.registerDefaultInstance(emws.class, emwsVar);
    }

    private emws() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", emwr.a, "d", "e", emwo.a, "f"});
        }
        if (iOrdinal == 3) {
            return new emws();
        }
        if (iOrdinal == 4) {
            return new emwq();
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
        synchronized (emws.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
