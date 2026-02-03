package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cidf extends evsn implements evui {
    public static final cidf a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        cidf cidfVar = new cidf();
        a = cidfVar;
        evsn.registerDefaultInstance(cidf.class, cidfVar);
    }

    private cidf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\n\u000e\u0005\u0000\u0000\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", cidn.class, cidi.class, cidl.class, cidp.class, cidr.class});
        }
        if (iOrdinal == 3) {
            return new cidf();
        }
        if (iOrdinal == 4) {
            return new cide();
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
        synchronized (cidf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
