package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogy extends evsn implements evui {
    public static final eogy a;
    private static volatile evuo d;
    public int b;
    public eohi c;
    private int e;

    static {
        eogy eogyVar = new eogy();
        a = eogyVar;
        evsn.registerDefaultInstance(eogy.class, eogyVar);
    }

    private eogy() {
        evsn.emptyProtobufList();
    }

    public static /* synthetic */ void a(eogy eogyVar) {
        eogyVar.b |= 2;
        eogyVar.e = 1;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"b", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new eogy();
        }
        if (iOrdinal == 4) {
            return new eogx();
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
        synchronized (eogy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
