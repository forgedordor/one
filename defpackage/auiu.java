package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auiu extends evsn implements evui {
    public static final auiu a;
    private static volatile evuo f;
    public int b;
    public aubq c;
    public int d;
    public aufb e;

    static {
        auiu auiuVar = new auiu();
        a = auiuVar;
        evsn.registerDefaultInstance(auiu.class, auiuVar);
    }

    private auiu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", auei.a, "e"});
        }
        if (iOrdinal == 3) {
            return new auiu();
        }
        if (iOrdinal == 4) {
            return new auit();
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
        synchronized (auiu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
