package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugk extends evsn implements evui {
    public static final eugk a;
    private static volatile evuo h;
    public int b;
    public evtg c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        eugk eugkVar = new eugk();
        a = eugkVar;
        evsn.registerDefaultInstance(eugk.class, eugkVar);
    }

    private eugk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"b", "c", eugj.class, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eugk();
        }
        if (iOrdinal == 4) {
            return new eugh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eugk.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
