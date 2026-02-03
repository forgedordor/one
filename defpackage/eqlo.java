package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqlo extends evsn implements evui {
    public static final eqlo a;
    private static volatile evuo g;
    public int b;
    public eqny c;
    public String d = "";
    public int e;
    public String f;

    static {
        eqlo eqloVar = new eqlo();
        a = eqloVar;
        evsn.registerDefaultInstance(eqlo.class, eqloVar);
    }

    private eqlo() {
        emptyIntList();
        evsn.emptyProtobufList();
        this.f = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001Ȉ\u0004\u0004\bȈϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (iOrdinal == 3) {
            return new eqlo();
        }
        if (iOrdinal == 4) {
            return new eqln();
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
        synchronized (eqlo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
