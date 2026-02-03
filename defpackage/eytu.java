package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytu extends evsn implements evui {
    public static final eytu a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public String d = "";
    public eypd e;
    public eyax f;
    public eyax g;
    public eyax h;
    public boolean i;
    public eypr j;

    static {
        eytu eytuVar = new eytu();
        a = eytuVar;
        evsn.registerDefaultInstance(eytu.class, eytuVar);
    }

    private eytu() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0007ဉ\u0004\t\u0007\nဉ\u0005\u000bȈ", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "d"});
        }
        if (iOrdinal == 3) {
            return new eytu();
        }
        if (iOrdinal == 4) {
            return new eytt();
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
        synchronized (eytu.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
