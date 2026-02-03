package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uti extends evsn implements evui {
    public static final uti a;
    private static volatile evuo e;
    public alwl c;
    private int f;
    public String b = "";
    public String d = "";

    static {
        uti utiVar = new uti();
        a = utiVar;
        evsn.registerDefaultInstance(uti.class, utiVar);
    }

    private uti() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new uti();
        }
        if (iOrdinal == 4) {
            return new uth();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (uti.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
