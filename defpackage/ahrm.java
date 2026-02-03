package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrm extends evsn implements evui {
    public static final ahrm a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        ahrm ahrmVar = new ahrm();
        a = ahrmVar;
        evsn.registerDefaultInstance(ahrm.class, ahrmVar);
    }

    private ahrm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\f\u0003\u0000\u0000\u0000\u0001Ȉ\u000bȻ\u0000\f<\u0000", new Object[]{"c", "b", "d", ahre.class});
        }
        if (iOrdinal == 3) {
            return new ahrm();
        }
        if (iOrdinal == 4) {
            return new ahrl();
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
        synchronized (ahrm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
