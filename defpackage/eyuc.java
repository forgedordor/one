package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyuc extends evsn implements evui {
    public static final eyuc a;
    private static volatile evuo d;
    public String b = "";
    public eyty c;
    private int e;

    static {
        eyuc eyucVar = new eyuc();
        a = eyucVar;
        evsn.registerDefaultInstance(eyuc.class, eyucVar);
    }

    private eyuc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyuc();
        }
        if (iOrdinal == 4) {
            return new eyub();
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
        synchronized (eyuc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
