package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqke extends evsn implements evui {
    public static final eqke a;
    private static volatile evuo f;
    public int b;
    public eqny c;
    public String d = "";
    public boolean e;

    static {
        eqke eqkeVar = new eqke();
        a = eqkeVar;
        evsn.registerDefaultInstance(eqke.class, eqkeVar);
    }

    private eqke() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new eqke();
        }
        if (iOrdinal == 4) {
            return new eqkd();
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
        synchronized (eqke.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
