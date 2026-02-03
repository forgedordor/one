package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdi extends evsn implements evui {
    public static final ezdi a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();

    static {
        ezdi ezdiVar = new ezdi();
        a = ezdiVar;
        evsn.registerDefaultInstance(ezdi.class, ezdiVar);
    }

    private ezdi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", ezct.class});
        }
        if (iOrdinal == 3) {
            return new ezdi();
        }
        if (iOrdinal == 4) {
            return new ezdh();
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
        synchronized (ezdi.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
