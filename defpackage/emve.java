package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emve extends evsn implements evui {
    public static final emve a;
    private static volatile evuo f;
    public int b;
    public int c;
    public emuh d;
    public evtg e = emptyProtobufList();

    static {
        emve emveVar = new emve();
        a = emveVar;
        evsn.registerDefaultInstance(emve.class, emveVar);
    }

    private emve() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", emuh.class});
        }
        if (iOrdinal == 3) {
            return new emve();
        }
        if (iOrdinal == 4) {
            return new emvd();
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
        synchronized (emve.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
