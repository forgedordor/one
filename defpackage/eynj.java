package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eynj extends evsn implements evui {
    public static final eynj a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public eypr d;
    public String e;
    public eypd f;
    private int h;

    static {
        eynj eynjVar = new eynj();
        a = eynjVar;
        evsn.registerDefaultInstance(eynj.class, eynjVar);
    }

    private eynj() {
        evqs evqsVar = evqs.b;
        this.e = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0000", new Object[]{"h", "b", "c", "f", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new eynj();
        }
        if (iOrdinal == 4) {
            return new eyni();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eynj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
