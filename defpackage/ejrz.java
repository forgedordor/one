package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrz extends evsn implements evui {
    public static final ejrz a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();

    static {
        ejrz ejrzVar = new ejrz();
        a = ejrzVar;
        evsn.registerDefaultInstance(ejrz.class, ejrzVar);
    }

    private ejrz() {
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0000\u0002\u0000\u0002\u000b\u0003\u001b\u0005Ț", new Object[]{"b", "c", ejrp.class, "d"});
        }
        if (iOrdinal == 3) {
            return new ejrz();
        }
        if (iOrdinal == 4) {
            return new ejry();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejrz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
