package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctar extends evsn implements evui {
    public static final ctar a;
    private static volatile evuo c;
    public int b;

    static {
        ctar ctarVar = new ctar();
        a = ctarVar;
        evsn.registerDefaultInstance(ctar.class, ctarVar);
    }

    private ctar() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ctar();
        }
        if (iOrdinal == 4) {
            return new ctaq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ctar.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
