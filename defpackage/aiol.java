package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiol extends evsn implements evui {
    public static final aiol a;
    private static volatile evuo f;
    public int b;
    public aiov c;
    public aiox d;
    public evtg e = emptyProtobufList();
    private int g;

    static {
        aiol aiolVar = new aiol();
        a = aiolVar;
        evsn.registerDefaultInstance(aiol.class, aiolVar);
    }

    private aiol() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"g", "b", aioi.a, "c", "d", "e", ainp.class});
        }
        if (iOrdinal == 3) {
            return new aiol();
        }
        if (iOrdinal == 4) {
            return new aiok();
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
        synchronized (aiol.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
