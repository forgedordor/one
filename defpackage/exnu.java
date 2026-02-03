package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exnu extends evsn implements evui {
    public static final exnu a;
    private static volatile evuo j;
    public int d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        exnu exnuVar = new exnu();
        a = exnuVar;
        evsn.registerDefaultInstance(exnu.class, exnuVar);
    }

    private exnu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new exnu();
        }
        if (iOrdinal == 4) {
            return new exnt();
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
        synchronized (exnu.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
