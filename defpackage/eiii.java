package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiii extends evsn implements evui {
    public static final eiii a;
    private static volatile evuo k;
    public int b;
    public long c;
    public long d;
    public evtg e = emptyProtobufList();
    public long f;
    public long g;
    public int h;
    public eice i;
    public int j;

    static {
        eiii eiiiVar = new eiii();
        a = eiiiVar;
        evsn.registerDefaultInstance(eiii.class, eiiiVar);
    }

    private eiii() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\nဉ\u0005\u000b᠌\u0006", new Object[]{"b", "c", "d", "e", eies.class, "f", "g", "h", "i", "j", eiig.a});
        }
        if (iOrdinal == 3) {
            return new eiii();
        }
        if (iOrdinal == 4) {
            return new eiif();
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
        synchronized (eiii.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
