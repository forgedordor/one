package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezui extends evsn implements evui {
    public static final ezui a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        ezui ezuiVar = new ezui();
        a = ezuiVar;
        evsn.registerDefaultInstance(ezui.class, ezuiVar);
    }

    private ezui() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", ezuh.class, "c", ezuf.class});
        }
        if (iOrdinal == 3) {
            return new ezui();
        }
        if (iOrdinal == 4) {
            return new ezud();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezui.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
