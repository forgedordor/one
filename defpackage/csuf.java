package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuf extends evsn implements evui {
    public static final csuf a;
    private static volatile evuo g;
    public boolean b;
    public boolean c;
    public evub f = evub.a;
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();

    static {
        csuf csufVar = new csuf();
        a = csufVar;
        evsn.registerDefaultInstance(csuf.class, csufVar);
    }

    private csuf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0002\u0000\u0001\u0007\u0002\u0007\u0003\u001b\u0004\u001b\u00052", new Object[]{"b", "c", "d", evvp.class, "e", evvp.class, "f", csue.a});
        }
        if (iOrdinal == 3) {
            return new csuf();
        }
        if (iOrdinal == 4) {
            return new csud();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (csuf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
