package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capz extends evsn implements evui {
    public static final capz a;
    private static volatile evuo f;
    public int b;
    public long d;
    public String c = "";
    public evtg e = evsn.emptyProtobufList();

    static {
        capz capzVar = new capz();
        a = capzVar;
        evsn.registerDefaultInstance(capz.class, capzVar);
    }

    private capz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u0002\u0004Ț", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new capz();
        }
        if (iOrdinal == 4) {
            return new capy();
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
        synchronized (capz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
