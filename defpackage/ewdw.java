package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewdw extends evsn implements evui {
    public static final ewdw a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        ewdw ewdwVar = new ewdw();
        a = ewdwVar;
        evsn.registerDefaultInstance(ewdw.class, ewdwVar);
    }

    private ewdw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0005᠌\u0005", new Object[]{"b", "c", "d", ewdv.a});
        }
        if (iOrdinal == 3) {
            return new ewdw();
        }
        if (iOrdinal == 4) {
            return new ewdu();
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
        synchronized (ewdw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
