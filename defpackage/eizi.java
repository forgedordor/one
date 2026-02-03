package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizi extends evsn implements evui {
    public static final eizi a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        eizi eiziVar = new eizi();
        a = eiziVar;
        evsn.registerDefaultInstance(eizi.class, eiziVar);
    }

    private eizi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȼ\u0000\u0003:\u0000\u00043\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", evvl.class});
        }
        if (iOrdinal == 3) {
            return new eizi();
        }
        if (iOrdinal == 4) {
            return new eizh();
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
        synchronized (eizi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
