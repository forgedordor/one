package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausg extends evsn implements evui {
    public static final ausg a;
    private static volatile evuo h;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    static {
        ausg ausgVar = new ausg();
        a = ausgVar;
        evsn.registerDefaultInstance(ausg.class, ausgVar);
    }

    private ausg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ausg();
        }
        if (iOrdinal == 4) {
            return new ausf();
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
        synchronized (ausg.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
