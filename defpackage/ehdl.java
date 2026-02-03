package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdl extends evsn implements evui {
    public static final ehdl a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ehdl ehdlVar = new ehdl();
        a = ehdlVar;
        evsn.registerDefaultInstance(ehdl.class, ehdlVar);
    }

    private ehdl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\u0006=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new ehdl();
        }
        if (iOrdinal == 4) {
            return new ehdj();
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
        synchronized (ehdl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
