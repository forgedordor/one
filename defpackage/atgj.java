package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgj extends evsn implements evui {
    public static final atgj a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        atgj atgjVar = new atgj();
        a = atgjVar;
        evsn.registerDefaultInstance(atgj.class, atgjVar);
    }

    private atgj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new atgj();
        }
        if (iOrdinal == 4) {
            return new atgi();
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
        synchronized (atgj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
