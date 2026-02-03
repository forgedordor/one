package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auhl extends evsn implements evui {
    public static final auhl a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d = 1;

    static {
        auhl auhlVar = new auhl();
        a = auhlVar;
        evsn.registerDefaultInstance(auhl.class, auhlVar);
    }

    private auhl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", auhj.a});
        }
        if (iOrdinal == 3) {
            return new auhl();
        }
        if (iOrdinal == 4) {
            return new auhi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auhl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
