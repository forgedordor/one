package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class eylp extends evsn implements evui {
    public static final eylp a;
    private static volatile evuo j;
    public int b;
    public eylj f;
    public eylj g;
    public int h;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        eylp eylpVar = new eylp();
        a = eylpVar;
        evsn.registerDefaultInstance(eylp.class, eylpVar);
    }

    private eylp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\t\f\u000bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new eylp();
        }
        if (iOrdinal == 4) {
            return new eylo();
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
        synchronized (eylp.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
