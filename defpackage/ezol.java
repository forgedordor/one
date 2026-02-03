package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezol extends evsn implements evui {
    public static final ezol a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public evqs e = evqs.b;

    static {
        ezol ezolVar = new ezol();
        a = ezolVar;
        evsn.registerDefaultInstance(ezol.class, ezolVar);
    }

    private ezol() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0006\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ezol();
        }
        if (iOrdinal == 4) {
            return new ezok();
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
        synchronized (ezol.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
