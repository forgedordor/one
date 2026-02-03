package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctav extends evsn implements evui {
    public static final ctav a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ctav ctavVar = new ctav();
        a = ctavVar;
        evsn.registerDefaultInstance(ctav.class, ctavVar);
    }

    private ctav() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cszp.class});
        }
        if (iOrdinal == 3) {
            return new ctav();
        }
        if (iOrdinal == 4) {
            return new ctau();
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
        synchronized (ctav.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
