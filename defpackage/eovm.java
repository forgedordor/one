package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovm extends evsn implements evui {
    public static final eovm a;
    private static volatile evuo c;
    public int b;

    static {
        eovm eovmVar = new eovm();
        a = eovmVar;
        evsn.registerDefaultInstance(eovm.class, eovmVar);
    }

    private eovm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eovm();
        }
        if (iOrdinal == 4) {
            return new eovl();
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
        synchronized (eovm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
