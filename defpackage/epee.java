package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epee extends evsn implements evui {
    public static final epee a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();
    public eoxc e;
    public epcy f;
    public eovu g;
    public eovs h;
    public eovq i;
    public int j;
    private boolean l;

    static {
        epee epeeVar = new epee();
        a = epeeVar;
        evsn.registerDefaultInstance(epee.class, epeeVar);
    }

    private epee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0007\u0007\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000b\u0004", new Object[]{"b", "d", epew.class, "e", "f", "c", "l", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new epee();
        }
        if (iOrdinal == 4) {
            return new eped();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epee.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
