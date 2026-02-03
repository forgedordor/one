package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class eyll extends evsn implements evui {
    public static final eyll a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public int d;
    public eylr e;
    public eylr f;
    public eylt g;
    public eylt h;
    public eylv i;
    private ezpp k;

    static {
        eyll eyllVar = new eyll();
        a = eyllVar;
        evsn.registerDefaultInstance(eyll.class, eyllVar);
    }

    private eyll() {
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
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005", new Object[]{"b", "c", "d", "k", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new eyll();
        }
        if (iOrdinal == 4) {
            return new eylk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyll.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
