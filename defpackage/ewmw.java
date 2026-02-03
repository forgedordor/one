package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewmw extends evsn implements evui {
    public static final ewmw a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    static {
        ewmw ewmwVar = new ewmw();
        a = ewmwVar;
        evsn.registerDefaultInstance(ewmw.class, ewmwVar);
    }

    private ewmw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"b", "c", ewmt.a, "d", ewmu.a, "e", ewmr.a, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ewmw();
        }
        if (iOrdinal == 4) {
            return new ewmq();
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
        synchronized (ewmw.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
