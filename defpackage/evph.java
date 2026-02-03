package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evph extends evsn implements evui {
    public static final evph a;
    public static final evsl b;
    private static volatile evuo c;

    static {
        evph evphVar = new evph();
        a = evphVar;
        evsn.registerDefaultInstance(evph.class, evphVar);
        evpt evptVar = evpt.a;
        evpj evpjVar = evpj.a;
        b = evsn.newSingularGeneratedExtension(evptVar, evpjVar, evpjVar, null, 6, evwh.MESSAGE, evpj.class);
    }

    private evph() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evph();
        }
        if (iOrdinal == 4) {
            return new evpg();
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
        synchronized (evph.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
