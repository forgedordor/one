package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auev extends evsn implements evui {
    public static final auev a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public boolean d;
    public aufb e;

    static {
        auev auevVar = new auev();
        a = auevVar;
        evsn.registerDefaultInstance(auev.class, auevVar);
    }

    private auev() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new auev();
        }
        if (iOrdinal == 4) {
            return new aueu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auev.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
