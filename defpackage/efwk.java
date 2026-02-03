package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwk extends evsn implements evui {
    public static final evsy a = new efwi();
    public static final efwk b;
    private static volatile evuo e;
    public String c = "";
    public evsx d = emptyIntList();
    private int f;

    static {
        efwk efwkVar = new efwk();
        b = efwkVar;
        evsn.registerDefaultInstance(efwk.class, efwkVar);
    }

    private efwk() {
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"f", "c", "d", efwd.a});
        }
        if (iOrdinal == 3) {
            return new efwk();
        }
        if (iOrdinal == 4) {
            return new efwj();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (efwk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
