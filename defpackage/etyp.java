package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyp extends evsn implements evui {
    public static final etyp a;
    private static volatile evuo i;
    public int b;
    public int d;
    public etyb e;
    public etyb f;
    public etyb g;
    public String c = "";
    public String h = "";

    static {
        etyp etypVar = new etyp();
        a = etypVar;
        evsn.registerDefaultInstance(etyp.class, etypVar);
    }

    private etyp() {
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
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u000bဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
        }
        if (iOrdinal == 3) {
            return new etyp();
        }
        if (iOrdinal == 4) {
            return new etyo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etyp.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
