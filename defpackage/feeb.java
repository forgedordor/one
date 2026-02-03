package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feeb extends evsn implements evui {
    public static final feeb a;
    private static volatile evuo i;
    public int b;
    public int e;
    public int h;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        feeb feebVar = new feeb();
        a = feebVar;
        evsn.registerDefaultInstance(feeb.class, feebVar);
    }

    private feeb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", fedz.a, "f", "g", "h", enwq.a});
        }
        if (iOrdinal == 3) {
            return new feeb();
        }
        if (iOrdinal == 4) {
            return new feea();
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
        synchronized (feeb.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
