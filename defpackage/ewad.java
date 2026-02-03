package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewad extends evsn implements evui {
    public static final ewad a;
    private static volatile evuo d;
    public evta b = emptyLongList();
    public evtg c = evsn.emptyProtobufList();

    static {
        ewad ewadVar = new ewad();
        a = ewadVar;
        evsn.registerDefaultInstance(ewad.class, ewadVar);
    }

    private ewad() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewad();
        }
        if (iOrdinal == 4) {
            return new ewac();
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
        synchronized (ewad.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
