package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evat extends evsn implements evui {
    public static final evat a;
    public static final evsl b;
    private static volatile evuo g;
    public int c;
    public euzs d;
    public String e = "en";
    public evav f;

    static {
        evat evatVar = new evat();
        a = evatVar;
        evsn.registerDefaultInstance(evat.class, evatVar);
        b = evsn.newSingularGeneratedExtension(erxu.a, evatVar, evatVar, null, 458105758, evwh.MESSAGE, evat.class);
    }

    private evat() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evat();
        }
        if (iOrdinal == 4) {
            return new evas();
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
        synchronized (evat.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
