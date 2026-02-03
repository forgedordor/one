package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutw extends evsn implements evui {
    public static final eutw a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        eutw eutwVar = new eutw();
        a = eutwVar;
        evsn.registerDefaultInstance(eutw.class, eutwVar);
    }

    private eutw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eutw();
        }
        if (iOrdinal == 4) {
            return new eutv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eutw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
