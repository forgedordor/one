package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exqb extends evsn implements evui {
    public static final exqb a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public exno d;

    static {
        exqb exqbVar = new exqb();
        a = exqbVar;
        evsn.registerDefaultInstance(exqb.class, exqbVar);
    }

    private exqb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exqb();
        }
        if (iOrdinal == 4) {
            return new exqa();
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
        synchronized (exqb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
