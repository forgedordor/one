package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exeg extends evsn implements evui {
    public static final exeg a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public String d = "";
    public evsx e = emptyIntList();

    static {
        exeg exegVar = new exeg();
        a = exegVar;
        evsn.registerDefaultInstance(exeg.class, exegVar);
    }

    private exeg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exeg();
        }
        if (iOrdinal == 4) {
            return new exef();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exeg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
