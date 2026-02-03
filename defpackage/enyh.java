package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyh extends evsn implements evui {
    public static final enyh a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public boolean g;

    static {
        enyh enyhVar = new enyh();
        a = enyhVar;
        evsn.registerDefaultInstance(enyh.class, enyhVar);
    }

    private enyh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", enyg.a, "d", "e", "f", enwq.a, "g"});
        }
        if (iOrdinal == 3) {
            return new enyh();
        }
        if (iOrdinal == 4) {
            return new enyf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enyh.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
