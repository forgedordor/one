package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewik extends evsn implements evui {
    public static final ewik a;
    private static volatile evuo e;
    public int b;
    public long c;
    public int d;

    static {
        ewik ewikVar = new ewik();
        a = ewikVar;
        evsn.registerDefaultInstance(ewik.class, ewikVar);
    }

    private ewik() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ewij.a});
        }
        if (iOrdinal == 3) {
            return new ewik();
        }
        if (iOrdinal == 4) {
            return new ewii();
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
        synchronized (ewik.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
