package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etin extends evsn implements evui {
    public static final etin a;
    private static volatile evuo i;
    public int b;
    public int d;
    public etik f;
    public etip g;
    public etjo h;
    public String c = "";
    public String e = "";

    static {
        etin etinVar = new etin();
        a = etinVar;
        evsn.registerDefaultInstance(etin.class, etinVar);
    }

    private etin() {
        evqs evqsVar = evqs.b;
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
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u001b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဉ\t\u0012င\u0002\u0014ဉ\u001a\u0018ဈ\u0003\u001bဉ\u0018", new Object[]{"b", "c", "f", "d", "h", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new etin();
        }
        if (iOrdinal == 4) {
            return new etil();
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
        synchronized (etin.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
