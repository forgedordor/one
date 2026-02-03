package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpp extends evsn implements evui {
    public static final ezpp a;
    private static volatile evuo l;
    public int b;
    public String c = "";
    public evqs d;
    public String e;
    public evqs f;
    public ezoe g;
    public ezol h;
    public fhbc i;
    public int j;
    public ezoj k;

    static {
        ezpp ezppVar = new ezpp();
        a = ezppVar;
        evsn.registerDefaultInstance(ezpp.class, ezppVar);
    }

    private ezpp() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = "";
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001Ë\t\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006\n\u0007ဉ\u0000\t\n\nဉ\u0001\u0010ဉ\u0005Ê\fËဉ\b", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new ezpp();
        }
        if (iOrdinal == 4) {
            return new ezpo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezpp.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
