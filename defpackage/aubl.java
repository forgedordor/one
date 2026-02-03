package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubl extends evsn implements evui {
    public static final aubl a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aubl aublVar = new aubl();
        a = aublVar;
        evsn.registerDefaultInstance(aubl.class, aublVar);
    }

    private aubl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", aubj.a, "d", aubh.a, "e", aufz.a});
        }
        if (iOrdinal == 3) {
            return new aubl();
        }
        if (iOrdinal == 4) {
            return new aubg();
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
        synchronized (aubl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
