package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entc extends evsn implements evui {
    public static final entc a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;
    private boolean g;

    static {
        entc entcVar = new entc();
        a = entcVar;
        evsn.registerDefaultInstance(entc.class, entcVar);
    }

    private entc() {
    }

    public static /* synthetic */ void a(entc entcVar) {
        entcVar.b |= 8;
        entcVar.g = true;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"b", "c", enti.a, "d", entn.a, "e", entj.a, "g"});
        }
        if (iOrdinal == 3) {
            return new entc();
        }
        if (iOrdinal == 4) {
            return new entb();
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
        synchronized (entc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
