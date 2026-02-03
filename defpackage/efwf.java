package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwf extends evsn implements evui {
    public static final efwf a;
    private static volatile evuo c;
    public efvv b;
    private int d;

    static {
        efwf efwfVar = new efwf();
        a = efwfVar;
        evsn.registerDefaultInstance(efwf.class, efwfVar);
    }

    private efwf() {
        emptyLongList();
        emptyProtobufList();
        evsn.emptyProtobufList();
        emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0000\u0016ဉ\u0005", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new efwf();
        }
        if (iOrdinal == 4) {
            return new efwc();
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
        synchronized (efwf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
